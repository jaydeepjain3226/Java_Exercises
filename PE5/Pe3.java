import java.util.Scanner;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class Pe3 {
	
	public interface Selector {
		public void end(Integer last);
		public void current(Integer present);
		public void next(Integer next1);

	}

	Logger logger;
    Handler handler;
    public Pe3() {
        logger = Logger.getLogger(".");
        logger.setLevel(Level.INFO);
        handler = new StreamHandler(System.out, new SimpleFormatter());
        handler.setLevel(Level.ALL);
       logger.addHandler(handler);
    }
	static int size;
	public static class Sequence{
		
		 
		 
		public class ReverseSequenceSelector implements Selector{
			Pe3 logObj=new Pe3();

			@Override
			public void end(Integer last) {
				// TODO Auto-generated method stub
				logObj.logger.info(last.toString());
				System.exit(last);
				
			}

			@Override
			public void current(Integer present) {
				// TODO Auto-generated method stub
				logObj.logger.info(present.toString());
				next(present-1);
			}

			@Override
			public void next(Integer next1) {
				// TODO Auto-generated method stub
				if(next1==0)
					end(next1);
				else
					current(next1);
				
			}
		 }
		void Display() {
			ReverseSequenceSelector revSeq= new ReverseSequenceSelector();
			revSeq.current(size);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.print("Enter the size:");
     size=scan.nextInt();
     Sequence seq=new Sequence();
     seq.Display();
    
	}

}
