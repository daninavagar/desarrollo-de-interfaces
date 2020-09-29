package Ejer8;

import Ejer8.Alumno.Sex;
import java.util.Scanner;


public class Ejercicio8 {
	public static void main(String[] args) {
	
	Scanner LeerTeclado = new Scanner(System.in);
	int opcion;
	
	System.out.println("\t#########################\n\t##     EJERCICIO 8     ##\n        ##       	       ##\n\t#########################");	
	
	
	System.out.println("Pulsa 1 para entrar ó 0 para salir.");
	opcion = LeerTeclado.nextInt();
	
	switch (opcion) {
		
		case 1:
			Profesor Teachers[] = {
					new Profesor ("456456456", "Txema", "González", null, 999.54, 2, true),
					new Profesor ("456456456", "Fernando", "De la Mata", null, 1, 2, true),
					new Profesor ("456456456", "Sergio", "Sanchez-Crespo", null, 1500.3, 5, false),
					new Profesor ("456456456", "Jose Luis", "Alvarez", null, 100000000, 10, true),
			};
			
			Modulo Subjetcs[] = {
					new Modulo ("Programación", 10, Teachers[0], false),
					new Modulo ("Bases de Datos", 8, Teachers[1], true),
					new Modulo ("Desarrollo de Interfaces", 5, Teachers[2], false),
					new Modulo ("Acceso a Datos", 5, Teachers[3], false),
			};
			
			
			Alumno Students[] = {
					new Alumno ("4554545G", "Daniel", "Navarro", "1999/12/04", 0, Sex.Varon, false, Subjetcs),
					new Alumno ("456456G", "Victor", "Tienza", "22/07/2000", 0, Sex.Otro, true, Subjetcs)
			};
			
			for (int  i=0; i<Students.length; i++) {
				System.out.println("\n\t" + Students [i].toString());
			}
			break;
		case 0:
			System.out.println("GRACIAS POR VENIR");
			break;
	}
	
		
	LeerTeclado.close();
	

	} 
}
