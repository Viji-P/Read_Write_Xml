package read_Write_Xml;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		Movie movie=new Movie();
		movie.setName("Aladdin");
		movie.setDirector("Guy Ritchie");
		movie.setYear(2019);
		
		//marshall
		JAXBContext context=JAXBContext.newInstance(Movie.class);
		Marshaller marshaller =context.createMarshaller();
		
		StringWriter writer=new StringWriter();
		marshaller.marshal(movie, writer);
		
		String xml=writer.toString();
		
		System.out.println("Xml Representation");
		
		System.out.println(xml);
		
		//unmarshall
		Unmarshaller unmarshaller =context.createUnmarshaller();
		
		Movie unmarshalledmovie =(Movie) unmarshaller.unmarshal(new StringReader(xml));
		
		System.out.println(unmarshalledmovie.getName());
		System.out.println(unmarshalledmovie.getDirector());
		System.out.println(unmarshalledmovie.getYear());

		
		

	}

}
