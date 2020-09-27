package Ejer8;


public class Alumno {
	
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private String Nacimiento;
	protected enum Sex{Varon, Mujer, Otro} Sex Sexo;
	private boolean Repetidor;
	private Modulo N_Modulos[];
	
	
	
	
	
	public Alumno(String dNI, String nombre, String apellidos, String nacimiento, Sex sexo, boolean repetidor,
			 Modulo[] n_Modulos) {
		super();
		this.DNI = dNI;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Nacimiento = nacimiento;
		this.Sexo = sexo;
		this.Repetidor = repetidor;
		this.N_Modulos = n_Modulos;
	}


	


	public Alumno(Modulo[] n_Modulos) {
		super();
		
	}





	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getNacimiento() {
		return Nacimiento;
	}


	public void setNacimiento(String nacimiento) {
		Nacimiento = nacimiento;
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
		return "Alumno [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Nacimiento=" + Nacimiento
				+ ", Sexo=" + Sexo + ", Repetidor=" + Repetidor + ", N_Modulos=" + N_Modulos + "]";
	}

	
	
	
}
