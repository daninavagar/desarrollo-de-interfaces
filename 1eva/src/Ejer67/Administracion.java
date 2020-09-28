package Ejer67;

public class Administracion extends Employer{
	

	
	private String Estudios;
	private int Antigüedad;
	
	
	public Administracion(String dNI, String Nombre, String Apellidos, double salario, String estudios, int antigüedad) {
		super(dNI, Nombre, Apellidos, salario);
		Estudios = estudios;
		Antigüedad = antigüedad;
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
		return "Administrativo \n\t" + super.toString() + ", Estudios--> " + Estudios + ", Antigüedad--> " + Antigüedad;
	}
	
	

}
