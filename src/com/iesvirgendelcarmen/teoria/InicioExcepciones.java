package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class InicioExcepciones {

	public static void main(String[] args) {
				//Excepción entrada por Scanner de datos con formato erróneo y/o división por cero
				System.out.println("Introduce numerador y denominador");
				Scanner sc = new Scanner(System.in);
				//		int numerador = sc.nextInt();
				//		int denominador = sc.nextInt();
				String iNumerador = sc.next();
				String iDenominador = sc.next();
				sc.close();
				String regexNumerosEnteror = "[0-9]+";
				if ( iNumerador.matches(regexNumerosEnteror) && 
						iDenominador.matches(regexNumerosEnteror)) {
					int numerador   = Integer.parseInt(iNumerador);
					int denominador = Integer.parseInt(iDenominador); 
					if ( denominador != 0)
						System.out.println("Valor de la división " + dividir(numerador, denominador));
					else
						System.out.println("No se puede dividir por cero");
				}
				else
					System.out.println("Datos no válidos");

				//Excepcion de referencia nula
				String palabra = null;
				if (palabra != null)
					System.out.printf("%s en mayúscula es %s%n", palabra, palabraEnMayuscula(palabra));
				else
					System.out.println("Nada que hacer");

		//argumentos de la colección args  public static void main(String[] args)

		//Excepción de índice de colección no existente
				if (args.length != 0)
					System.out.println("El argumento esperado " + args[0]);
				else
					System.out.println("Faltan argumentos");
				
		//Excepciones declarativas (hay que tratarlas con bloques try/catch/finally)		
		PrintWriter in = null;
		try {
			in = new PrintWriter(new FileOutputStream(
					new File("datos.txt")));
			in.write("Hola Mundo");
			in.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null)
				in.close();
		}


	}

	public static int dividir(int numerador , int denominador) {
		return numerador / denominador;
	}
	public static String palabraEnMayuscula ( String palabra ) {
		return palabra.toUpperCase();
	}

}
