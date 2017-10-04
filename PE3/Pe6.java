import java.util.Scanner;

public class Pe6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        System.out.println("enter the numbers");
        String numbers=scan.nextLine();
        
        String[] number = numbers.split(",");
        int[] integer=new int[7];
        int flag=0;
        for(int i=0;i<7;i++) {
        	try {
        	      integer[i] = Integer.parseInt(number[i]);
        	}catch (NumberFormatException e) {
        	}	
        }
        for(int i=1;i<7;i++) {
        	if(integer[i]-integer[i-1]==1 || integer[i]-integer[i-1]==-1 )
        		flag=1;
        	else
        		{
        		flag=0;
        		break;
        		}
        	    
        }
        
        if(flag==0)
        	System.out.println("not consecutive");
        else 
        	System.out.println("consecutive");
        	
        
        
        
	}

}
