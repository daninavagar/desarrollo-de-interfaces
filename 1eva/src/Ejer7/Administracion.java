package Ejer7;

public class Administracion extends Employer{
	

	
	private String Estudios;
	private int AntigŁedad;
	
	
	public Administracion(String dNI, String Nombre, String Apellidos, double salario, String estudios, int antigŁedad) {
		super(dNI, Nombre, Apellidos, salario);
		Estudios = estudios;
		AntigŁedad = antigŁedad;
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
		return "Administrativo \n\t" + super.toString() + ", Estudios--> " + Estudios + ", AntigŁedad--> " + AntigŁedad;
	}
	
	

}
