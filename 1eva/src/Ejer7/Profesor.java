package Ejer7;

public class Profesor extends Employer{

	
	
	private int N_asignaturas;
	private boolean Tutor;
	
	
	
	public Profesor(String dNI, String Nombre, String Apellidos, double Salario, int n_asignaturas, boolean tutor) {
		super(dNI, Nombre, Apellidos, Salario);
		N_asignaturas = n_asignaturas;
		Tutor = tutor;
	}



	public int getN_asignaturas() {
		return N_asignaturas;
	}



	public void setN_asignaturas(int n_asignaturas) {
		N_asignaturas = n_asignaturas;
	}



	public boolean isTutor() {
		return Tutor;
	}



	public void setTutor(boolean tutor) {
		Tutor = tutor;
	}



	@Override
	public String toString() {
		return "Profesor = \n\t1" + super.toString() + ", N_asignaturas--> " + N_asignaturas + ", Tutor--> " + Tutor;
	}
	
	

}
