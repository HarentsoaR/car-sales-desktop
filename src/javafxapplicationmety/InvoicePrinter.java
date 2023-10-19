/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplicationmety;

/**
 *
 * @author randr
 */
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javafx.collections.ObservableList;

public class InvoicePrinter {

    public void printInvoiceToPDF(ObservableList<invoiceData> invoiceList) {
        PDDocument document = new PDDocument();
        PDPage page = new PDPage(PDRectangle.A4);
        document.addPage(page);

        try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
             PDType0Font font = PDType0Font.load(document, getClass().getResourceAsStream("/path/to/your/font.ttf"));

            contentStream.setFont(font, 12);
            contentStream.setLeading(14.5f);
            contentStream.beginText();
            contentStream.newLineAtOffset(50, 700);

            contentStream.showText("Invoice");
            contentStream.newLine();
            contentStream.newLine();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            contentStream.showText("Date: " + dtf.format(now));
            contentStream.newLine();
            contentStream.newLine();

            for (invoiceData invoice : invoiceList) {
                contentStream.showText("Client: " + invoice.getClient());
                contentStream.newLine();
                contentStream.showText("Car: " + invoice.getCar());
                contentStream.newLine();
                contentStream.showText("Unit Price: " + invoice.getUp());
                contentStream.newLine();
                contentStream.showText("Quantity: " + invoice.getQuantity());
                contentStream.newLine();
                contentStream.showText("Amount: " + invoice.getAmount());
                contentStream.newLine();
                contentStream.newLine();
            }

            contentStream.endText();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Save the PDF file
        try {
            document.save("invoice.pdf");
            document.close();
            System.out.println("Invoice saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

