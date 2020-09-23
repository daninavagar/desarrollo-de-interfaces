package Practicas;

public class Directivo {
	
	private String DNI;
	private String Nombre;
	private String Apellidos;
	private double Salario;
	private boolean Salesiano;
	public enum Turno{Mañana, Tarde} Turno Time;



	public Directivo(String dNI, String nombre, String apellidos, double salario, boolean salesiano,
			Directivo.Turno type) {
		super();
		DNI = dNI;
		Nombre = nombre;
		Apellidos = apellidos;
		Salario = salario;
		Salesiano = salesiano;
		this.Time = type;
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



	public double getSalario() {
		return Salario;
	}



	public void setSalario(double salario) {
		Salario = salario;
	}



	public boolean isSalesiano() {
		return Salesiano;
	}



	public void setSalesiano(boolean salesiano) {
		Salesiano = salesiano;
	}



	public Turno getType() {
		return Time;
	}



	public void setType(Turno type) {
		this.Time = type;
	}



	@Override
	public String toString() {
		return "Directivo DNI--> " + DNI + ", Nombre--> " + Nombre + ", Apellidos--> " + Apellidos + ", Salario--> " + Salario
				+ ", Salesiano--> " + Salesiano + ", Turno--> " + Time;
	}
	
	
	
}
