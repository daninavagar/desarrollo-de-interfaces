

public class Ejercicio3 {

	public static void main(String[] args) {
	/*
	 * A partir de un array de enteros, recorrelo y obtener por pantalla la
	 * cantidad total de números pares.
	 * */

	int i, cont = 0;	
	
	int[] intArray = new int[] {1,2,3,4,5,6};
	
	for ( i=0; i < intArray.length ; i++){
		if (i%2==0) {
				cont++;
			}
		System.out.print(intArray[i]+",");
		}
	
	
	System.out.println("\nLa cantidad total de array es: "+cont);
	}

}
