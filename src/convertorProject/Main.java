package convertorProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public static String readData(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
	    StringBuilder data = new StringBuilder();
	    String s;
	    while ((s = br.readLine()) != null) {
	        data.append(s).append("\n");
	    }
	    br.close();
	    return data.toString();
		
	}
	
	public static void convertToWord(String path, String res)throws IOException{
		String data = readData(path) ;
		File f = new File(res) ;
		PrintWriter pw = new PrintWriter(f) ;
		
		while(!data.isEmpty()) {
			pw.println(data) ;
		}
		pw.flush() ;
		pw.close();
		
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
				
			}
			case 2 ->{
				
			}
			case 3 ->{
				convertToWord(path, res) ;
				System.out.println("File Converted Successfully!!!");
			}
			case 4 ->{
				
			}
			case 5 ->{
				
			}
			case 6 ->{
				
			}
			default -> {}
		}
		sc.close();
	}
}
