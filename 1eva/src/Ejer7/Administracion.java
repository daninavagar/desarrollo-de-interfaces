package Ejer7;

public class Administracion extends Persona{
	

	private double Salario;
	private String Estudios;
	private int Antig�edad;
	
	
	public Administracion(String dNI, String Nombre, String Apellidos, double salario, String estudios, int antig�edad) {
		super(dNI, Nombre, Apellidos);
		Salario = salario;
		Estudios = estudios;
		Antig�edad = antig�edad;
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
		return "Administrativo \n\t" + super.toString() + ", Salario-->" + Salario
				+ ", Estudios--> " + Estudios + ", Antig�edad--> " + Antig�edad;
	}
	
	

}
