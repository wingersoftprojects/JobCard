/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;

/**
 *
 * @author philp
 */
public class GeneratePDF {
    public static void main(String[] args){
        GeneratePDF demo = new GeneratePDF();
        demo.email();
    }
    
    public void writePdf(OutputStream outputStream) throws Exception {
        Document document = new Document();
        PdfWriter.getInstance(document, outputStream);
         
        document.open();
         
        document.addTitle("Test PDF");
        document.addSubject("Testing email PDF");
        document.addKeywords("iText, email");
        document.addAuthor("Jee Vang");
        document.addCreator("Jee Vang");
         
        Paragraph paragraph = new Paragraph();
        paragraph.add(new Chunk("hello!"));
        document.add(paragraph);
         
        document.close();
    }
    
        public void email() {
        String smtpHost = "mail.wingersoft.co.ug"; //replace this with a valid host
        int smtpPort = 26; //replace this with a valid port
                 
        String sender = "philliparinaitwe@wingersoft.co.ug"; //replace this with a valid sender email address
        String recipient = "newtonajuna@wingersoft.co.ug"; //replace this with a valid recipient email address
        String content = "testing"; //this will be the text of the email
        String subject = "pdf test"; //this will be the subject of the email
         
        
        String host = "mail.wingersoft.co.ug";
        final String user = "info@wingersoft.co.ug";//change accordingly  
//            Properties properties = new Properties();
//        properties.put("mail.smtp.host", smtpHost);
//        properties.put("mail.smtp.port", smtpPort);  
        
        final String password = "Rhythm123";//change accordingly  

        String to = "newtonajuna@gmail.com";//change accordingly  

        //Get the session object  
        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "false");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "mail.wingersoft.co.ug");
        props.put("mail.smtp.port", "26");
            //Session session = Session.getDefaultInstance(properties, null);
            
             Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, password);
            }
        });
         
            ByteArrayOutputStream outputStream = null;
         
        try {           
            //construct the text body part
            MimeBodyPart textBodyPart = new MimeBodyPart();
            textBodyPart.setText(content);
             
            //now write the PDF content to the output stream
            outputStream = new ByteArrayOutputStream();
            writePdf(outputStream);
            byte[] bytes = outputStream.toByteArray();
             
            //construct the pdf body part
            DataSource dataSource = new ByteArrayDataSource(bytes, "application/pdf");
            MimeBodyPart pdfBodyPart = new MimeBodyPart();
            pdfBodyPart.setDataHandler(new DataHandler(dataSource));
            pdfBodyPart.setFileName("test.pdf");
                         
            //construct the mime multi part
            MimeMultipart mimeMultipart = new MimeMultipart();
            mimeMultipart.addBodyPart(textBodyPart);
            mimeMultipart.addBodyPart(pdfBodyPart);
             
            //create the sender/recipient addresses
            InternetAddress iaSender = new InternetAddress(sender);
            InternetAddress iaRecipient = new InternetAddress(recipient);
             
            //construct the mime message
            MimeMessage mimeMessage = new MimeMessage(session);
            mimeMessage.setSender(iaSender);
            mimeMessage.setSubject(subject);
            mimeMessage.setRecipient(Message.RecipientType.TO, iaRecipient);
            mimeMessage.setContent(mimeMultipart);
             
            //send off the email
            Transport.send(mimeMessage);
             
            System.out.println("sent from " + sender + 
                    ", to " + recipient + 
                    "; server = " + smtpHost + ", port = " + smtpPort);         
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
            //clean off
            if(null != outputStream) {
                try { outputStream.close(); outputStream = null; }
                catch(Exception ex) { }
            }
        }
    }
}
