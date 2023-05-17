package catalogo;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

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
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		for(int i = 0; i < tabla.length; i++) {
			try {
				switch(tabla[i][3]) {
//					case "CD" -> lista.add(
//						new CD(tabla[i][0],tabla[i][1], tabla[i][2], LocalTime.parse(tabla[i][5], df),
//							LocalTime.parse(tabla[i][6], df), tabla[i][4]));
//					case "operador" -> lista.add(
//						new Vinilo(tabla[i][0],tabla[i][1], tabla[i][2], LocalTime.parse(tabla[i][5], df),
//							LocalTime.parse(tabla[i][6], df), Integer.parseInt(tabla[i][4])));
				}
			} catch (DateTimeException e) {
//				errorLog += "Error en la hora en la línea " + i + ".\n";
			} catch (NumberFormatException e) {
//				errorLog += "Error en el numero de taller en la línea " + i + ".\n";
			}
		}
	}
}
