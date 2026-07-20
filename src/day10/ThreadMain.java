package day10;

import java.util.Scanner;

public class ThreadMain {

	public static void main(String[] args) {
		// Let's assume we have a quiz game which will take user's input but user has only 5 seconds to answer.
//		Scanner sc = new Scanner(System.in) ;
		
		Thread thread1 = new Thread(new MyRunnable()) ;
		Thread thread2 = new Thread(new MyRunnable()) ;
		
//		thread.setDaemon(true);
		thread1.start();
		thread2.start();
		
//		System.out.println("You have only 5 sec to answer this ques");
//		System.out.println("2+2=?");
//		int ans = sc.nextInt() ;
//		System.out.println("So your answer is " + ans);
//		sc.close();
	}

}
