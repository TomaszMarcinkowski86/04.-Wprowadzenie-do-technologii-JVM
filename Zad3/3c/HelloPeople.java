import com.sda.Person;
import java.util.Date;

public class HelloPeople  {
  public static void main(String[] args) {
  
  Date date=new Date();
  System.out.println(date.toString());
  
  for(int i=0;i<args.length;i++)

  {
	System.out.println("Hello "+args[i]);
	}
}
}