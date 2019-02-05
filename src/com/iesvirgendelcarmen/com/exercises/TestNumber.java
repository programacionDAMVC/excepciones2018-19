package com.iesvirgendelcarmen.com.exercises;

import java.util.Scanner;

public class TestNumber {

	public static void main(String[] args) {

		System.out.println("Enter binary number:");
		Scanner sc = new Scanner(System.in);
		String binaryNumber = sc.next();
		
		try {
			BinaryNumber bNumber = new BinaryNumber(binaryNumber);
			System.out.printf("number value: %s%n", bNumber.getBinaryValue());
			bNumber.setBinaryValue("1011");
			System.out.printf("number value: %s%n", bNumber.getBinaryValue());
			System.out.printf("Decimal value of %s is %d%n",
					bNumber.getBinaryValue(), BinaryNumber.convertBinaryToDecimal(
							bNumber.getBinaryValue()) );
		} catch (IlegalFormatNumberBinaryException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Bad number");
		}

		String anotherNumber = "1111";
		try {
			System.out.printf("Decimal value of %s is %d%n",
					anotherNumber, BinaryNumber.convertBinaryToDecimal(anotherNumber) );
		} catch (IlegalFormatNumberBinaryException e) {
			// TODO Auto-generated catch block
			System.out.println("Bad number");	
		}

		System.out.println("===========================================================0");
		System.out.println("Enter hexadecimal number:");
		String hexadecimalNumber = sc.next();
		sc.close();
		
		try {
			HexadecimalNumber hNumber = new HexadecimalNumber(hexadecimalNumber);
			System.out.println(hNumber);
		} catch (IlegalFormatNumberHexadecimalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		anotherNumber = "16";
		try {
			System.out.printf("Decimal value of %s is %d%n",
					anotherNumber, HexadecimalNumber.convertHexadecimalToDecimal(anotherNumber));
		} catch (IlegalFormatNumberHexadecimalException e) {
			// TODO Auto-generated catch block
			System.out.println("Bad number");	
		}
		System.out.println("That's all");

	}

}
