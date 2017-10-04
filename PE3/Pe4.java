import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pe4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no. of cities:");
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		try{
			int n = Integer.parseInt(buf.readLine());
		
		
		String[] city=new String[n];
        
		for(int i=0;i<n;i++) {
			
			city[i]=buf.readLine();
		}
		int i=0;
		while(i<n) {
			System.out.print("city without vowels" +i+":");
			System.out.println(city[i].replaceAll("[aeiou]",""));
			i++;
		}
	}catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} finally {
	    if (buf != null)
	        buf.close();
	} 
			
		}
}
