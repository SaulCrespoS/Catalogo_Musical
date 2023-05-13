
/**
 * CATALOGO MUSICAL
 * 
 * 
 * Paquete Catalogo---------------------------- Saul
 * 
 * PRINCIPAL
 * 		
 * 		Cargar datos desde archivos
 * 		Menú
 * 			- Añadir Medio
 * 			- Listar Albumes
 * 				(Ordenar por)
 * 			- Ver Album
 * 			- Eliminar Medio
 * 			- Salir
 * 		Guardar datos en archivos
 * 
 * Clases (entidades)
 * 
 * GESTOR
 * 		- Lista de albumes. HashMap<String,Medio>
 * 		- Lista de pistas. ArrayList<Pista>
 * 
 * Paquete Entidades----------------------------- Javier
 * 
 * MEDIO
 * 		- Nombre (String)
 *		- Artista (String)
 *		- Duracion (LocalTime)
 *		- Género (enum)
 *		- Fecha de lanzamiento (LocalDate)
 *		getters()
 *		setters()
 *		toString()
 *		toFichero()
 * 		CD
 * 			- Cubierta (enum)
 * 			- Pistas (Array de Pistas)
 * 			getNumPistas()
 * 
 * 		VINILO
 * 			- Pulgadas. (int) 
 * 			- Cara_A (Array de pistas)
 * 			- Cara_B (Array de pistas)
 * 			getNumPistas()
 * 		PISTA
 * 			- Numero (int)
 * 
 * 	Paquete enums----------------------------------	Miguel
 * 
 * ENUMS
 *		- CUBIERTAS
 *		- GENEROS
 * 
 * Paquete interfaces------------------------------- Keyla
 * 
 * INTERFACES
 * 		FECHA implements Comparator<Medio>
 * 		NOMBRE implements Comparator<Medio> 
 * 		ARTISTA implements Comparator<Medio>
 * 		DURACIÓN implements Comparator<Medio>
 * 		GÉNERO implements Comparator<Medio>
 * 
 * Paquete utilidades-------------------------------- Saúl 
 * 
 * 		FICHEROS
 * 			leerArchvio()
 * 			escribirArchivo()
 * 		CONSOLA (Ya esta hecho por Saul).
 * 	
 * Paquete archivos----------------------------------
 * 		ALBUMES.txt
 * 
 * 
 * 
 * @author Saul Crespo, Keyla Condori, Miguel Fernandez, Javier Campocosío
 *
 */
module Catalogo_Musical {
}