package Prueba;

import java.io.*;
public class prueba {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File hola;
		FileReader hola_R;
		BufferedReader hola_BR;
		String a = "hola.txt";
		
		String flag = "", linea = "";
		
		hola = new File(a);
		hola_R = new FileReader(hola);
		hola_BR = new BufferedReader(hola_R);
		
		while (flag != null) {
			flag = hola_BR.readLine();
			linea += flag;
			String[] aux = linea.split("%%");
			
		}
		
		hola_BR.close();
		
		
		

	}

}
