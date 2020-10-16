package Traductor;


import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class prueba {

	public static void main(String[] args) throws IOException{
		
		Document document;
		String webPage = "https://www.spanishdict.com/traductor/esternocleidomastoideo";
		document = Jsoup.connect(webPage).get();
		Elements palabra = document.getElementById("quickdef1-es").getElementsByClass("_1btShz4h");
		palabra.html();
		System.out.println("PALABRA --> " + palabra.html());
		
	}

}
