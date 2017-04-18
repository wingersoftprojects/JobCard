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
import beans.Company_settingBean;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.*;
import resources.Image;

public class SendMail {

    public static void main(String[] args) {

        String host = "mail.wingersoft.co.ug";
        final String user = "info@wingersoft.co.ug";//change accordingly  
        final String password = "Rhythm123";//change accordingly  

        String to = "newtonajuna@gmail.com";//change accordingly  

        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "false");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "mail.wingersoft.co.ug");
        props.put("mail.smtp.port", "26");
//        props.put("mail.smtp.host", host);
//        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });

        //Compose the message  
        try {
            Multipart multipart = new MimeMultipart("alternative");
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Shark Media Job");

            MimeBodyPart textPart = new MimeBodyPart();
            String textContent = "Plain text";
            textPart.setText(textContent);
            Company_settingBean cb = new Company_settingBean();
            cb.init();
            MimeBodyPart htmlPart = new MimeBodyPart();
            String htmlContent = "<html>"
                    + "<div style='padding:10px;background:#EC4A24;font-size:15px;color:#ffffff;font-weight:1000'>"
                    + "<p>Dear,</p>"
                    + "<p>Please note that your printing Job with SHARK Media is Ready</p>"
                    + "<p>Regards<br/>SHARK MEDIA TEAM<br/><img src='http://sharkmediaug.com/wp-content/themes/Scyllalite/images/shark-logo.png'></img></p>"
                    + "</div>"
                    + "</html>";
            htmlPart.setContent(htmlContent, "text/html");
            multipart.addBodyPart(htmlPart);

            message.setContent(multipart);

            //send the message  
            Transport.send(message);
            System.out.println("message sent successfully...");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public void send_mail(String email_body, String email_to, String contact_person) throws MessagingException {
        String host = "mail.wingersoft.co.ug";
        final String user = "info@wingersoft.co.ug";//change accordingly  
        final String password = "Rhythm123";//change accordingly  

        String to = "newtonajuna@gmail.com";//change accordingly  

        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "false");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "mail.wingersoft.co.ug");
        props.put("mail.smtp.port", "26");
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
        Multipart multipart = new MimeMultipart("alternative");
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress(user));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(email_to));
        message.setSubject("Shark Media Job");

        MimeBodyPart htmlPart = new MimeBodyPart();
        String htmlContent = "<html>"
                + "<div style='padding:10px;background:#EC4A24;font-size:15px;color:#ffffff;font-weight:1000'>"
                + "<p>Dear " + contact_person + ",</p>"
                + "<p>" + email_body + "</p>"
                + "<p>Regards<br/>SHARK MEDIA TEAM<br/><img src='http://sharkmediaug.com/wp-content/themes/Scyllalite/images/shark-logo.png'></img></p>"
                + "</div>"
                + "</html>";
        htmlPart.setContent(htmlContent, "text/html");
        multipart.addBodyPart(htmlPart);

        message.setContent(multipart);

        //send the message  
        Transport.send(message);
        System.out.println("message sent successfully...");
    }
}
