package Coreccion;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Ejercicio 3: A partir de un array de enteros, recorrerlo y
		obtener por pantalla la cantidad total de números pares */
		
		int contador = 0;
		int [] array = {9, 15, 21, 252, 20, 19, 22, 43, 44, 0, 1001, 78, 79, -5};
		//              0
		for (int i=0; i<array.length; i++) {
			if  (array[i]%2==0) contador++;
		}
		
		System.out.println("Hay "+contador+" pares");
		// Resultado = Hay 6 pares
		
	}

}
