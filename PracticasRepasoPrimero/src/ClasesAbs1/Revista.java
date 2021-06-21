package ClasesAbs1;

public class Revista extends comun{
	
	int nRevista;

	public Revista(int codigo, String titulo, int fecha, int nRevista) {
		super(codigo, titulo, fecha);
		this.nRevista = nRevista;
	}

	public int getnRevista() {
		return nRevista;
	}

	public void setnRevista(int nRevista) {
		this.nRevista = nRevista;
	}

	@Override
	public String toString() {
		return "Revista --> " + super.toString() + "nRevista=" + nRevista;
	}
	
	

}
