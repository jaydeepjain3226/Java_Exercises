import java.util.Arrays;
import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
        int n=scan.nextInt();
        int m=n;
        int sum=0;
        int len=Integer.toString(n).length();
        int[] myarray=new int[len];
        
        for(int i=len-1;i>=0;i--) {
        	myarray[i]=n%10;
        	n=n/10;
        	if(myarray[i]%2==0) {
        		sum+=myarray[i];
        	}
        }
       
        Arrays.sort(myarray);
        
        for(int i=0;i<len;i++)
        	System.out.print(myarray[i]);
        
        System.out.println();
        
        	System.out.println("Sum of even numbers : "+sum);
        if(sum>15)
        	System.out.println("true");
        else
        	System.out.println("false");
        
        
	}

}
