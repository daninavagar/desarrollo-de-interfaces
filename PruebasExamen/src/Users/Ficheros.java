package Users;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;
public class Ficheros {

	String ruta = "persona.txt";
	private File fichero;
	private FileReader reader;
	private BufferedReader buffer;
	Usuarios usuario;
	private ArrayList<Usuarios> tablaUsuario;
	
	public Ficheros() {
		tablaUsuario = new ArrayList<Usuarios>();
	}

	public File getFichero() {
		return fichero;
	}

	public FileReader getReader() {
		return reader;
	}

	public BufferedReader getBuffer() {
		return buffer;
	}
	
	public ArrayList<Usuarios> getTablaUsuario(){
		return tablaUsuario;
	}
	
	public void leerFichero() {
		
		fichero = new File(ruta);
		
		try {
			reader = new FileReader(fichero);
			buffer = new BufferedReader(reader);
			
			String linea = buffer.readLine();
			String separador = Pattern.quote("&&");
			while (linea != null) {
				String[] tabla = linea.split(separador);
				usuario = new Usuarios(tabla[0].substring(3), tabla[1]);
				tablaUsuario.add(usuario);
				linea = buffer.readLine();
			}
			
			buffer.close();
		} catch (IOException e) {
			System.err.println("Error al leer: " + e.getMessage());
		}
	}
}

	
