package Practica;

import java.io.*;



public class Files {

	private File user;
	private File user_config;
	private File news_log;
	
	
	public boolean fileChecks() {
		
		boolean check = true;
		
		user = new File("./Files/User/" + "users.txt");
		user_config = new File("./Files/Config/" + "config.txt");
		news_log = new File("./Files/News/" + "log.txt");
		
		
		if (user.exists() && user_config.exists() && news_log.exists()) {
			check = true;		
			} else {
				check = false;
			}
		
		
		return check;
	}
	
}
