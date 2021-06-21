package Config;

import java.io.*;  
import java.util.ArrayList;
import java.util.regex.Pattern;



public class Usuarios {

	String user = "./src/DirectorTutor/Files/usuarios.txt";
	String resumen = "./src/DirectorTutor/Files/Resumen.txt";
	private File fichero;
	private File fichero2;
	private FileReader fichero_R;
	private BufferedReader fichero_BR;
	
	Persona persona;
	private ArrayList<Persona>tablaPersona; 
	

	public Usuarios() {
		tablaPersona = new ArrayList<Persona>();
	}



	public File getFichero() {
		return fichero;
	}


	public void setFichero(File fichero) {
		this.fichero = fichero;
	}


	public FileReader getUser_R() {
		return fichero_R;
	}


	public void setFichero_R(FileReader fichero_R) {
		this.fichero_R = fichero_R;
	}


	public BufferedReader getFichero_BR() {
		return fichero_BR;
	}


	public void setFichero_BR(BufferedReader fichero_BR) {
		this.fichero_BR = fichero_BR;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public ArrayList<Persona> getTablaPersona() {
		return tablaPersona;
	}


	public void setTablaPersona(ArrayList<Persona> tablaPersona) {
		this.tablaPersona = tablaPersona;
	}

	public void leerFichero() {
		
		fichero = new File(user);
		
		String separador = Pattern.quote("%%");
		
		String linea = "";
		try {
			
			fichero_R = new FileReader(fichero);
			fichero_BR = new BufferedReader(fichero_R);
			
			linea = fichero_BR.readLine();
			while (linea != null) {
				String[] aux = linea.split(separador);
				
				// substring 2, no lee los 2 primeros caracteres
				persona = new Persona(aux[0].substring(2), aux[1]);
				tablaPersona.add(persona);
				linea = fichero_BR.readLine();
			}
			
			fichero_BR.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public boolean compruebaficheros() {
	
		boolean existen = false;
		
		fichero = new File(user);
		fichero2 = new File(resumen);
		if (fichero.exists() && fichero2.exists()) {
			return existen;
		} else {
			existen = true;
		}
		
		return existen;
	}



	
	
}