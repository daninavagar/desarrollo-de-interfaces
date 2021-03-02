package Coreccion;
import java.text.DateFormat;

import java.util.Calendar;
import java.util.Date;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creando profes...
		Profesor profe1 = new Profesor("5678904T", "Txema ", "Gonzalez", 1000.00, 8, true);
		Profesor profe2 = new Profesor("5934122B", "Jose L. ", "Alvarez", 1000.00, 5, true);
		
		// creando personal de admon...
		Administracion admin1 = new Administracion("6459912L", "Enrique ", "Donoso", 1552.22, "Ingeniero", 3);
		Administracion admin2 = new Administracion("7889594K", "Eva","Huertas", 1466.31, "Diplomada", 1);
		
		// creando directivos...
		Directivo d1 = new Directivo("5147331M", "Manuel ","de Castro", 1675.15, true, 'T');
		Directivo d2 = new Directivo("5698443F", "Javier ", "Pozo", 1623.04, false, 'M');
		
		System.out.println(profe1.toString());
		System.out.println(profe2.getSalario());
		System.out.println(admin1.toString());
		System.out.println(admin2.toString());
		System.out.println(d1.isSalesiano());
		System.out.println(d2.toString());
		
		
		Modulo uno=new Modulo("SMR", 1000, profe1, false);
		Modulo dos= new Modulo("Teleco",2000,new Profesor("4567896A", "Jesús", "Martinez", 20000, 7, true),true) ;
		System.out.println(uno.toString());
		System.out.println(dos.toString());
		
		@SuppressWarnings("deprecation")
		Alumno Juan=new Alumno("147A", "Juan", "Perez", new Date(99, 2, 12) , 'V', true, uno);
		Alumno Ana=new Alumno("963147A", "Ana", "Diaz",  new Date(110, 2, 12) , 'H', false, dos);
		System.out.println(Juan.toString());
		System.out.println(Ana.toString());
		
	}

}
