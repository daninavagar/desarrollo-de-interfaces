package Users;

public class Usuarios {

	private String nombre;
	private String contraseña;
	
	public Usuarios(String Nombre, String Contraseña) {
		nombre = Nombre;
		contraseña = Contraseña;
	}

	public String getNombre() {
		return nombre;
	}

	public String getContraseña() {
		return contraseña;
	}
	
	
}
