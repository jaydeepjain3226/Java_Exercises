import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pe6 {
	
	Logger logger;
    public Pe6() {
        logger = Logger.getLogger(".");
        logger.setLevel(Level.INFO);
    }
	
	interface Multiply{
		public int product(int number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pe6 logObj= new Pe6();
        
	    Multiply product1=(num)->(num*2);
	    System.out.println("enter number");
	    Scanner scan=new Scanner(System.in);
	       int num=scan.nextInt();
        logObj.logger.info("1-Result:"+product1.product(num));  
        
	}

}
