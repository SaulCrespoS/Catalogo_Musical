package entidades;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

import enums.Generos;

public class Medio {
	
	private String nombre;
	private String artista;
	private Duration duracion;
	private Generos genero;
	private LocalDate flanzamiento;
	
	public Medio() {
		nombre="";
		artista="";
		duracion= Duration.ofMinutes(0);
		flanzamiento=LocalDate.now();
	}
	public Medio(String nombre, String artista, int duracion, LocalDate flanzamiento) {
		this.nombre=nombre;
		this.artista=artista;
		this.duracion= Duration.ofMinutes(duracion);
		this.flanzamiento=flanzamiento;
	}
	
	public Medio(String nombre, String artista, int duracion, LocalDate flanzamiento, Generos genero) {
		this.nombre=nombre;
		this.artista=artista;
		this.duracion= Duration.ofMinutes(duracion);
		this.genero= genero;
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
	public Duration getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = Duration.ofMinutes(duracion);
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
	
	public String toFichero() {
		return nombre + ";" + artista + ";" + duracion + ";" + flanzamiento;
	}
	public Generos getGenero() {
		return genero;
	}
	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	
	

}