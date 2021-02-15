package Config;

public class Persona {

	
	private String nombre;
	private String contraseña;
	
	public Persona(String nombre, String contraseña) {
		
		this.nombre = nombre;
		this.contraseña = contraseña;
	}
	

	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getConstraseña() {
		return contraseña;
	}
	
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public String toString() {
		return nombre + " " + contraseña + "\n";
	}
	
}
