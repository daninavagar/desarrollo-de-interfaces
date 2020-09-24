package Ejer8;

import Ejer8.Alumno.Sex;

public class Ejercicio8 {
	public static void main(String[] args) {
		
	
	
	System.out.println("\t#########################\n\t##     EJERCICIO 8     ##\n        ##       	       ##\n\t#########################");
	
	Alumno Al1 = new Alumno("4554545G", "Daniel", "Navarro", "04/12/1999", Sex.Varon, false, 5);
	Alumno Al2 = new Alumno("456456G", "Victor", "Tienza", "22/07/2000", Sex.Otro, true, 10);
	System.out.println("\n\t"+Al1+"\n\t"+Al2);
	
	Modulo M1 = new Modulo("Desarrollo de Interfaces", 100, "Sergio", false);
	
	System.out.println(M1);
	
	} 
}
