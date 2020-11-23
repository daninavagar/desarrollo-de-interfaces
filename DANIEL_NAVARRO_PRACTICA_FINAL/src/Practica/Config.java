package Practica;

import java.util.ArrayList;
import java.util.Arrays;

public class Config {

	
	private String user_conf;
	
	private ArrayList<String> tablaCheck;

	
	public Config(String user_conf, ArrayList<String> tablaCheck) {
		this.user_conf = user_conf;
		this.tablaCheck = tablaCheck;
	}

	public String getUser_conf() {
		return user_conf;
	}

	public void setUser_conf(String user_conf) {
		this.user_conf = user_conf;
	}

	public ArrayList<String> getTablaCheck() {
		return tablaCheck;
	}

	public void setTablaCheck(ArrayList<String> tablaCheck) {
		this.tablaCheck = tablaCheck;
	}

	@Override
	public String toString() {
		return user_conf + tablaCheck;
	}

	
	
	
	
	
	




	
	
	
	
	


	

	
	
	
	
	
	
}
