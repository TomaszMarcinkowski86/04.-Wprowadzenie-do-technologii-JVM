public class helloPeople  {
  public static void main(String[] args) {
  
  
  
  for(int i=0;i<args.length;i++)
    Person tom = new Person(args[i]);
  {
	System.out.println("Hello "+tom.getname());
	}
}
}