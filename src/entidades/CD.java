package entidades;

import java.time.LocalDate;

import enums.Cubiertas;
import utilidades.Tools;

public class CD extends Medio{

	
	private Cubiertas cubierta;
	private String[] pistas;
	
	public CD(){
		super();
		this.pistas=new String[10];;
	}
	public CD(String nombre, String artista, int duracion, LocalDate flanzamiento, String[] pistas) {
		super(nombre,artista, duracion, flanzamiento);
		this.pistas=pistas;
	}
	
	public CD(String nombre, String artista, int duracion, LocalDate flanzamiento, String[] pistas, Cubiertas cubierta) {
		super(nombre,artista, duracion, flanzamiento);
		this.pistas=pistas;
		this.cubierta = cubierta;
	}
	
	public String[] getPistas() {
		return pistas;
	}
	public void setPistas(String[] pistas) {
		this.pistas = pistas;
	}
	
	public Cubiertas getCubierta() {
		return cubierta;
	}
	public void setCubierta(Cubiertas cubierta) {
		this.cubierta = cubierta;
	}

	
	public String toFichero() {
		return "CD;" + super.toFichero() + ";" + Tools.toFicheroArray(pistas);
	}

	public String toString(){
		return "nombre"+getNombre() + ";"+" artista "+getArtista()+" duración "+getDuracion()+ " genero de la canción "+ getGenero() +" Fecha de salida "+ getFlanzamiento()+" Pistas "+getPistas();
	}



}
