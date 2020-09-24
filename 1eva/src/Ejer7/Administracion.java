package Ejer7;

public class Administracion extends Persona{
	

	private double Salario;
	private String Estudios;
	private int Antigüedad;
	
	
	public Administracion(String dNI, String Nombre, String Apellidos, double salario, String estudios, int antigüedad) {
		super(dNI, Nombre, Apellidos);
		Salario = salario;
		Estudios = estudios;
		Antigüedad = antigüedad;
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
	public int getAntigüedad() {
		return Antigüedad;
	}
	public void setAntigüedad(int antigüedad) {
		Antigüedad = antigüedad;
	}
	@Override
	public String toString() {
		return "Administrativo \n\t" + super.toString() + ", Salario-->" + Salario
				+ ", Estudios--> " + Estudios + ", Antigüedad--> " + Antigüedad;
	}
	
	

}
