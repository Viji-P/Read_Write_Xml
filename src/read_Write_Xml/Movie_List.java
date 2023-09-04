package read_Write_Xml;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Movies")
public class Movie_List {
	
	private List<Movie> movies;

	public List<Movie> getMovies() {
		return movies;
	}

	
	@XmlElement(name="movie")
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	

}
