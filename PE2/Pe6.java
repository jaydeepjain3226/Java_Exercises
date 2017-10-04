import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Pe6 {
	
	public static float findaverage(int array1[], int num) {
		float avg=0;
		for(int i=0;i<num;i++)
			avg+=array1[i];
		
		avg=avg/4;
		return avg;
	    
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter the no. of students:");
       int n=scan.nextInt();
       
       int[] grades=new int[n];
       for(int i=1;i<=n;i++) {
    	   System.out.print("please enter the marks for student " +i +":");
    	   grades[i-1]=scan.nextInt();
    	 }
       
      System.out.println("average of grades is:"+(findaverage(grades, n)));
       Arrays.sort(grades);
       
       System.out.println("maximum is:"+grades[n-1]);
       System.out.println("minimum is:"+grades[0]);
	}

}
