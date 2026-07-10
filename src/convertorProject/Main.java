package convertorProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class Main {
	
	public static String readPdf(String path) throws IOException {
        File file = new File(path);
        try (PDDocument document = Loader.loadPDF(file)) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }
	
	public static void writePDF(String outputPath, String text) {
        try (PDDocument doc = new PDDocument()) {
            // Create a blank page
            PDPage page = new PDPage();
            doc.addPage(page);

            // Start writing content
            PDPageContentStream content = new PDPageContentStream(doc, page);
            content.setFont(new PDType1Font(Standard14Fonts.FontName.HELVETICA), 12);
            content.beginText();
            content.newLineAtOffset(100, 700);

            // Split text into lines
            String[] lines = text.split("\n");
            for (String line : lines) {
                content.showText(line);
                content.newLineAtOffset(0, -20); // move down for next line
            }

            content.endText();
            content.close();

            // Save the PDF
            doc.save(outputPath);
            System.out.println("PDF written successfully at: " + outputPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static String readData(String path) throws IOException {	
		
		// This method will read data from .txt and .doc files.
		// return complete file data in string format.
		
		File f = new File(path) ;
		FileReader fr = new FileReader(f) ;
		BufferedReader br = new BufferedReader(fr) ;
		StringBuilder data = new StringBuilder() ;
		
		String s ;
		while ((s = br.readLine()) != null) {
	        data.append(s).append("\n");
	    }
	    br.close();
	    return data.toString();
		
	}
	
	public static int writedata(String path, String data) throws IOException{
		
		// This method will write data to .doc and .txt file
		// A new file will be created, if already present it will throw error.
		
		File f = new File(path) ;
		if(f.exists()) {
			System.err.println("File Already Exist!\nTry another file name.");
			return -1;
		}
		if(data == null) {
			System.err.println("Cannot write in file due to no/corrupted data.");
			return -1;
		}
		FileWriter fr = new FileWriter(f) ;
		BufferedWriter bw = new BufferedWriter(fr) ;
		
		bw.write(data) ;
		bw.flush() ;
		bw.close() ;
		return 0 ;
		
	}
	
	public static void convert(String path, String res)throws IOException{
		
		// This method will convert: text file -> word doc && doc file ->text file
		
		String data = readData(path) ;
		int x =writedata(res, data);
		
		if(x == 0) {
			System.out.println("File Converted Successfully!!!");
		}
		return ;
	}
	
	public static void convertTextToPdf(String path, String res) throws IOException{
		
		String data = readData(path) ;
		writePDF(res, data);
		
	}
	
	public static void convertPdfToText(String path, String res) throws IOException{
		
		String data = readPdf(path) ;
		writedata(res, data);
		
	}
	
	

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to My CLI Convertor");
		System.out.println("\t MENU\n1.) Text File to Pdf Convertor\n2.) Pdf to Text File Convertor\n3.) Text to Word Convertor \n4.) Word to Text Convertor \n5.) Pdf to Word Convertor\n6.) Word to Pdf Convertor");
		
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Please Enter your Choice: ");
		int ch = sc.nextInt() ;
		sc.nextLine() ;
		
		System.out.print("Enter complete file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter name of result file: ");
		String res = sc.nextLine() ;
		
		switch(ch) {
			case 1 ->{
				convertTextToPdf(path, res) ;			
			}
			case 2 ->{
				convertPdfToText(path, res) ;
			}
			case 3 ->{
				convert(path, res) ;
			}
			case 4 ->{
				convert(path, res) ;
			}
			case 5 ->{
				convertPdfToText(path, res) ;
			}
			case 6 ->{
				convertTextToPdf(path, res) ;
			}
			default -> {
				System.err.println("Please Enter a valid choice!3");
			}
		}
		sc.close();
	}
}
