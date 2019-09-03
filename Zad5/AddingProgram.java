public class AddingProgram {
	
	private static int i = 1;
	private static int j = 5;
	
	public static void main(String args[]) {
		System.out.println("Starting AddingProgram application. Now we will add numbers.");
		AddingClass addingClass = new AddingClass();
		addingClass.add(i);
		addingClass.add(j);
		addingClass.add(10);
		System.out.println("sum: " + addingClass.getSum());
	}
}