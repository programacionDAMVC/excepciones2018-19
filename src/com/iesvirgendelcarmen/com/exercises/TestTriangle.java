package com.iesvirgendelcarmen.com.exercises;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the three sides of triangle:");
		Scanner sc = new Scanner(System.in);
		String sSideA = sc.next();
		String sSideB = sc.next();
		String sSideC = sc.next();
		sc.close();

		if (!checkFormatSide(sSideA) || !checkFormatSide(sSideB) 
				|| !checkFormatSide(sSideC)) {
			System.out.println("Error in data");
			return;
		}
		float fSideA = Float.parseFloat(sSideA.replace(",", "."));
		float fSideB = Float.parseFloat(sSideB.replace(",", "."));
		float fSideC = Float.parseFloat(sSideC.replace(",", "."));
		System.out.println("Antes de crear triangulos nº: " + Triangle.numberOfTriangle );
		
		try {
			Triangle triangle1 = new Triangle(fSideA, fSideB, fSideC);
			System.out.println(triangle1);
			new Triangle(2, 2, 2);
			System.out.println("Después de crear triangulos nº: " 
					+ Triangle.numberOfTriangle );

		} catch (IlegalTriangleException ex) {
			// TODO Auto-generated catch block
			//ex.printStackTrace();
			System.out.println("Bad Triangle");
		}

	}

	private static boolean checkFormatSide(String side) {
		return side.matches("^\\d+([\\.,]\\d+)?$");
	}

}
