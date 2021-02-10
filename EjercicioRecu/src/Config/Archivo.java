package Config;

import java.io.*;
import java.util.ArrayList;

public class Archivo {

	String ubica = "./src/Files/usuarios.txt";
	private File user;
	private FileReader user_R;
	private BufferedReader user_BR;
	
	Persona persona;
	private ArrayList<Persona> tablaPersona = new ArrayList<Persona>();
	

	
	public Archivo() {
		
	}



	public File getUser() {
		return user;
	}


	public void setUser(File user) {
		this.user = user;
	}


	public FileReader getUser_R() {
		return user_R;
	}


	public void setUser_R(FileReader user_R) {
		this.user_R = user_R;
	}

	public BufferedReader getUser_BR() {
		return user_BR;
	}


	public void setUser_BR(BufferedReader user_BR) {
		this.user_BR = user_BR;
	}
	



	public ArrayList<Persona> getTablaPersona() {
		return tablaPersona;
	}



	public void setTablaPersona(ArrayList<Persona> tablaPersona) {
		this.tablaPersona = tablaPersona;
	}



	public boolean leerUser() {
		
		try {
		
			user = new File(ubica);
			user_R = new FileReader(user);
			user_BR = new BufferedReader(user_R);
			
			String cadena = "";
			
			while ((cadena = user_BR.readLine()) != null) {
				ArrayList<String> list = new ArrayList<String>();
				persona = new Persona(list.get(0), list.get(1));
				tablaPersona.add(persona);
				
			}
			user_BR.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	public boolean compruebaContraseña() {
		
		
		boolean comprueba = true;
		for (int i=0; i<tablaPersona.size(); i++) {
			for (int f=i+1; i<tablaPersona.size(); f++) {
				if (getTablaPersona().get(i).getConstraseña().equals(getTablaPersona().get(f))) {
					return true;
				} else 
					comprueba = false;
			}
		}
		return comprueba;
	}
	
}
