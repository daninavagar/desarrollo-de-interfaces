package Traductor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class code {

	public static void main(String[] args) throws Exception{
		
		URL a = new URL ("https://www.spanishdict.com/traductor/casa");
		String b = obtenerH (a);
		String p = cortarU (b);
		System.out.println(p.toUpperCase());
	}
	
	public static String obtenerH (URL d) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(d.openStream()));
		String inputLine, codigo="";
		while ((inputLine = in.readLine()) != null)
			codigo+=inputLine;
		in.close();
		return codigo;
	}
	
	public static String cortarU (String c) {
		
		int posicionIni = c.indexOf("\"quickdef1");
		int posicionFin = c.indexOf("\", \"textToPronounce\"");
		int posicionFin2 = c.indexOf("\", \"textToPronounce\"", posicionFin+1);
		return c.substring(posicionIni+28, posicionFin2);
	}

}
