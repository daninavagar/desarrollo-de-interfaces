package Practicas;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
	/* 
	* Crear una matriz de enteros de n x n (tama�o lo decide el usuario), rellenar co n�meros aleatorios, recorrerla y dar la suma de todos sus n�meros.
	* */
	
	int numero, suma = 0;
	
	
	Scanner ReadKey = new Scanner(System.in);
		
	System.out.println("\t#########################\n\t##     EJERCICIO 4     ##\n        ##       	       ##\n\t#########################");
	
	System.out.println("Dime un numero: ");
	numero = ReadKey.nextInt();
	int matriz[][] = new int[numero][numero];
	
	System.out.println("La matriz es: \n\n\t");
	for (int i=0; i<matriz.length;i++) {
		for (int f = 0; f<matriz[i].length; f++) {
			matriz[i][f] = (int) Math.floor(Math.random()*10);
			System.out.print("\t"+matriz[i][f]);
		}
		System.out.println();
	}
	
	for (int i=0; i<matriz.length;i++) 
		for (int f = 0; f<matriz[i].length; f++) 
			suma += matriz[i][f];
	System.out.println("La suma es: "+suma);
	
	

	
	
	ReadKey.close();
	}

}
