package Practicas;

public class Profesor{

	private String DNI;
	private String Nombre;
	private String Apellidos;
	private double Salario;
	private int N_asignaturas;
	private boolean Tutor;
	
	
	
	public Profesor(String dNI, String nombre, String apellidos, double salario, int n_asignaturas, boolean tutor) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Salario = salario;
		N_asignaturas = n_asignaturas;
		Tutor = tutor;
	}



	public String getDNI() {
		return DNI;
	}



	public void setDNI(String dNI) {
		DNI = dNI;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getApellidos() {
		return Apellidos;
	}



	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}



	public double getSalario() {
		return Salario;
	}



	public void setSalario(double salario) {
		Salario = salario;
	}



	public int getN_asignaturas() {
		return N_asignaturas;
	}



	public void setN_asignaturas(int n_asignaturas) {
		N_asignaturas = n_asignaturas;
	}



	public boolean isTutor() {
		return Tutor;
	}



	public void setTutor(boolean tutor) {
		Tutor = tutor;
	}



	@Override
	public String toString() {
		return "Profesor DNI-->" + DNI + ", Nombre--> " + Nombre + ", Apellidos--> " + Apellidos + ", Salario--> " + Salario
				+ ", N_asignaturas--> " + N_asignaturas + ", Tutor--> " + Tutor;
	}
	
	

}
