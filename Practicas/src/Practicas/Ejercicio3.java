package Practicas;


public class Ejercicio3 {

	public static void main(String[] args) {

	System.out.println("\t#########################\n\t##     EJERCICIO 3     ##\n        ##       	       ##\n\t#########################");

	int i, cont = 0;	
	
	int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};
	
	System.out.print("Array: ");
	for ( i=0; i < intArray.length ; i++){
		if (i%2==0) {
				cont++;
			}
		System.out.print(intArray[i]+",");
		}
	
	
	System.out.println("\nLa cantidad total de array es: "+cont);
	}

}
