package Coreccion;
public class Directivo extends Persona {

	//1. atributos	
	private	boolean salesiano;
	private char turno; //M --> mañana, T --> tarde

	//2. método constructor
	public Directivo(String dni, String nombre, String apellidos, double salario, boolean salesiano, char turno) {
		super(dni, nombre, apellidos, salario);
		this.salesiano = salesiano;
		this.turno = turno;
	}

	//3. get & set	

	protected boolean isSalesiano() {
		return salesiano;
	}

	protected void setSalesiano(boolean salesiano) {
		this.salesiano = salesiano;
	}

	protected char getTurno() {
		return turno;
	}

	protected void setTurno(char turno) {
		this.turno = turno;
	}
	
//4. toString
	@Override
	public String toString() {
		return "Directivo [salesiano=" + salesiano + ", turno=" + turno + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}

	

	
	
	
	
	
	
	
}
