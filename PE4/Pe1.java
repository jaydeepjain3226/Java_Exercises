import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        int n=scan.nextInt();
        
        String[] arr=new String[n];
        
        for(int i=0;i<n;i++)
           arr[i]=scan.next();
        
        ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(arr));
        arrayList.add("1");
        for(String str: arrayList)
    	   System.out.println(str);
}
}