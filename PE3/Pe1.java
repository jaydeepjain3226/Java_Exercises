import java.util.InputMismatchException;
import java.util.Scanner;

public class Pe1 {
	
	public static class StudentMarks{
		static int numofstudents;
		static int[] marks=new int[numofstudents];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          
		
		
			
			System.out.println("enter no. of students:");
			StudentMarks.numofstudents=scan.nextInt();
	        
	        
	        int i=0,flag=1;
	       StudentMarks.marks=new int[StudentMarks.numofstudents];
	       
	        while(i<4 && flag==1) {
	        	System.out.println("enter the marks of student" +i+":");
	        	StudentMarks.marks[i]=scan.nextInt();
	        	
			    while(StudentMarks.marks[i]<0 || StudentMarks.marks[i]>100 ||flag==0){
	        	     System.out.println("enter valid marks for student"+i+":");
	        	     StudentMarks.marks[i]=scan.nextInt();
	        	     if(StudentMarks.marks[i]<0 || StudentMarks.marks[i]>100) 
	        	    	 flag=0;
	        	     else 
	        	    	 flag=1;
	     	       
	        	}
			    i++;
	        }        
		      
	       
	       
		
		System.out.println("no. of students:" +StudentMarks.numofstudents);
		for(int j=0;j<StudentMarks.numofstudents;j++)
		System.out.println("grades of students:" +StudentMarks.marks[j]);
	}

}
