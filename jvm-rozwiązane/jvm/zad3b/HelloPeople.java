public class HelloPeople {
	public static void main(String[] args) {
		for (String arg : args) {
			Person person = new Person(arg);
			System.out.println("Hello, " + person.getName());
		}
	}
}