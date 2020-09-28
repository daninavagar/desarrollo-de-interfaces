package Ejer67;

public class Employer {

	public String DNI;
	public String Nombre;
	public String Apellidos;
	public double Salario;
	
	
	public Employer(String dNI, String nombre, String apellidos, double salario) {
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
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


	@Override
	public String toString() {
		return " DNI--> " + DNI + ", Nombre--> " + Nombre + ", Apellidos--> " + Apellidos + ", Salario --> " + Salario;
	}
	
	
	
}
