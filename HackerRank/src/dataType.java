
import java.util.ArrayList ;
import java.util.List;

public class dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> sections = new ArrayList <Object>();
		
		sections.add(5.35);
		sections.add('a');
		sections.add(false);
		sections.add(100);
		sections.add("I am a code monkey");
		sections.add(17.3);
		sections.add(true);
		sections.add('c');
		sections.add("derp");

			 
		for (Object obj : sections) {
		    if (obj.getClass() == String.class) {
		        System.out.println("I found a string :- " + obj);
		    }
		    if (obj.getClass() == Integer.class) {
		        System.out.println("I found an int :- " + obj);
		    }
		    if (obj.getClass() == Float.class) {
		        System.out.println("I found a float :- " + obj);
		    }
		   
		    if (obj.getClass() == boolean.class) {
		        System.out.println("I found a boolean :- " + obj);
		    }
		        
		    }
		}
	}


