package Config;

import java.io.*;  
import java.util.ArrayList;
import java.util.regex.Pattern;



public class Usuarios {

	String ubica = "./src/Files/usuarios.txt";
	private File fichero;
	private FileReader fichero_R;
	private BufferedReader fichero_BR;
	
	Persona persona;
	private ArrayList<Persona> tablaPersona = new ArrayList<Persona>();
	

	public Usuarios() {	
	}


	public String getUbica() {
		return ubica;
	}


	public void setUbica(String ubica) {
		this.ubica = ubica;
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
		
		fichero = new File(ubica);
		String separador = Pattern.quote("%%");
		
		String linea = "";
		try {
			
			fichero_R = new FileReader(fichero);
			fichero_BR = new BufferedReader(fichero_R);
			
			while ((linea = fichero_BR.readLine()) != null) {
				String[] aux = linea.split(separador);
				
				// substring 2, no lee los 2 primeros caracteres
				persona = new Persona(aux[0].substring(2), aux[1]);
				tablaPersona.add(persona);
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



	
	
}
