import java.util.InputMismatchException;
import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		 try {
		        String sc = scan.next();
		           char[] arr = sc.toCharArray();
		           int len = arr.length;
		           
		           for (int i=0; i<len; i++) {
		               char ch = arr[i];
		               if(Character.isDigit(ch)) {
		                   throw new InputMismatchException();
		               }              
		               if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		                   System.out.println(arr[i]+ " is a vowel");
		               }
		               else {
		                   System.out.println(arr[i]+ " is a consonant");
		               }
		           }
		           
		       }
		       
		       catch(InputMismatchException exception){
		           System.out.println("Please enter only Characters");
		       }
		       
		       

	}

}
