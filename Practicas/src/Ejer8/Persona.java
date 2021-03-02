package Ejer8;

public class Persona {
	
	public String DNI;
	public String Nombre;
	public String Apellidos;
	public String F_Nacimiento;
	public double Salario;
	
	
	public Persona(String dNI, String nombre, String apellidos, String f_Nacimiento, double salario) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		F_Nacimiento = f_Nacimiento;
		Salario = salario;
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
	public String getF_Nacimiento() {
		return F_Nacimiento;
	}
	public void setF_Nacimiento(String f_Nacimiento) {
		F_Nacimiento = f_Nacimiento;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "\n\t DNI -->" + DNI + ", Nombre--> " + Nombre + ", Apellidos --> " + Apellidos + ", F_Nacimiento--> "
				+ F_Nacimiento + ", Salario --> " + Salario + "€";
	}
	
	
	
	
	
	

}
