package entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vinilo extends Medio {
	private int pulgadas;
	private String[] caraA=new String[10];
	private String[] caraB=new String[10];
	
	public Vinilo() {
		super();
		this.pulgadas=1;
		this.caraA=caraA;
		this.caraB=caraB;
	}
	public Vinilo(String nombre, String artista, int duracion, LocalDate flanzamiento,int pulgadas, String[] caraA, String[] caraB) {
		super(nombre,artista, duracion, flanzamiento);
		this.pulgadas=pulgadas;
		this.caraA=caraA;
		this.caraB=caraB;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String[] getCaraA() {
		return caraA;
	}
	public void setCaraA(String[] caraA) {
		this.caraA = caraA;
	}
	public String[] getCaraB() {
		return caraB;
	}
	public void setCaraB(String[] caraB) {
		this.caraB = caraB;
	}

//	public String toString(){
//		return "nombre"+getNombre();+" artista "+getArtista()+" duración "+getDuracion()+ " genero de la canción "+ getGenero() +" Fecha de salida "+ gerFlanzamiento()
//		+" pulgadas "+getPulgadas()+" canciones cara A "+getCaraA()+" canciones cara B "+getCaraB();
}
	
