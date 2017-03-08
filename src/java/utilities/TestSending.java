/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author bajuna
 */
/* Make sure the downloaded jar file is in the classpath or has been added to 
   referenced libraries if you are using an SDK like eclipse or netbeans*/

public class TestSending {

    public static void main(String[] args_) {
        // Specify your login credentials
        String username = "newtonajuna";
        String apiKey = "0e941114ffd27b4cac7dfc24908aac57f3025d3bcb7810dc0ff45f1307a31c4d";

        // NOTE: If connecting to the sandbox, please use your sandbox login credentials
        // Specify the numbers that you want to send to in a comma-separated list
        // Please ensure you include the country code (+256 for Uganda in this case)
        String recipients = "+256782760115";

        // And of course we want our recipients to know what we really do
        String message = "We are lumberjacks. We code all day and sleep all night";

        // Create a new instance of our awesome gateway class
        AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);

        // NOTE: If connecting to the sandbox, please add the sandbox flag to the constructor:
        /**
         * ***********************************************************************************
         ****SANDBOX**** $gateway = new AfricasTalkingGateway(username, apiKey,
         * "sandbox");
			*************************************************************************************
         */
        // Thats it, hit send and we'll take care of the rest. Any errors will
        // be captured in the Exception class below
        try {
            JSONArray results = gateway.sendMessage(recipients, message);

            for (int i = 0; i < results.length(); ++i) {
                JSONObject result = results.getJSONObject(i);
                System.out.print(result.getString("status") + ","); // status is either "Success" or "error message"
                System.out.print(result.getString("number") + ",");
                System.out.print(result.getString("messageId") + ",");
                System.out.println(result.getString("cost"));
            }
        } catch (Exception e) {
            System.out.println("Encountered an error while sending " + e.getMessage());
        }

    }
}
