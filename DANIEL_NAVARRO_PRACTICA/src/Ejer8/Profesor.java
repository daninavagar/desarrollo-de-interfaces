package Ejer8;

public class Profesor extends Persona{
	
	public int N_asignaturas;
	public boolean tutor;
	
	
	public Profesor(String dNI, String nombre, String apellidos, String f_nacimiento, double salario, int n_asignaturas, boolean tutor) {
		super(dNI, nombre, apellidos, f_nacimiento, salario);
		N_asignaturas = n_asignaturas;
		this.tutor = tutor;
	}


	public int getN_asignaturas() {
		return N_asignaturas;
	}


	public void setN_asignaturas(int n_asignaturas) {
		N_asignaturas = n_asignaturas;
	}


	public boolean isTutor() {
		return tutor;
	}


	public void setTutor(boolean tutor) {
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		return "\n\t Profesor --> " + super.toString() +" N_asignaturas--> " + N_asignaturas + ", tutor--> " + tutor;
	}
	
	
	

}
