package com.iesvirgendelcarmen.teoria.excepcionesPropias.prueba;

import javax.swing.JOptionPane;

import com.iesvirgendelcarmen.teoria.excepcionesPropias.Ciudad;
import com.iesvirgendelcarmen.teoria.excepcionesPropias.CoordenadasNoValidasExcepcion;

public class PruebaCiudades {

	public static void main(String[] args) {
		
		String nombreCiudad = 
				JOptionPane.showInputDialog(null, "Introduce nombre de ciudad", "CIUDAD NOMBRE", JOptionPane.QUESTION_MESSAGE);
		String latitudCiudad = 
				JOptionPane.showInputDialog(null, "Introduce latitud de la ciudad", "CIUDAD LATITUD", JOptionPane.QUESTION_MESSAGE);
		if (!latitudCiudad.matches("^-?[\\d]+([\\.,]\\d+)?")) {
			JOptionPane.showMessageDialog(null, "Latitud no válida", "ERROR COORDENADAS", JOptionPane.ERROR_MESSAGE);
			return;
		}
		String longitudCiudad = 
				JOptionPane.showInputDialog(null, "Introduce longitud de la ciudad", "CIUDAD LONGITUD", JOptionPane.QUESTION_MESSAGE);
		if (!longitudCiudad.matches("^-?[\\d]+([\\.,]\\d+)?")) {
			JOptionPane.showMessageDialog(null, "Longitud no válida", "ERROR COORDENADAS", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		//permitimos formatos de número con . y ,    23.23 22,23
		float latitud  = Float.parseFloat(latitudCiudad.replace(",", "."));
		float longitud = Float.parseFloat(longitudCiudad.replace(",", "."));
		
		try {
			Ciudad ciudad = new Ciudad(nombreCiudad, longitud, latitud);
			mostrarCiudad(ciudad);
		} catch (CoordenadasNoValidasExcepcion e) {
			JOptionPane.showMessageDialog(null, "Coordenas no válidas", "ERROR COORDENADAS", JOptionPane.ERROR_MESSAGE);
		}

	}

	private static void mostrarCiudad(Ciudad ciudad) {
		System.out.println(ciudad);
	}

}
