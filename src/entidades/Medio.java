package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Medio {
	
	private String nombre;
	private String artista;
	private LocalTime duracion;
//	private enum genero;
	private LocalDate flanzamiento;
	
	public Medio() {
		nombre="";
		artista="";
		duracion= LocalTime.now();
//		genero="";
		flanzamiento=LocalDate.now();
	}
	public Medio(String nombre, String artista, LocalTime duracion, LocalDate flanzamiento) {
		this.nombre=nombre;
		this.artista=artista;
		this.duracion=duracion;
//		this.genero=Genero;
		this.flanzamiento=flanzamiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public LocalTime getDuracion() {
		return duracion;
	}
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	public LocalDate getFlanzamiento() {
		return flanzamiento;
	}
	public void setFlanzamiento(LocalDate flanzamiento) {
		this.flanzamiento = flanzamiento;
	}
	@Override
	public String toString() {
		return "Medio [Nombre=" + nombre + ", Artista=" + artista + ", Duracion=" + duracion + ", Flanzamiento="
				+ flanzamiento + "]";
	}
	
	

}