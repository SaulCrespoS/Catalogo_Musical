package catalogo;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

import clasesqueordenan.Orden_Artista;
import clasesqueordenan.Orden_Duracion;
import clasesqueordenan.Orden_Fecha;
import clasesqueordenan.Orden_Nombre;
import entidades.CD;
import entidades.Medio;
import entidades.Vinilo;

public class Gestor {
	public ArrayList<Medio> lista;
	
	public Gestor() {
		lista = new ArrayList<Medio>();
	}
	
	public Gestor(ArrayList<Medio> lista) {
		this.lista = lista;
	}
	
	/**
	 * El constructor para crear la lista de objetos con los datos recopilados de un fichero.
	 * 
	 * */
	public Gestor(String[][] tabla) {
		this();
		DateTimeFormatter duracion = DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter fecha = DateTimeFormatter.ofPattern("HH:mm");
		for(int i = 0; i < tabla.length; i++) {
			try {
//				String nombre, String artista, LocalTime duracion, LocalDate flanzamiento,int pulgadas, String[] caraA, String[] caraB
				switch(tabla[i][0]) {
					case "Vinilo" -> lista.add(
						new Vinilo(tabla[i][1],tabla[i][2], LocalTime.parse(tabla[i][3],duracion),
								LocalDate.parse(tabla[i][4], fecha), Integer.parseInt(tabla[i][5]),
								tabla[i][6].split(":"),tabla[i][7].split(":")));
					case "CD" -> lista.add(
						new CD(tabla[i][1],tabla[i][2], LocalTime.parse(tabla[i][3],duracion),LocalDate.parse(tabla[i][4], fecha), tabla[i][5].split(":")));
				}
			} catch (DateTimeException e) {
//				errorLog += "Error en la hora en la línea " + i + ".\n";
			} catch (NumberFormatException e) {
//				errorLog += "Error en el numero de taller en la línea " + i + ".\n";
			}
		}
	}
	
	public String listarPorFecha() {
		Collections.sort(lista, new Orden_Fecha());
		return listarMedios();
	}
	
	public String listarPorArtista() {
		Collections.sort(lista, new Orden_Artista());
		return listarMedios();
	}
	
	public String listarPorDuracion() {
		Collections.sort(lista, new Orden_Duracion());
		return listarMedios();
	}
	
	public String listarPorNombre() {
		Collections.sort(lista, new Orden_Nombre());
		return listarMedios();
	}
	
	public String listarMedios() {
		String temp="";
		for(Medio m:lista) {
			temp+=m + "\n";
		}
		return temp;
	}
}
