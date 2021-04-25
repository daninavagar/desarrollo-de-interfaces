package Practica;



public class People {

	private String name_user;
	private String pwd_user;
	private Config config;
	
	
	public People(String name_user, String pwd_user) {
		this.name_user = name_user;
		this.pwd_user = pwd_user;
	}


	public String getName_user() {
		return name_user;
	}


	public void setName_user(String name_user) {
		this.name_user = name_user;
	}


	public String getPwd_user() {
		return pwd_user;
	}



	public void setPwd_user(String pwd_user) {
		this.pwd_user = pwd_user;
	}


	public Config getConfig() {
		return config;
	}



	public void setConfig(Config config) {
		this.config = config;
	}

	@Override
	public String toString() {
		return  name_user + " " + pwd_user +"\n";
	}

}
