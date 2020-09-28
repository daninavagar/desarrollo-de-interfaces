package Ejer8;

public class Alumno extends Persona{
	
	
	public enum Sex{Varon, Mujer, Otro} Sex Sexo;
	public boolean Repetidor;
	public Modulo N_Modulos[];
	public String Datos = "";
	
	
	
	public Alumno(String dNI, String nombre, String apellidos, String f_nacimiento, double salario, Sex sexo, boolean repetidor,
			Modulo[] n_Modulos) {
		super(dNI, nombre, apellidos, f_nacimiento, salario);
		Sexo = sexo;
		Repetidor = repetidor;
		N_Modulos = n_Modulos;
	}



	public Sex getSexo() {
		return Sexo;
	}



	public void setSexo(Sex sexo) {
		Sexo = sexo;
	}



	public boolean isRepetidor() {
		return Repetidor;
	}



	public void setRepetidor(boolean repetidor) {
		Repetidor = repetidor;
	}



	public Modulo[] getN_Modulos() {
		return N_Modulos;
	}


	public void setN_Modulos(Modulo[] n_Modulos) {
		N_Modulos = n_Modulos;
	}



	@Override
	public String toString() {
		Datos += "Alumno:  \n\t "+ super.toString()+ ", Sexo --> " + Sexo + ", Repetidor --> " + Repetidor;
		for (int i=0; i<this.N_Modulos.length; i++) {
			Datos += this.N_Modulos[i];
		}
		return Datos;
	}
	
	
	
	
	
}
