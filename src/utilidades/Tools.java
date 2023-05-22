package utilidades;

public abstract class Tools {
	public static String toFicheroArray(String[] array) {
		String temp ="";
		for(String s:array) {
			temp+=s+":";
		}
		return temp;
	}
}
