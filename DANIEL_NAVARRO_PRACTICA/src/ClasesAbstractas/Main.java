package ClasesAbstractas;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Leer = new Scanner (System.in);

		System.out.println("\t\tBIBIOTECA");
		System.out.println("Que quieres mostrar \t1. Libro \t2. Revista");
		int opcion = Leer.nextInt();
		switch (opcion) {
			case 1:
				System.out.println("Dime el codgigo del libro");
				int codigo = Leer.nextInt();
				System.out.println("Dime el titulo");
				String titulo = Leer.next();
				System.out.println("Dime el año");
				int año = Leer.nextInt();
				Libro Book = new Libro (codigo, titulo, año);
				Book.Prestrar();
				System.out.println(Book);
				
				break;
			case 2:
				System.out.println("Dime el codgigo de la revista");
				int codigo2 = Leer.nextInt();
				System.out.println("Dime el titulo");
				String titulo2 = Leer.next();
				System.out.println("Dime el año");
				int año2 = Leer.nextInt();
				System.out.println("Numero de revista");
				int nRevista = Leer.nextInt();
				Revista Magazine = new Revista (codigo2, titulo2, año2, nRevista);
				
				System.out.println(Magazine);
				break;
			
		}	
		Leer.close();
	}

}
