package Coreccion;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio 5: Calcula el factorial de un número entero positivo a través de la
		 * recursividad.
		 */

		System.out.println(factorial(3));

	}

	public static int factorial(int positivo) {
		// caso base o condición de parada
		if (positivo == 1){
			return 1;
		}else {
			return positivo * factorial(positivo - 1);
		}
	}

}
