package Ejer67;

public class Administracion extends Employer{
	

	
	private String Estudios;
	private int Antig�edad;
	
	
	public Administracion(String dNI, String Nombre, String Apellidos, double salario, String estudios, int antig�edad) {
		super(dNI, Nombre, Apellidos, salario);
		Estudios = estudios;
		Antig�edad = antig�edad;
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
		return "Administrativo \n\t" + super.toString() + ", Estudios--> " + Estudios + ", Antig�edad--> " + Antig�edad;
	}
	
	

}
