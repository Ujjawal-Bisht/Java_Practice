package convertorProject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
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
				System.out.println("This feature will available soon....");
			}
			case 2 ->{
				System.out.println("This feature will available soon....");
			}
			case 3 ->{
				convert(path, res) ;
			}
			case 4 ->{
				convert(path, res) ;
			}
			case 5 ->{
				System.out.println("This feature will available soon....");
			}
			case 6 ->{
				System.out.println("This feature will available soon....");
			}
			default -> {
				System.err.println("Please Enter a valid choice!3");
			}
		}
		sc.close();
	}
}
