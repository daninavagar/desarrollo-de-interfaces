package Ejer7;

public class Administracion extends Persona{
	

	private double Salario;
	private String Estudios;
	private int AntigŁedad;
	
	
	public Administracion(String dNI, String Nombre, String Apellidos, double salario, String estudios, int antigŁedad) {
		super(dNI, Nombre, Apellidos);
		Salario = salario;
		Estudios = estudios;
		AntigŁedad = antigŁedad;
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
	public int getAntigŁedad() {
		return AntigŁedad;
	}
	public void setAntigŁedad(int antigŁedad) {
		AntigŁedad = antigŁedad;
	}
	@Override
	public String toString() {
		return "Administrativo \n\t" + super.toString() + ", Salario-->" + Salario
				+ ", Estudios--> " + Estudios + ", AntigŁedad--> " + AntigŁedad;
	}
	
	

}
