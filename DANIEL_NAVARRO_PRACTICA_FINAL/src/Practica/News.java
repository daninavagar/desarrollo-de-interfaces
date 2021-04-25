package Practica;

public class News {

	private String nombre;
	private String pwd;
	private String noticia;
	private String fecha;
	
	
	
	public News(String nombre, String pwd, String noticia, String fecha) {
		this.nombre = nombre;
		this.pwd = pwd;
		this.noticia = noticia;
		this.fecha = fecha;
	}



	



	public News(Object object, Object object2, Object object3, Object object4) {
		// TODO Auto-generated constructor stub
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPwd() {
		return pwd;
	}



	public void setPwd(String pwd) {
		this.pwd = pwd;
	}



	public String getNoticia() {
		return noticia;
	}



	public void setNoticia(String noticia) {
		this.noticia = noticia;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	@Override
	public String toString() {
		return nombre + pwd + noticia + fecha;
	}
	
	
	
}
