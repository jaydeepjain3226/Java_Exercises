import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		char in = scan.next().charAt(0);
		
		if(in>='a' &&  in<='z')
			System.out.println("Small Letter");
		else if(in>='A' && in<='Z')

			System.out.println("Capital Letter");
		else if(in>='0' && in<='9')
			System.out.println("Number");
		else
			System.out.println("Symbol");
		
		
	}
}
