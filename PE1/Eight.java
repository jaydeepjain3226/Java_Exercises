import java.util.Random;
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		Random rand = new Random();
		int  n = rand.nextInt(50) + 1;
		
		
		System.out.println("Guess random no.");
		int number;
		
		do {
		     number=scan.nextInt();
		 
		 if(number>n )
			 System.out.println("number is greater than original number");
	     if(number<n)
				 System.out.println("number is less than original number");
		     		 
		 } while (number!=n);
		 
         if(number==n)
        	 System.out.println("correct match");

		
	}
}
