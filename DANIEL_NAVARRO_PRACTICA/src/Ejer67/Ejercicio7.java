package Ejer67;

import java.util.Scanner;

import Ejer67.Directivo.Turno;



public class Ejercicio7{

	public static void main(String[] args) {
	
	int opcion;
	Scanner ReadKey = new Scanner(System.in);
	System.out.println("\t#########################\n\t##     EJERCICIO 7     ##\n        ##       	       ##\n\t#########################");
	
	System.out.println("Dime una opcion: \n\t 1. Datos Profesor \t 2. Datos Administrativo \t 3. Datos Directivo \t4. SALIR");
	opcion = ReadKey.nextInt();
	
	
	switch (opcion) {
		case 1:
			Profesor profe1 = new Profesor ("52906609P", "Daniel", "Navarro", 55.5, 3, false);
			Profesor profe2 = new Profesor ("52906609P", "Victor", "Tienza", 55.5, 3, false);
			System.out.println("\n\t"+profe1+"\n\t"+profe2);
			break;
		case 2:
			Administracion Ad1 = new Administracion ("52906609P", "Óscar", "Vela" , 123.2, "Magisterio", 3);
			Administracion Ad2 = new Administracion ("52906609P", "Nacho", "Garcia" , 5567.2, "Finanzas", 7);
			System.out.println("\n\t"+Ad1+"\n\t"+Ad2);
			break;
		case 3:
			Directivo Dir1 = new Directivo ("5464654", "Diego", "Martin", 11021.3, false, Turno.Tarde) ;
			Directivo Dir2 = new Directivo ("5464654", "Victor", "Guerra", 9854.2, false, Turno.Mañana);
			System.out.println("\n\t"+Dir1+"\n\t"+Dir2);
			break;
		case 4:
			System.out.println("GRACIAS POR VENIR");
			break;
	}

	ReadKey.close();
	}
}
