public class AddingClass {
	private int sum;
	
	public AddingClass() {
		System.out.println("Instantiating AddingClass object. Sum is 0.");
		this.sum = 0;
	}
	
	public void add(int value) {
		System.out.println("Adding value " + value + " to the sum");
		this.sum += value;
	}
	
	public int getSum() {
		return this.sum;
	}
}