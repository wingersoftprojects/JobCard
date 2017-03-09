/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author bajuna
 */
// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {
    // Find your Account Sid and Token at twilio.com/user/account

    public static final String ACCOUNT_SID = "ACdcd67f114d60afec1d7d64a198854f10";
    public static final String AUTH_TOKEN = "7097b2504ebc10a698f3fe33446d3628";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber("+256782760115"),new PhoneNumber("+15054314471"),"This is my test SMS?").create();

    System.out.println(message.getSid());

    
    }
}
