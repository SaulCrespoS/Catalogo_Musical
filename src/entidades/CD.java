package entidades;

import java.time.LocalDate;

import enums.Cubiertas;
import enums.Generos;

public class CD extends Medio{

	
	private Cubiertas cubierta;
	private Generos genero;
	private String[] pistas;
	
	public CD() {
		super();
		this.cubierta = Cubiertas.JEWEL;
		this.genero = Generos.ROCK;
		this.pistas=new String[10];;
	}
	public CD(String nombre, String artista, int duracion, LocalDate flanzamiento, Cubiertas cubierta, Generos genero, String[] pistas) {
		super(nombre,artista, duracion, flanzamiento);
		this.cubierta = cubierta;
		this.genero = genero;
		this.pistas=pistas;
	}
	public String[] getPistas() {
		return pistas;
	}
	public void setPistas(String[] pistas) {
		this.pistas = pistas;
	}

}
