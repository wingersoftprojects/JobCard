/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

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
import java.awt.color.ColorSpace;
import java.io.FileOutputStream;
import static javax.swing.text.StyleConstants.FontFamily;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import sun.rmi.log.LogOutputStream;

/**
 *
 * @author philp
 */
public class PdfTest {

    public static void main(String[] args) {
        try {
            float[] columnWidths = {3, 10, 3, 4, 3};
            float[] job_card_columnWidths = {4, 7, 3};
            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream("e:/Job Card.pdf"));
            Image image = Image.getInstance("e://OneDrive/PROJECTS/NetBeansProjects/JobCard/web/resources/images/logo.png");
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
            cell3.addElement(new Paragraph("JOB CARD" + "\n",font3));
            cell3.addElement(new Paragraph("Date: " + "2017-05-30"));
            cell3.setBorder(Rectangle.NO_BORDER);
            job_card.addCell(cell3);

            Paragraph sectionHeader1 = new Paragraph("" + "\n" + "CUSTOMER DETAILS");
            sectionHeader1.setSpacingBefore(2);
            Paragraph section4 = new Paragraph("Ms.(Company): " + "WingerSoft Technologies Limited");
            Paragraph section5 = new Paragraph("Job Card Date: " + "2017-05-30" + "                                         Due Date: " + "2017-05-30");
            Paragraph section6 = new Paragraph("Contact Person: " + "Kezabu Brendah" + "                               Telephone: " + "0706-267475/0703-188321");

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

            PdfPCell item_details = new PdfPCell(new Phrase("Books", font1));
            item_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(item_details);
            pdfPTable.addCell(new Phrase("Printing Story Books" + "\n"
                    + "Size: " + "A4" + "\n"
                    + "Pages: " + "200" + "\n"
                    + "Paper: " + "Bond 80GM" + "\n"
                    + "Cover: " + "Art Board 305 GSM" + "\n"
                    + "Color: " + "Black" + "\n"
                    + "Machine: " + "Digital Machine" + "\n"
                    + "Laminating: " + "Matte" + "\n"
                    + "Binding: " + "Perfect Binding" + "\n"
                    + "Other processes: " + "Packaging the story books with polythene" + "\n"));
            PdfPCell qty_details = new PdfPCell(new Phrase("1000"));
            qty_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(qty_details);

            PdfPCell uc_details = new PdfPCell(new Phrase("100"));
            uc_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(uc_details);

            PdfPCell amount_details = new PdfPCell(new Phrase("100000"));
            amount_details.setHorizontalAlignment(Element.ALIGN_CENTER);
            pdfPTable.addCell(amount_details);

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

            PdfPCell footer5 = new PdfPCell(new Phrase("100000"));
            footer5.setHorizontalAlignment(Element.ALIGN_CENTER);
            footer5.setBackgroundColor(Color.LIGHT_GRAY);
            pdfPTable.addCell(footer5);

            Paragraph job_manager = new Paragraph("Job Manager: " + "Arinaitwe Phillip" + "                                 Signature: " + "\n");
            Paragraph prepared_by = new Paragraph("Prepared By: " + "Arinaitwe Phillip" + "\n\n");
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
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Generated pdf");
    }
//       public void createPdf(String filename)
//        throws IOException, DocumentException, SQLException {
    	// Create a database connection
//        DatabaseConnection connection = new HsqldbConnection("filmfestival");    
//        // step 1
//        Document document = new Document();
//        // step 2
//        PdfWriter.getInstance(document, new FileOutputStream(filename));
//        // step 3
//        document.open();
//        // step 4
//        document.add(new Paragraph("Movies:"));
//        List<Movie> movies = PojoFactory.getMovies(connection);
//        for (Movie movie : movies) {
//            PdfPTable table = new PdfPTable(2);
//            table.setWidths(new int[]{1, 4});
//            PdfPCell cell;
//            cell = new PdfPCell(new Phrase(movie.getTitle(), FilmFonts.BOLD));
//            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            cell.setColspan(2);
//            table.addCell(cell);
//            if (movie.getOriginalTitle() != null) {
//                cell = new PdfPCell(PojoToElementFactory.getOriginalTitlePhrase(movie));
//                cell.setColspan(2);
//                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
//                table.addCell(cell);
//            }
//            List<Director> directors = movie.getDirectors();
//            cell = new PdfPCell(new Phrase("Directors:"));
//            cell.setRowspan(directors.size());
//            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
//            table.addCell(cell);
//            int count = 0;
//            for (Director pojo : directors) {
//                cell = new PdfPCell(PojoToElementFactory.getDirectorPhrase(pojo));
//                cell.setIndent(10 * count++);
//                table.addCell(cell);
//            }
//            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
//            table.addCell("Year:");
//            table.addCell(String.valueOf(movie.getYear()));
//            table.addCell("Run length:");
//            table.addCell(String.valueOf(movie.getDuration()));
//            List<Country> countries = movie.getCountries();
//            cell = new PdfPCell(new Phrase("Countries:"));
//            cell.setRowspan(countries.size());
//            cell.setVerticalAlignment(Element.ALIGN_BOTTOM);
//            table.addCell(cell);
//            table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
//            for (Country country : countries) {
//                table.addCell(country.getCountry());
//            }
//            document.add(table);
//        }
//        // step 5
//        document.close();
}
