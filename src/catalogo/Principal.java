package catalogo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entidades.CD;
import entidades.Vinilo;
import utilidades.Consola;
import utilidades.Ficheros;

public class Principal {
	public static void main(String[] args) {
		boolean run = true;
		try {
			Gestor g;
			try {
				g = new Gestor(Ficheros.leerTabla("medios.csv"));
			} catch (IOException e) {
				g = new Gestor();
			}
			
			Consola c = new Consola();
			
			do {
				switch(c.inbr("Bienvenido al catálogo musical. ¿Qué desea hacer?"
						+ "1) Añadir album\t2)Listar albumes\t3) Eliminar album\t4) Salir").charAt(0)) {
						case '1' -> System.out.println(add(c,g));
						case '2' -> System.out.println(list(c,g));
						case '3' -> System.out.println(delete(c,g));
						case '4' -> run = false;
						default -> System.out.println("Lo siento, entrada no válida.");
				}
			} while(run);
			System.out.println("¡Hasta pronto!");
			Ficheros.escribir(g.listarMedios(), "medios.csv");
		} catch (IOException e) {
			System.out.println("Algo malo ha ocurrido.");
		}
	}
	
	public static String add(Consola c, Gestor g) {
		try {
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String[] datos = new String[7];
			datos[0] = c.in("Introduzca nombre del álbum");
			datos[1] = c.in("Introduzca nombre del artista");
			datos[2] = c.in("Introduzca duración del álbum");
			datos[3] = c.in("Introduzca fecha de lanzamiento");
			switch(c.in("¿Desea añadir un CD o un vinilo?").toLowerCase().charAt(0)) {
				case 'c' -> {
					datos[4] = c.in("Introduzca número de pistas");
					String[] pistas = new String[Integer.parseInt(datos[4])];
					for(int i = 0; i < pistas.length; i++) {
						pistas[i] = c.in("Introduzca nombre de la pista " + (i + 1));
					}
					g.add(new CD(datos[0],datos[1],Integer.parseInt(datos[2]),
							LocalDate.parse(datos[3], df),pistas));
				}
				case 'v' -> {
					datos[4] = c.in("Introduzca pulgadas");
					datos[5] = c.in("Introduzca número de pistas (cara A)");
					String[] pistasA = new String[Integer.parseInt(datos[5])];
					for(int i = 0; i < pistasA.length; i++) {
						pistasA[i] = c.in("Introduzca nombre de la pista " + (i + 1));
					}
					datos[5] = c.in("Introduzca número de pistas (cara B)");
					String[] pistasB = new String[Integer.parseInt(datos[5])];
					for(int i = 0; i < pistasB.length; i++) {
						pistasB[i] = c.in("Introduzca nombre de la pista " + (i + 1));
					}
					g.add(new Vinilo(datos[0],datos[1],Integer.parseInt(datos[2]),
							LocalDate.parse(datos[3], df),Integer.parseInt(datos[4]),pistasA,pistasB));
				}
			}
			return "El álbum " + datos[0] + " ha sido añadido exitosamente.";
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		return "Error al añadir el álbum";	
	}
	
	public static String list(Consola c, Gestor g) {
		String temp = "";
		switch(c.in("Introduzca el parámetro por el que desea ordenar la lista").toLowerCase().charAt(0)) {
			case 'a' -> temp = g.listarPorArtista();
			case 'd' -> temp = g.listarPorDuracion();
			case 'f' -> temp = g.listarPorFecha();
			case 'n' -> temp = g.listarPorNombre();
			default -> temp = g.listarMedios();
		}
		return temp;
	}
	
	public static String delete(Consola c, Gestor g) {
		return g.delete(c.in("Introduzca el nombre del álbum a eliminar"));
	}
}
