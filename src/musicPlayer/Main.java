package musicPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	// This media player will support only (.wav , .au , .aiff) files.

	public static void main(String[] args) {
		String filePath = "src\\musicPlayer\\Treachery.wav" ;

		File file = new File(filePath) ;
		try(Scanner sc = new Scanner(System.in) ; AudioInputStream audioS = AudioSystem.getAudioInputStream(file)){
						
			Clip clip = AudioSystem.getClip() ;
			clip.open(audioS) ;
			
			String response = "";
			
			while(!response.equals("Q")) {
				System.out.println("P - Play \nS - Stop \nR - Reset \nQ - Quit");
				System.out.print("Enter your choice: ");
				response = sc.next().toUpperCase() ;
				
				switch(response) {
					case "P" -> clip.start();
					case "S" -> clip.stop();
					case "R" -> clip.setMicrosecondPosition(0);
					case "Q" -> clip.close();
					default -> System.out.println("Invalid choice.");
				}
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("File not Found.");
		}catch(UnsupportedAudioFileException e) {
			System.out.println("Audio file not supported.");
		}catch(LineUnavailableException e) {
			System.out.println("Unavailable to access audio.");
		}catch(IOException e) {
			System.out.println("Something went wrong. ");
		}finally {
			System.out.println("Music Player Closed");
		}
	}

}
