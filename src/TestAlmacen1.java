// Clase de prueba COMPLETAR EL C�DIGO DEL M�TODO procesar Opci�n

import java.util.Scanner;
/**
 * 
 * @author raquel
 *
 */
public class TestAlmacen1 {
/**
 * metodo principal para probar el Almacen1
 * @param argv no se utiliza en este caso
 */
	static public void main(String[] argv) {

		Almacen1 prueba = new Almacen1();
		Scanner sc = new Scanner(System.in);
		int opcion;

		mostrarMenu();
		opcion = sc.nextInt();
		while (opcion != 0) {
			procesarOpcion(opcion, prueba);
			mostrarMenu();
			opcion = sc.nextInt();
		}
		sc.close();
		
	}
	/**
	 * Muestra el menu con las distintas operaciones que se puede realizar
	 */

	static void mostrarMenu() {
		System.out.println("--- MEN� DE  CONTROL DEL ALMAC�N -----");
		System.out.println(" 1.- Mostrar contenido del Almac�n");
		System.out.println(" 2.- Poner un Valor  ");
		System.out.println(" 3.- Buscar un Valor ");
		System.out.println(" 4.- Borrar un Valor");
		System.out.println(" 5.- Contar posiciones ocupadas.");
		System.out.println(" 6.- Contar posiciones libres.");
		System.out.println(" 0.- Terminar");
            System.out.print(" Introduzca una opci�n:[1-6]:");
	}

	// Procesa la opci�n introducida operando sobre el objeto Almacen1
	/**
	 * Realiza la opci�n que hemos seleccionado
	 * @param opcion este parametro contiene la opcion que hemos elegido
	 * @param parAlmacen Hace referencia a nuestro almacen
	 */
	static void procesarOpcion(int opcion, Almacen1 parAlmacen) {
		Scanner sc = new Scanner(System.in);

		// Completar......

		switch (opcion) {
		case 1:
			System.out.println("El contenido del Almac�n es:"+ parAlmacen.toString());
			break;
		case 2:
			System.out.println("Introduzca un n�mero:");
			int num = sc.nextInt();
			parAlmacen.ponValor(num);
			break;
		case 3:
			System.out.println("Introduzca un n�mero:");
			num = sc.nextInt();
			parAlmacen.estaValor(num);
			break;
		case 4:
			System.out.println("Introduzca un n�mero:");
			num = sc.nextInt();
			parAlmacen.sacarValor(num);
			break;
		case 5:
			System.out.println(" Posiciones ocupadas = " +  parAlmacen.numPosicionesOcupadas());
			break;

		case 6:
		  System.out.println(" Posiciones libres = " +  parAlmacen.numPosicionesLibres());
		}

	}

}
