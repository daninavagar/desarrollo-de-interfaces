package Practica;

import java.time.LocalDateTime;

public class News {

	private String title;
	private LocalDateTime date;
	private Source source;
	
	
	public News(String title, LocalDateTime date, Source source) {
		this.title = title;
		this.date = date;
		this.source = source;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public Source getSource() {
		return source;
	}


	public void setSource(Source source) {
		this.source = source;
	}


	@Override
	public String toString() {
		return "News [title=" + title + ", date=" + date + ", source=" + source + "]";
	}
	
	
	
}
