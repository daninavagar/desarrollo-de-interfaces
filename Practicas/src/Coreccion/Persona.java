package Coreccion;
public class Persona {

	//1. atributos
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected double salario;
	
	
	//2. método constructor
	public Persona(String dni, String nombre, String apellidos, double salario) {

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}

	//3. Métodos get & set
	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombreAp(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
//4. Método toString
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
