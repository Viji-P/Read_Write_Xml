package read_Write_Xml;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	
	private String name;
	private String director;
	private int year;
	
	public Movie() {
		
	}
	public  Movie(String name,String director, int year) {
		
		this.name=name;
		this.director=director;
		this.year=year;
		
	}
	
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	@XmlElement
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
