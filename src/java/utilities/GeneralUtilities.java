/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import models.JobCardPersistentManager;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.json.JSONArray;
import org.json.JSONObject;
import org.orm.PersistentException;

/**
 *
 * @author bajuna
 */
@ManagedBean
@SessionScoped
public class GeneralUtilities implements Serializable {

    public static void clearsession() {
        try {
            JobCardPersistentManager.instance().disposePersistentManager();
        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void flushandclearsession() {
        try {
            JobCardPersistentManager.instance().getSession().flush();
            JobCardPersistentManager.instance().getSession().clear();
            JobCardPersistentManager.instance().getSession().getSessionFactory().getCache().evictDefaultQueryRegion();
            JobCardPersistentManager.instance().getSession().getSessionFactory().getCache().evictQueryRegions();
        } catch (PersistentException ex) {
            Logger.getLogger(GeneralUtilities.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SimpleDateFormat simpleDateFormat() {
        return new SimpleDateFormat("ddMMyyyyHmmss");
    }

    public static SimpleDateFormat simpleDateFormatDate() {
        return new SimpleDateFormat("yyyy-MM-ddd");
    }

    public static Integer getCurrentYear() {
        int current_year = 0;
        current_year = Calendar.getInstance().get(Calendar.YEAR);
        return current_year;
    }

    public static Integer getCurrentMonth() {
        int current_month = 0;
        current_month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        return current_month;
    }

    public String checkdoctype(String docurl) {
        if (docurl.toLowerCase().contains(".jpg") || docurl.toLowerCase().contains(".png") || docurl.toLowerCase().contains(".jpeg") || docurl.toLowerCase().contains(".gif")) {
            return "image";
        } else if (docurl.toLowerCase().contains(".pdf") || docurl.toLowerCase().contains(".PDF")) {
            return "pdf";
        } else if (docurl.toLowerCase().contains(".doc") || docurl.toLowerCase().contains(".docx")) {
            return "word";
        } else if (docurl.toLowerCase().contains(".xls") || docurl.toLowerCase().contains(".xlsx")) {
            return "excel";
        } else {
            return "";
        }
    }
    private final String currencyformat = "###,##0.0";

    public String getCurrencyformat() {
        return currencyformat;
    }

    public String convertYesNo(int value) {
        switch (value) {
            case 0:
                return "No";
            case 1:
                return "Yes";
            default:
                return "";
        }
    }

    public String colorYesNo(int Allow) {
        if (Allow == 1) {
            return "blue";
        } else {
            return "red";
        }
    }

    private void error(SQLException se) {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(se.getMessage().concat("\n").concat(se.getLocalizedMessage()), se.getMessage().concat("\n").concat(se.getLocalizedMessage())));
    }

    private void execute_success() {
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Completed successfully", "Completed successfully"));
    }

    public void send_sms(String recipients, String message) throws Exception {
        // Specify your login credentials
        String username = "newtonajuna";
        String apiKey = "0e941114ffd27b4cac7dfc24908aac57f3025d3bcb7810dc0ff45f1307a31c4d";

        // NOTE: If connecting to the sandbox, please use your sandbox login credentials
        // Specify the numbers that you want to send to in a comma-separated list
        // Please ensure you include the country code (+256 for Uganda in this case)
        //String recipients = "+256782760115";
        // And of course we want our recipients to know what we really do
        //String message = "We are lumberjacks. We code all day and sleep all night";
        // Create a new instance of our awesome gateway class
        AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);

        // NOTE: If connecting to the sandbox, please add the sandbox flag to the constructor:
        /**
         * ***********************************************************************************
         ****SANDBOX**** $gateway = new AfricasTalkingGateway(username, apiKey,
         * "sandbox");
         * ************************************************************************************
         */
        // Thats it, hit send and we'll take care of the rest. Any errors will
        // be captured in the Exception class below
        JSONArray results = gateway.sendMessage(recipients, message);

        for (int i = 0; i < results.length(); ++i) {
            JSONObject result = results.getJSONObject(i);
            System.out.print(result.getString("status") + ","); // status is either "Success" or "error message"
            System.out.print(result.getString("number") + ",");
            System.out.print(result.getString("messageId") + ",");
            System.out.println(result.getString("cost"));
        }
    }

}
