package Ejer8;

public class Modulo{
	
	public String Nombre;
	public int N_Horas;
	public Profesor N_profe;
	public boolean Convalidable;
	
	
	

	public Modulo(String nombre, int n_Horas, Profesor n_profe, boolean convalidable) {
		super();
		Nombre = nombre;
		N_Horas = n_Horas;
		N_profe = n_profe;
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





	public Profesor getN_profe() {
		return N_profe;
	}





	public void setN_profe(Profesor n_profe) {
		N_profe = n_profe;
	}





	public boolean isConvalidable() {
		return Convalidable;
	}





	public void setConvalidable(boolean convalidable) {
		Convalidable = convalidable;
	}


	



	@Override
	public String toString() {
		return "\n\t Modulo: \n\t Nombre--> " + Nombre + ", N_Horas --> " + N_Horas + N_profe.toString() + ", Convalidable --> "
				+ Convalidable;
	}
	
	
	
	
	

}
