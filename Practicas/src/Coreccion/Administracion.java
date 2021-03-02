package Coreccion;


public class Administracion extends Persona {

	//1. atributos
	
	private	String estudios; // M -> mujer, H -> hombre	
	private int antig;
	
	//2. método constructor
	
	public Administracion(String dni, String nombre, String apellidos, double salario, String estudios, int antig) {
		super(dni, nombre, apellidos, salario);
		this.estudios = estudios;
		this.antig = antig;
	}

	//3. Métodos get & set	

	protected String getEstudios() {
		return estudios;
	}

	protected void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	protected int getAntig() {
		return antig;
	}

	protected void setAntig(int antig) {
		this.antig = antig;
	}
	
	
//4. toString
	@Override
	public String toString() {
		return "Administracion [estudios=" + estudios + ", antig=" + antig + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}

	
	
	
}
