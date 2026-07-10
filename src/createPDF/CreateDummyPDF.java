package createPDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class CreateDummyPDF {
    public static void main(String[] args) throws Exception {
        // Create a new PDF document
        PDDocument doc = new PDDocument();
        PDPage page = new PDPage(PDRectangle.A4);
        doc.addPage(page);

        // Create a content stream to write text
        PDPageContentStream content = new PDPageContentStream(doc, page);

        // Use the new font API in PDFBox 3.x
        content.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 12);

        content.beginText();
        content.newLineAtOffset(100, 700);
        content.showText("This is a sample PDF document.");
        content.newLineAtOffset(0, -20);
        content.showText("It contains only a few lines of text.");
        content.newLineAtOffset(0, -20);
        content.showText("This text is here for demonstration.");
        content.endText();

        content.close();

        // Save the PDF
        doc.save("E:\\JAVA\\WiproTraining\\CoreJAVA\\dummy.pdf");
        doc.close();

        System.out.println("PDF created successfully!");
    }
}
