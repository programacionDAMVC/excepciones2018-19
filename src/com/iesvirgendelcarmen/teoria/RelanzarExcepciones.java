package com.iesvirgendelcarmen.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RelanzarExcepciones {
	public static void main(String[] args) {
		String path = "datos.txt";
		try {
			System.out.println(leerPalabras(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.printf("El fichero %s no existe%n" ,path);
			//e.printStackTrace();
		}
		
	}
	public static List<String> leerPalabras(String path) throws FileNotFoundException{
		List<String> lista = new ArrayList<>();
		Scanner sc = new Scanner(new File(path));
		while (sc.hasNext())
			lista.add(sc.next());
		sc.close();
		return lista;
	}
}
