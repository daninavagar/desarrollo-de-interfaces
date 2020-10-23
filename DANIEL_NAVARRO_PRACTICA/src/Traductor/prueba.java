package Traductor;


import java.io.IOException; 
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class prueba {

	public static void main(String[] args) throws IOException{
		
		Scanner Leer = new Scanner (System.in);
		Document document;
		String webPage = "https://www.spanishdict.com/traductor/esternocleidomastoideo";
		document = Jsoup.connect(webPage).get();
		Elements palabra = document.getElementById("quickdef1-es").getElementsByClass("_1btShz4h");
		palabra.html();
		System.out.println("PALABRA --> " + palabra.html());
		
		
		System.out.println("==========================================");
		
		System.out.println("Dime que palabra quieres que te traduzca");
		String word = Leer.next();
		Document document2;
		String webPage2 = "https://www.spanishdict.com/traductor/"+word;
		document2 = Jsoup.connect(webPage2).get();
		Elements palabra2 = document2.getElementById("quickdef1-es").getElementsByClass("_1btShz4h");
		palabra2.html();
		System.out.println("La traduccion de " + word + " es : "+ palabra2.html());
		Leer.close();
		
		
		
	}

}
