
public class Ejercicio6 {

	public static void main(String[] args) {
	/*
	 * 	El centro quiere informatizar a sus trabajadores en un software implementando en Java. A partir de los datos que se muestran a continuacion,
	 * 	programa el sotfware y crear 6 objetos de prueba mostrando su informacion por pantalla.
	 * */
	
		
	System.out.println("\t#########################\n\t##     EJERCICIO 6     ##\n        ##       	       ##\n\t#########################");
	
	// Profesor
	char DNI;
	String Nombre = "Daniel";
	String Apellidos = "Navarro Garcia";
	double Salario = 999.54;
	int N_asignaturas = 5;
	Boolean Tutor = true;
	
	Datos Profe1 = new Profesor (DNI, Nombre, Apellidos, Salario, N_asignaturas, Tutor);
	}
}
