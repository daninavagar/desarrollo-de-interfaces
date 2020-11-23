package Practica;

import java.net.URL;

public class Source {

	private URL link;
	

	public Source(URL link) {
		this.link = link;
	}


	public URL getLink() {
		return link;
	}


	public void setLink(URL link) {
		this.link = link;
	}


	public String getUrl() {
		String url = "";
		
		return url;
	}
	@Override
	public String toString() {
		return "Source [link=" + link + "]";
	}
	
	
	
}
