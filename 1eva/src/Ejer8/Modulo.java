package Ejer8;

public class Modulo {
	
	private String Nombre;
	private int N_Horas;
	private String Profesor;
	private boolean Convalidable;
	
	
	
	public Modulo(String nombre, int n_Horas, String profesor, boolean convalidable) {
		super();
		Nombre = nombre;
		N_Horas = n_Horas;
		Profesor = profesor;
		Convalidable = convalidable;
	}



	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public int getN_Horas() {
		return N_Horas;
	}



	public void setN_Horas(int n_Horas) {
		N_Horas = n_Horas;
	}



	public String getProfesor() {
		return Profesor;
	}



	public void setProfesor(String profesor) {
		Profesor = profesor;
	}



	public boolean isConvalidable() {
		return Convalidable;
	}



	public void setConvalidable(boolean convalidable) {
		Convalidable = convalidable;
	}



	@Override
	public String toString() {
		return "\tModulo Nombre=" + Nombre + ", N_Horas=" + N_Horas + ", Profesor=" + Profesor + ", Convalidable="
				+ Convalidable + "]";
	}
	
	
	

}
