package Config;

public class Persona {

	
	private String nombre;
	private String contrase�a;
	
	public Persona(String nombre, String contrase�a) {
		
		this.nombre = nombre;
		this.contrase�a = contrase�a;
	}
	

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getConstrase�a() {
		return contrase�a;
	}
	
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	public String toString() {
		return nombre + " " + contrase�a + "\n";
	}
	
}
