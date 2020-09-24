package Ejer7;

public class Directivo extends Persona{
	
	
	private double Salario;
	private boolean Salesiano;
	protected enum Turno{Mañana, Tarde} Turno Time;



	public Directivo(String dNI, String Nombre, String Apellidos, double salario, boolean salesiano,
			Directivo.Turno type) {
		super(dNI, Nombre, Apellidos);
		Salario = salario;
		Salesiano = salesiano;
		this.Time = type;
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
		return "Directivo\n\t" + super.toString() + ", Salario--> " + Salario
				+ ", Salesiano--> " + Salesiano + ", Turno--> " + Time;
	}
	
	
	
}
