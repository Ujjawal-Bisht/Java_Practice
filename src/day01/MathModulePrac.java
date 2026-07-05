package day01;

import java.util.Scanner;

public class MathModulePrac {

	public static void main(String[] args) {
		// Take radius as input from user and calculate circumference, area and volume of circle/sphere.
		
		Scanner sc = new Scanner(System.in) ;
		double radius ;
		System.out.print("Enter radius (in cm): ");
		radius = sc.nextDouble() ;
		double cir, area, vol ;
		
		cir = 2 * Math.PI * radius ;
		area = Math.PI * Math.pow(radius, 2) ;
		vol = (4/3) * Math.PI * Math.pow(radius, 3) ;
		
		cir = Math.round(cir * 100.0) / 100.0 ;
		area = Math.round(area * 100.0) / 100.0 ;
		vol = Math.round(vol * 100.0) / 100.0 ;
		
		System.out.println("Circumference of Circle - " + cir + "cm\nArea of Circle - " + area + "cm²\nVolume of Sphere - " + vol + "cu cm³\n");
		System.out.printf("Circumference of Circle - %,.2f cm \nArea of Circle - %,.2f cm² \nVolume of Sphere - %,.2f cm³", cir , area , vol);

		// For the superscript 2 use - alt + 0178(Numlock should be on.)  ->  cm²
		// For superscript 3 use - alt + 0179   -> cm³
		
		sc.close();
	}

}
