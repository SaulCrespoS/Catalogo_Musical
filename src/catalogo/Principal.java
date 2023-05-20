package catalogo;

import java.io.IOException;

import utilidades.Consola;
import utilidades.Ficheros;

public class Principal {
	public static void main(String[] args) {
		boolean run = true;
		try {
			Gestor g = new Gestor(Ficheros.leerTabla("medios.csv"));
			Consola c = new Consola();
			
			do {
				switch(c.inbr("Bienvenido al catálogo musical. ¿Qué desea hacer?"
						+ "1) Añadir album\t2)Listar albumes\t3) Eliminar album\t4) Salir").charAt(0)) {
						case '1' -> System.out.println(add(c));
						case '2' -> System.out.println(list(c));
						case '3' -> System.out.println(delete(c));
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
	
	public static String add(Consola c) {
		return "";
	}
	
	public static String list(Consola c) {
		return "";
	}
	
	public static String delete(Consola c) {
		return "";
	}
}
