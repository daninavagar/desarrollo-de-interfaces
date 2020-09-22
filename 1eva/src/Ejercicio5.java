import java.util.Scanner;


public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Calcular el factorial de un número entero positivo a través de la recursividad.
		 * */
	Scanner ReadKey = new Scanner (System.in);
	int number;
	
	
	do {
		System.out.println("Dime un numero positivo y te digo el factorial: ");
		number = ReadKey.nextInt();
	} while (number <= 0);
	
	System.out.println("El factorial de "+number+" es: "+Factorial(number));
	

	
	ReadKey.close();
	
	}
	public static int Factorial(int number) {
		if (number == 0) {
			return 1;
		} else return number * Factorial(number - 1);
		
	}
}
