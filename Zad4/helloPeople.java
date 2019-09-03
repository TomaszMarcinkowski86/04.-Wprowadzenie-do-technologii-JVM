
/**
*Klasa wyświetlająca napis {@code "Hello + imię"}
*@author T.Marcinkowski
*@version 1.100.1
*/

public class helloPeople  {
/**
*W metodzie main pętla by wyświetlało napis,
*tyle razy ile argumentów podamy;
*@param args paramtry takie jak TOM KEN ITD
*/
  public static void main(String[] args) {
  
  for(int i=0;i<args.length;i++)

  {
	System.out.println("Hello "+args[i]);
	}
}



}