package utilidades;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Ficheros {
	public static String[][] leerTabla(String ruta) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(ruta));
		String[][] temp = new String[0][7];
		while(br.ready()) {
			try {
				temp = Arrays.copyOf(temp, temp.length + 1);
				temp[temp.length-1] = br.readLine().split(";");
			} catch (Exception e) {
				System.out.println("Error al leer la línea " + (temp.length - 1));
			}
		}
		br.close();
		return temp;
	}
	
	public static String escribir(String texto, String ruta) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
		String[] temp = texto.split("\n");
		String errorLog = "";
		for (int i = 0; i < temp.length; i++) {
			try {
			bw.write(temp[i]);
			bw.newLine();
			} catch (Exception e) {
				errorLog += "Error al escribir la línea " + i + ": " + temp[i];
			}
		}
		bw.close();
		return errorLog;
	}
}
