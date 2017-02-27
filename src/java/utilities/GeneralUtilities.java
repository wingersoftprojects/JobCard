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

}
