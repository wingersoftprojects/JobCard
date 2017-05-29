/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import beans.Company_settingBean;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import models.Job_card;
import models.Job_card_item;
import org.orm.PersistentException;

/**
 *
 * @author philp
 */
public class GeneratePDF {

    public static void main(String[] args) {
        GeneratePDF demo = new GeneratePDF();
        try {
            demo.email(Job_card.getJob_cardByORMID(72), "Test", "newtonajuna@gmail.com", "Ajuna");
        } catch (PersistentException ex) {
            Logger.getLogger(GeneratePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writePdf(OutputStream outputStream, Job_card previous_job_card) throws Exception {
        float[] columnWidths = {3, 10, 3, 4, 3};
        float[] job_card_columnWidths = {4, 7, 3};
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, outputStream);
        //PdfWriter.getInstance(document, new FileOutputStream("e:/Job Card.pdf"));
        //Image image = Image.getInstance("e://OneDrive/PROJECTS/NetBeansProjects/JobCard/web/resources/images/logo.png");
        Image image = Image.getInstance("src/java/images/logo.png");
        image.scalePercent(23f);
        Font font1 = new Font(Font.BOLD);
        Font font2 = new Font(Font.BOLD);
        font2.setColor(Color.red);
        Font font3 = new Font(Font.ITALIC);

        document.open();
        PdfPTable job_card = new PdfPTable(3);
        job_card.setWidths(job_card_columnWidths);
        job_card.setWidthPercentage(100);
        job_card.getDefaultCell().setBorder(1);
        PdfPCell cell1 = new PdfPCell();
        cell1.addElement(new Chunk(image, 0, 0));
        cell1.addElement(new Paragraph("We add value to paper"));
        cell1.setBorder(Rectangle.NO_BORDER);
        job_card.addCell(cell1);

        PdfPCell cell2 = new PdfPCell();
        cell2.addElement(new Paragraph("Plot:" + "5/5A,Nasser Rd" + "\n"));
        cell2.addElement(new Paragraph("Tel: " + "+256707-635382/+256782-989787" + "\n"));
        cell2.addElement(new Paragraph("Mob: " + "+25647272666"));
        cell2.setBorder(Rectangle.NO_BORDER);
        job_card.addCell(cell2);

        PdfPCell cell3 = new PdfPCell();
        cell3.addElement(new Paragraph("" + "\n"));
        cell3.addElement(new Paragraph("JOB CARD" + "\n", font3));
        cell3.addElement(new Paragraph("Date: " + previous_job_card.getAdd_date()));
        cell3.setBorder(Rectangle.NO_BORDER);
        job_card.addCell(cell3);

        Paragraph sectionHeader1 = new Paragraph("" + "\n" + "CUSTOMER DETAILS");
        sectionHeader1.setSpacingBefore(2);
        Paragraph section4 = new Paragraph("Ms.(Company): " + previous_job_card.getCustomer_detail().getCustomer_name());
        Paragraph section5 = new Paragraph("Job Card Date: " + previous_job_card.getJob_date() + "                                    Due Date: " + previous_job_card.getDue_date());
        Paragraph section6 = new Paragraph("Contact Person: " + previous_job_card.getCustomer_detail().getContact_person_name() + "                               Telephone: " + previous_job_card.getCustomer_detail().getContact_person_telephone1() + "/" + previous_job_card.getCustomer_detail().getContact_person_telephone2());

        Paragraph sectionHeader2 = new Paragraph("" + "\n" + "JOB DETAILS" + "\n" + "Final Product Details(For Delivery and Invoicing Purposes)" + "\n" + "\n");

        PdfPTable pdfPTable = new PdfPTable(5);
        pdfPTable.setWidths(columnWidths);
        pdfPTable.setHeaderRows(1);
        pdfPTable.setSpacingBefore(10);
        pdfPTable.setSpacingAfter(25);
        pdfPTable.setWidthPercentage(100);

        PdfPCell item = new PdfPCell(new Phrase("ITEM", font1));
        item.setHorizontalAlignment(Element.ALIGN_CENTER);
        item.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(item);

        PdfPCell descr = new PdfPCell(new Phrase("DESCRIPTION", font1));
        descr.setHorizontalAlignment(Element.ALIGN_CENTER);
        descr.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(descr);

        PdfPCell qty = new PdfPCell(new Phrase("QTY", font1));
        qty.setHorizontalAlignment(Element.ALIGN_CENTER);
        qty.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(qty);

        PdfPCell ucost = new PdfPCell(new Phrase("UNIT COST", font1));
        ucost.setHorizontalAlignment(Element.ALIGN_CENTER);
        ucost.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(ucost);

        PdfPCell amount = new PdfPCell(new Phrase("AMOUNT", font1));
        amount.setHorizontalAlignment(Element.ALIGN_CENTER);
        amount.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(amount);

        List<Job_card_item> job_card_items = new ArrayList<>(previous_job_card.getJob_card_item());
        int total = 0;
        for (Job_card_item job_card_item : job_card_items) {
            PdfPCell item_details = new PdfPCell(new Phrase(job_card_item.getItem_type().getItem_type_name(), font1));
            item_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(item_details);
            pdfPTable.addCell(new Phrase(job_card_item.getJob_title() + "\n"
                    + "Size: " + job_card_item.getPaper_size() + "\n"
                    + "Pages: " + job_card_item.getPages() + "\n"
                    + "Paper: " + job_card_item.getPaper_type() + "\n"
                    + "Cover: " + job_card_item.getCover_type() + "\n"
                    + "Color: " + job_card_item.getColor() + "\n"
                    + "Machine: " + job_card_item.getMachine_used() + "\n"
                    + "Laminating: " + job_card_item.getLamination_type() + "\n"
                    + "Binding: " + job_card_item.getBinding_type() + "\n"
                    + "Other processes: " + job_card_item.getOther_processes() + "\n"));
            PdfPCell qty_details = new PdfPCell(new Phrase(job_card_item.getQuantity()));
            qty_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            //pdfPTable.addCell(qty_details);
            pdfPTable.addCell(String.format("%,d", job_card_item.getQuantity()));

            PdfPCell uc_details = new PdfPCell(new Phrase(job_card_item.getRate()));
            uc_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            //pdfPTable.addCell(uc_details);
            pdfPTable.addCell(String.format("%,d", job_card_item.getRate()));

            PdfPCell amount_details = new PdfPCell(new Phrase(job_card_item.getAmount()));
            amount_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            //pdfPTable.addCell(amount_details);
            pdfPTable.addCell(String.format("%,d", job_card_item.getAmount()));

            //Add total
            total += job_card_item.getAmount();
        }

        PdfPCell footer1 = new PdfPCell(new Phrase(""));
        footer1.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(footer1);

        PdfPCell footer2 = new PdfPCell(new Phrase(""));
        footer2.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(footer2);

        PdfPCell footer3 = new PdfPCell(new Phrase(""));
        footer3.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(footer3);

        PdfPCell footer4 = new PdfPCell(new Phrase("TOTALS", font1));
        footer4.setHorizontalAlignment(Element.ALIGN_CENTER);
        footer4.setBackgroundColor(Color.LIGHT_GRAY);
        pdfPTable.addCell(footer4);

        PdfPCell footer5 = new PdfPCell(new Phrase("10101"));
        footer5.setHorizontalAlignment(Element.ALIGN_CENTER);
        footer5.setBackgroundColor(Color.LIGHT_GRAY);
        //pdfPTable.addCell(footer5);
        pdfPTable.addCell(String.format("%,d", total));

        Paragraph job_manager = new Paragraph("Job Manager: " + previous_job_card.getJob_manager().getFirst_name() + " " + previous_job_card.getJob_manager().getSecond_name() + " " + previous_job_card.getJob_manager().getThird_name() + "                                 Signature: " + "\n");
        Paragraph prepared_by = new Paragraph("Prepared By: " + previous_job_card.getAdd_by().getFirst_name() + " " + previous_job_card.getAdd_by().getSecond_name() + " " + previous_job_card.getAdd_by().getThird_name() + "\n\n");
        Paragraph precaution1 = new Paragraph(new Phrase("               *Please READ AND UNDERSTAND the Job Card carefully before printing." + "\n" + "                                Please ask for details in case you don't understand" + "\n" + "                        The job manager is liable for all errors during the job process*", font2));

        document.add(job_card);
        document.add(sectionHeader1);
        document.add(section4);
        document.add(section5);
        document.add(section6);
        document.add(sectionHeader2);
        document.add(pdfPTable);
        document.add(job_manager);
        document.add(prepared_by);
        document.add(precaution1);
        document.close();
    }

    public void email(Job_card job_card, String email_body, String email_to, String contact_person) {
//        String smtpHost = "mail.wingersoft.co.ug"; //replace this with a valid host
//        int smtpPort = 26; //replace this with a valid port

        String recipient = email_to;//"philpx32@wingersoft.co.ug"; //replace this with a valid recipient email address
        String recipient2 = "philliparinaitwe@wingersoft.co.ug"; //replace this with a valid recipient email address
        final String user = "info@wingersoft.co.ug";//change accordingly  
        final String password = "Rhythm123";//change accordingly  

        String to = "philpx32@gmail.com";//change accordingly  

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

            Multipart multipart = new MimeMultipart("alternative");
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient2));
            message.setSubject("Shark Media Job");

            MimeBodyPart textPart = new MimeBodyPart();
            String textContent = "Plain text";
            textPart.setText(textContent);
            Company_settingBean cb = new Company_settingBean();
            cb.init();
            MimeBodyPart htmlPart = new MimeBodyPart();
//            String htmlContent = "<html>"
//                    + "<div style='padding:10px;background:#EC4A24;font-size:15px;color:#ffffff;font-weight:1000'>"
//                    + "<p>Dear,</p>"
//                    + "<p>Please note that your printing Job with SHARK Media is Ready</p>"
//                    + "<p>Regards<br/>SHARK MEDIA TEAM<br/><img src='http://sharkmediaug.com/wp-content/themes/Scyllalite/images/shark-logo.png'></img></p>"
//                    + "</div>"
//                    + "</html>";
            String htmlContent = "<html>"
                    + "<div style='padding:10px;background:#ffffff;font-size:15px;color:#000000;font-weight:1000'>"
                    + "<p>Dear " + contact_person + ",</p>"
                    + "<p>" + email_body + "</p>"
                    + "<p>Best Regards<br/>SHARK MEDIA TEAM<br/><img src='../resources/images/logo_email.png'></img></p>"
                    + "</div>"
                    + "</html>";
            htmlPart.setContent(htmlContent, "text/html");
            multipart.addBodyPart(htmlPart);

            //now write the PDF content to the output stream
            outputStream = new ByteArrayOutputStream();
            writePdf(outputStream, job_card);
            byte[] bytes = outputStream.toByteArray();

            //construct the pdf body part
            DataSource dataSource = new ByteArrayDataSource(bytes, "application/pdf");
            MimeBodyPart pdfBodyPart = new MimeBodyPart();
            pdfBodyPart.setDataHandler(new DataHandler(dataSource));
            pdfBodyPart.setFileName("Shark Media Job Card.pdf");

            //construct the mime multi part
            MimeMultipart mimeMultipart = new MimeMultipart();
            //multipart.addBodyPart(textBodyPart);
            mimeMultipart.addBodyPart(htmlPart);
            mimeMultipart.addBodyPart(pdfBodyPart);

            message.setContent(mimeMultipart);

            //send the message  
            Transport.send(message);
            System.out.println("message sent successfully...");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            //clean off
            if (null != outputStream) {
                try {
                    outputStream.close();
                    outputStream = null;
                } catch (Exception ex) {
                }
            }
        }
    }
}
