import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pe5 {
	
	Logger logger;
    public Pe5() {
        logger = Logger.getLogger(".");
        logger.setLevel(Level.INFO);
    }
	
	interface Countable{
		public Integer count(String line);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Pe5 logObj= new Pe5();
		
	    Countable countLetters=(line1)->(line1.trim().length());
	    System.out.println("enter a string");
	    Scanner scan=new Scanner(System.in);
	       String line1=scan.nextLine();
	       Integer ans=countLetters.count(line1);
        logObj.logger.info(ans.toString());  
	}

}
