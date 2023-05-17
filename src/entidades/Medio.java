package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medio {
	
	private String nombre;
	private String artista;
	private LocalTime duracion;
//	private enum genero;
	private LocalDate flanzamiento;
	
	protected Medio() {
		nombre="";
		artista="";
		duracion= LocalTime.now();
//		genero="";
		flanzamiento=LocalDate.now();
	}
	protected Medio(String nombre, String artista, LocalTime duracion, LocalDate flanzamiento) {
		this.nombre=nombre;
		this.artista=artista;
		this.duracion=duracion;
//		this.genero=Genero;
		this.flanzamiento=flanzamiento;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		nombre = nombre;
	}
	protected String getArtista() {
		return artista;
	}
	protected void setArtista(String artista) {
		artista = artista;
	}
	protected LocalTime getDuracion() {
		return duracion;
	}
	protected void setDuracion(LocalTime duracion) {
		duracion = duracion;
	}
	protected LocalDate getFlanzamiento() {
		return flanzamiento;
	}
	protected void setFlanzamiento(LocalDate flanzamiento) {
		flanzamiento = flanzamiento;
	}
	@Override
	public String toString() {
		return "Medio [Nombre=" + nombre + ", Artista=" + artista + ", Duracion=" + duracion + ", Flanzamiento="
				+ flanzamiento + "]";
	}
	
	

}