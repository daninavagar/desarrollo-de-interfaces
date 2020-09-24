package Ejer8;

// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
// import java.util.Date;

public class Alumno {
	
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private String Nacimiento;
	protected enum Sex{Varon, Mujer, Otro} Sex Sexo;
	private boolean Repetidor;
	private int N_Modulos;
	
	// DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
	// Date fecha = format.parse(getNacimiento());
	
	
	
	public Alumno(String dNI, String nombre, String apellidos, String nacimiento, Sex sexo, boolean repetidor,
			int n_Modulos) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Nacimiento = nacimiento;
		Sexo = sexo;
		Repetidor = repetidor;
		N_Modulos = n_Modulos;
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


	public int getN_Modulos() {
		return N_Modulos;
	}


	public void setN_Modulos(int n_Modulos) {
		N_Modulos = n_Modulos;
	}


	@Override
	public String toString() {
		return "Alumno [DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Nacimiento=" + Nacimiento
				+ ", Sexo=" + Sexo + ", Repetidor=" + Repetidor + ", N_Modulos=" + N_Modulos + "]";
	}

	
	
	
}
