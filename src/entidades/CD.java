package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class CD extends Medio{

	
//	private enum Cubierta;
	private int[] pistas=new int[10];
	
	public CD(){
		super();
		this.pistas=pistas;
	}
	public CD(String nombre, String artista, LocalTime duracion, LocalDate flanzamiento, int[] pistas) {
		super(nombre,artista, duracion, flanzamiento);
		this.pistas=pistas;
	}
	public int[] getPistas() {
		return pistas;
	}
	public void setPistas(int[] pistas) {
		this.pistas = pistas;
	}

}
