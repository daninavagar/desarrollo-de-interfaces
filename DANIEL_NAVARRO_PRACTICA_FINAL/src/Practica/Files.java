package Practica;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Files {
	
	private File user;
	private FileReader user_R;
	private BufferedReader user_BR;
	private ArrayList<People> tablaPersona = new ArrayList<People>();
	
	protected File user_config;
	protected FileWriter config_w;
	protected BufferedWriter config_bw;
	protected FileReader config_r;
	protected BufferedReader config_br;
	
	
	
	
	private File news_log;
	private FileWriter news_w;
	private BufferedWriter news_bw;

	People person;
	Config conf;
	Main main;
	

	public Files() {
	}

	public ArrayList<People> getTablaPersona() {
		return tablaPersona;
	}

	public void setTablaPersona(ArrayList<People> tablaPersona) {
		this.tablaPersona = tablaPersona;
	}

	public File getUser_config() {
		return user_config;
	}

	public void setUser_config(File user_config) {
		this.user_config = user_config;
	}

	public FileWriter getConfig_w() {
		return config_w;
	}

	public void setConfig_w(FileWriter config_w) {
		this.config_w = config_w;
	}

	public BufferedWriter getConfig_bw() {
		return config_bw;
	}

	public void setConfig_bw(BufferedWriter config_bw) {
		this.config_bw = config_bw;
	}

	
	
	
	
	public FileReader getConfig_r() {
		return config_r;
	}

	public void setConfig_r(FileReader config_r) {
		this.config_r = config_r;
	}

	public BufferedReader getConfig_br() {
		return config_br;
	}

	public void setConfig_br(BufferedReader config_br) {
		this.config_br = config_br;
	}

	public boolean fileChecks() {
		
		boolean check = false;
		
		user = new File("./src/Files/Users/users.txt");
		user_config = new File("./src/Files/Config/config.txt");
		news_log = new File("./src/Files/News/log.txt");
		
		
			if (user.exists() && user_config.exists() && news_log.exists()) {
				check = false;		
				} else {
					check = true;
				}
		
		
		
		
		return check;
	}
	
	
	
	
	public boolean readUser() {
		
		boolean file = true;
		
		try {
				user_R = new FileReader(user);
				user_BR = new BufferedReader(user_R);
				
				String cadena = "";
				
				while ((cadena = user_BR.readLine()) != null) {
					
					ArrayList<String> list = new ArrayList<String>(Arrays.asList(cadena.split("-.....-")));
					person = new People(list.get(0), list.get(1));
					tablaPersona.add(person);
					
				}
				
				
				user_BR.close();
				
				
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return file;
	}
	
	public boolean passwdchecks() {
		boolean check = true;
		 
		for (int i=0; i<tablaPersona.size(); i++) {
			for (int f=i+1; i<tablaPersona.size(); f++) {
				if (getTablaPersona().get(i).getPwd_user().equals(getTablaPersona().get(f).getPwd_user())) {
					return true;
				} else
					check = false;
				
			}
		} 
		return check;
	}


	
	
	
	
}
