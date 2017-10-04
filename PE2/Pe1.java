import java.util.Objects;
import java.util.Scanner;

public class Pe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine( );
        int len=s.length();
        
        
        String reversedString = new StringBuffer(s).reverse().toString();
        
        System.out.println(reversedString);
        if(s.equals(reversedString)) {
        	System.out.println("palindrome");
        }
        else
        	System.out.println("not a palindrome");

	}

}
