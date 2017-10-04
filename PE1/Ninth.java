import java.util.Scanner;
import java.io.*;

public class Ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner in = new Scanner(System.in);
        String str = in.nextLine( );
        
        int strlength=str.length();
        
        
        for(int i=strlength-1;i>=0;i--)
        	System.out.print(str.charAt(i));
	}

}
