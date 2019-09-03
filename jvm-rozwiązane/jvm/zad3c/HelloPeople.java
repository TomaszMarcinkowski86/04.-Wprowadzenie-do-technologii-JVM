import com.sda.Person;
import java.util.Date;

public class HelloPeople {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Date: " + date.toString());
		
		for (String arg : args) {
			Person person = new Person(arg);
			System.out.println("Hello, " + person.getName());
		}
	}
}