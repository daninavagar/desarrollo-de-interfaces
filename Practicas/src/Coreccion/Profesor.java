package Coreccion;
public class Profesor extends Persona {

	//1. atributos	
	private int asignaturas;
	private boolean tutor;
	
	//2. método constructor
	
	public Profesor(String dni, String nombre, String apellidos, double salario, int asignaturas, boolean tutor) {
		super(dni, nombre, apellidos, salario);
		this.asignaturas = asignaturas;
		this.tutor = tutor;
	}

	//3. Métodos get & set		
	
	protected int getAsignaturas() {
		return asignaturas;
	}

	protected void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	protected boolean isTutor() {
		return tutor;
	}

	protected void setTutor(boolean tutor) {
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		return "Profesor [asignaturas=" + asignaturas + ", tutor=" + tutor + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
