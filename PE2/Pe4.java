import java.io.FileReader;
import java.io.IOException;

public class Pe4 {
		
			   public static void main(String[] args) throws IOException{
		        // TODO Auto-generated method stub
		        
		       FileReader fr = new FileReader("/home/jaydeep/Desktop/Test.txt");

		      int i;
		       while ((i=fr.read()) != -1) {
		           System.out.print((char) Character.toUpperCase(i));
		       }
		          
		       
		   }

	
	

}
