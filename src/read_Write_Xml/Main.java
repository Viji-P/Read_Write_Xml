package read_Write_Xml;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		List<Movie> movies =new ArrayList<>();
		
		movies.add(new Movie("Aladdin","Guy Ritchie",2019));
		movies.add(new Movie("Avatar","James Cameron",2010));
		movies.add(new Movie("Frozen","Jennifer Lee",2013));
		
		Movie_List ml=new Movie_List();
		ml.setMovies(movies);

		
		
		//marshall
		JAXBContext context=JAXBContext.newInstance(Movie_List.class);
		Marshaller marshaller =context.createMarshaller();
		
		StringWriter writer=new StringWriter();
		marshaller.marshal(ml, writer);
		
		String xml=writer.toString();
		
		System.out.println("Xml Representation");
		
		System.out.println(xml);
		
		//unmarshall
		Unmarshaller unmarshaller =context.createUnmarshaller();
		
		Movie_List unmarshalledmovie =(Movie_List) unmarshaller.unmarshal(new StringReader(xml));
		
		for(Movie movie:unmarshalledmovie.getMovies()) {
			
			System.out.println(movie.getName());
			System.out.println(movie.getDirector());
			System.out.println(movie.getYear());
			
		}
		

		
		

	}

}
