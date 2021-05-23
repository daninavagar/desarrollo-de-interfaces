package Config;

public class Persona {

	
	private String nombre;
	private String contrasenia;
	
	public Persona(String nombre, String contrasenia) {
		
		this.nombre = nombre;
		this.contrasenia = contrasenia;
	}
	

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getConstrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public String toString() {
		return nombre + " " + contrasenia + "\n";
	}
	
}
