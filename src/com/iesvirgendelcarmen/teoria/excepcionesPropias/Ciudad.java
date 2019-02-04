package com.iesvirgendelcarmen.teoria.excepcionesPropias;

public class Ciudad {

	private String nombreCiudad;
	private float longitud;
	private float latitud;
	public Ciudad(String nombreCiudad, float longitud, float latitud) throws CoordenadasNoValidasExcepcion {
		if (longitud > 180 || longitud < -180 || latitud < -90 || latitud > 90)
			throw new CoordenadasNoValidasExcepcion();
		this.nombreCiudad = nombreCiudad;
		this.longitud = longitud;
		this.latitud = latitud;
	}
	public String getNombreCiudad() {
		return nombreCiudad;
	}
	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}
	public float getLongitud() {
		return longitud;
	}
	public void setLongitud(float longitud) throws CoordenadasNoValidasExcepcion {
		if (longitud > 180 || longitud < -180)
			throw new CoordenadasNoValidasExcepcion();
		this.longitud = longitud;
	}
	public float getLatitud() {
		return latitud;
	}
	public void setLatitud(float latitud) throws CoordenadasNoValidasExcepcion {
		if (latitud > 90 || latitud < -90)
			throw new CoordenadasNoValidasExcepcion();
		else 
			this.latitud = latitud;
	}
	@Override
	public String toString() {
		return "Ciudad [nombreCiudad=" + nombreCiudad + ", longitud=" + longitud + ", latitud=" + latitud + "]";
	}

//	public static void main(String[] args) {
//		Ciudad ciudad = null;
//		try {
//			ciudad = new Ciudad("jaén", -3.4f, 37.45f);
//			ciudad.setLatitud(1000);
//			ciudad.setLatitud(20);
//		} catch (CoordenadasNoValidasExcepcion e) {
//			System.out.println("Coordenadas no válidas");
//			//e.printStackTrace();
//		}
//		if (ciudad != null)
//			System.out.println(ciudad);
//	}

}
