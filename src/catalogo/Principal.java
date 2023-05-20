package catalogo;

import java.io.IOException;
import utilidades.Ficheros;

public class Principal {
	public static void main(String[] args) {
		try {
			Gestor g = new Gestor(Ficheros.leerTabla("medios.csv"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
