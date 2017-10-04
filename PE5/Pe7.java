import java.util.Scanner;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class Pe7 {
    
	Logger logger;
    public Pe7() {
        logger = Logger.getLogger(".");
        logger.setLevel(Level.INFO);
    }
    
    interface CheckFactor{
		public String isFactor(int number1, int number2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Pe7 logObj= new Pe7();
     
	     CheckFactor checkFactor1=(num1,num2)->{
	    	 if(num1%num2==0)
	    		 return (num2+ " is factor of "+num1);
	    	 else 
	    		 return (num2+ " is not a factor of "+num1);
	    	 
	     };
	    System.out.print("enter numbers:");
	    Scanner scan=new Scanner(System.in);
	       int num1=scan.nextInt();
	       int num2=scan.nextInt();
        logObj.logger.info(checkFactor1.isFactor(num1,num2));  
        
	}

}
