package Ejer7;

public class Directivo extends Employer{
	
	
	
	private boolean Salesiano;
	protected enum Turno{Mañana, Tarde} Turno Time;



	public Directivo(String dNI, String Nombre, String Apellidos, double Salario, boolean salesiano,
			Directivo.Turno type) {
		super(dNI, Nombre, Apellidos, Salario);
		Salesiano = salesiano;
		this.Time = type;
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
		return "Directivo\n\t" + super.toString() + ", Salesiano--> " + Salesiano + ", Turno--> " + Time;
	}
	
	
	
}
