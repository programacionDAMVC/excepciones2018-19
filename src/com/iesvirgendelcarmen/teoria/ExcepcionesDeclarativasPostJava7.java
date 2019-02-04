package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionesDeclarativasPostJava7 {

	public static void main(String[] args) {

		File inFile = new File("data.txt");
		try (Scanner sc = new Scanner(inFile);) {
			while (sc.hasNext())
				System.out.println(sc.next());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.printf("El fichero %s no existe%n", inFile);
		}

	}

}
