import com.sda.Person;
import java.util.Date;

/**
* Simple class for testing program arguments.
* Class prints "Hello" message for each program argument.
* @author Piotr Zietek
*/
public class HelloPeople {
	
	/**
	* Main entry point to the application.
	* @param args array of Strings, containing program arguments
	*/
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Date: " + date.toString());
		
		for (String arg : args) {
			Person person = new Person(arg);
			System.out.println("Hello, " + person.getName());
		}
	}
}