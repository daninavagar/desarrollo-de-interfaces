package Practicas;

public class Administracion {
	
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private double Salario;
	private String Estudios;
	private int Antig�edad;
	
	
	public Administracion(String dNI, String nombre, String apellidos, double salario, String estudios, int antig�edad) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Salario = salario;
		Estudios = estudios;
		Antig�edad = antig�edad;
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
	public String getEstudios() {
		return Estudios;
	}
	public void setEstudios(String estudios) {
		Estudios = estudios;
	}
	public int getAntig�edad() {
		return Antig�edad;
	}
	public void setAntig�edad(int antig�edad) {
		Antig�edad = antig�edad;
	}
	@Override
	public String toString() {
		return "Adminstracion DNI--> " + DNI + ", Nombre--> " + Nombre + ", Apellidos--> " + Apellidos + ", Salario-->" + Salario
				+ ", Estudios--> " + Estudios + ", Antig�edad--> " + Antig�edad;
	}
	
	

}
