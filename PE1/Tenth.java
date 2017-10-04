import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine( );
        int n=scan.nextInt();
        int len=s.length();
        
        System.out.print(s);
        char[] myStringArray = new char[n];
        int j=0;
        for(int i=len-n;i<len;i++) {
              myStringArray[j]=s.charAt(i);
              j++;
	}
        
        for(int i=0;i<n;i++)
        	System.out.print(myStringArray);
	}

	 

}
