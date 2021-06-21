package ClasesAbs1;

public class Libro extends comun implements Prestable{
	
	boolean prestado;


	public Libro(int codigo, String titulo, int fecha) {
		super(codigo, titulo, fecha);
		this.prestado = false;
	}


	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libro -->" + super.toString() + ", prestado=" + prestado;
	}
	
	public void Prestrar() {
		if (prestado == true) {
			System.out.println("No puedes, ya esta prestado");
		} else {
			prestado = true;
			System.out.println("Cuidalo bien");
		}
	}
	
	public void Devolver() {
		if (prestado == true) {
			System.out.println("Gracias moroso");
			prestado = false;
		}
	}

	public boolean Prestado() {
		return prestado;
	}
}
