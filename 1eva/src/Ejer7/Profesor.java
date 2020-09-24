package Ejer7;

public class Profesor extends Persona{

	
	private double Salario;
	private int N_asignaturas;
	private boolean Tutor;
	
	
	
	public Profesor(String dNI, String Nombre, String Apellidos, double salario, int n_asignaturas, boolean tutor) {
		super(dNI, Nombre, Apellidos);
		Salario = salario;
		N_asignaturas = n_asignaturas;
		Tutor = tutor;
	}

	public double getSalario() {
		return Salario;
	}



	public void setSalario(double salario) {
		Salario = salario;
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
		return "Profesor = \n\t1" + super.toString() + ", Salario--> " + Salario
				+ ", N_asignaturas--> " + N_asignaturas + ", Tutor--> " + Tutor;
	}
	
	

}
