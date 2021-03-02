package Coreccion;
import java.util.Date;
import java.util.List;

public class Alumno {

	
	//1. atributos	
	private String dni;
	private String nombre;
	private String apellidos;
	private Date fechaN;
	private char sexo;
	private boolean repetidor;
	//private List<Modulo> modulos;
	private Modulo unModdulo;
	
	//2. método constructor
	
	public Alumno(String dni, String nombre, String apellidos, Date fechaN, char sexo, boolean repetidor,
			Modulo unModdulo) {
		 
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaN = fechaN;
		this.sexo = sexo;
		this.repetidor = repetidor;
		this.unModdulo = unModdulo; 
				      //new Modulo("DAM", 1200, new Profesor("123T", "Fernando", "Mata", 1000, 5, true), true);
				
	}
	
	//3. Métodos get & set		
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechaN() {
		return fechaN;
	}

	public void setFechaN(Date fechaN) {
		this.fechaN = fechaN;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public Modulo getUnModdulo() {
		return unModdulo;
	}

	public void setUnModdulo(Modulo unModdulo) {
		this.unModdulo = unModdulo;
	}
	
	//4. toString

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaN=" + fechaN
				+ ", sexo=" + sexo + ", repetidor=" + repetidor + ", unModdulo=" + unModdulo + "]";
	}
			
}
