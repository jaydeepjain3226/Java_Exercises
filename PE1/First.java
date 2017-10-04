import java.util.Scanner;


public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int m= scan.nextInt();
		int n = m;
		int sum=0;
		int len = Integer.toString(n).length();
		int[] myarray=new int[len];
		
		for(int i=len-1;i>=0;i--) {
			myarray[i]=n%10;
			n=n/10;
			sum+=myarray[i];
		}
		
		int i1=0;
		int i2=len-1;
		int flag=0;
		
		while(i2>i1) {
			if(myarray[i1]!=myarray[i2]){
				flag=1;
			}
			i1++;
			i2--;
		}
			if(flag==1 && sum>25)
			System.out.println(m+ "  is not palindrome and sum is greater than 25");
			else if(flag==1 && sum<25)
				System.out.println(m+"  is not palindrome and sum is less than 25");
			else if(flag==0)
				System.out.println(m+"  is palindrome");
        

	}

}
