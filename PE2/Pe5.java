import java.util.Scanner;


 

public class Pe5 {
	public static boolean isEven(int number) {
    if(number%2==0)
    	return true;
    else
    	return false;
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      int Num=scan.nextInt();
    		  if(isEven(Num)==true)
    			  System.out.println("true");
    		  else
    			  System.out.println("false");
    			  
    		  
	}

}
