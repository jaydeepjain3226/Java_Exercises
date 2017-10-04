import java.util.logging.Level;
import java.util.logging.Logger;

public class Pe4 {
	
	Logger logger;
    public Pe4() {
        logger = Logger.getLogger(".");
        logger.setLevel(Level.INFO);
    }

	public interface Hand{
		 void facepalm();
	}
	
	
		 Hand doFollowing() {
			
			class InnerPalm implements Hand{

				@Override
				public void facepalm() {
					// TODO Auto-generated method stub
					logger.info("Hi! you have got a palm");
				}	
			}
			InnerPalm line= new InnerPalm();
			
			return line;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pe4 obj=new Pe4();
		Hand hand=obj.doFollowing();
		hand.facepalm();

	}

}
