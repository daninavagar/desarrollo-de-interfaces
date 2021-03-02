package Coreccion;
public class Empleado {

	//1. atributos
	String dni;
	String nombreAp;
	double salario;
	
	//2. constructor
	public Empleado(String dni, String nombreAp, double salario) {
		this.dni = dni;
		this.nombreAp = nombreAp;
		this.salario = salario;
	}

	//3. get & set
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreAp() {
		return nombreAp;
	}

	public void setNombreAp(String nombreAp) {
		this.nombreAp = nombreAp;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	//4. toString
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombreAp=" + nombreAp + ", salario=" + salario + "]";
	}
	
	
	
}
