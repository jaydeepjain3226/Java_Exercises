import java.util.Scanner;

public class Pe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print("enter no. to check:");
		Scanner Scan=new Scanner(System.in);
		
	    long num=Scan.nextLong();
	    int flag=1;
	    
	    while(num>1) {
	    	if(num%4!=0) {
	    		flag=0;
	    		break;
	    	}
	         else
	        	 num=num/4;
	    	
	    }
	    
	    if(flag==1)
	    	System.out.println("Power of 4");
	    else 
	    	System.out.println("not a power of 4");
	}

}
