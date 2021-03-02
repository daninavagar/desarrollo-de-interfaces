package ClasesAbstractas;

public class comun {
	
	int codigo;
	String titulo;
	int Fecha;
	
	
	public comun(int codigo, String titulo, int fecha) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		Fecha = fecha;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getFecha() {
		return Fecha;
	}


	public void setFecha(int fecha) {
		Fecha = fecha;
	}


	@Override
	public String toString() {
		return "codigo=" + codigo + ", titulo=" + titulo + ", Fecha=" + Fecha;
	}
	
	

}
