package entidades;

import java.time.LocalDate;

import utilidades.Tools;

public class CD extends Medio{

	
//	private enum Cubierta;
	private String[] pistas;
	
	public CD(){
		super();
		this.pistas=new String[10];;
	}
	public CD(String nombre, String artista, int duracion, LocalDate flanzamiento, String[] pistas) {
		super(nombre,artista, duracion, flanzamiento);
		this.pistas=pistas;
	}
	public String[] getPistas() {
		return pistas;
	}
	public void setPistas(String[] pistas) {
		this.pistas = pistas;
	}
	
	public String toFichero() {
		return "CD;" + super.toFichero() + ";" + Tools.toFicheroArray(pistas);
	}

}
