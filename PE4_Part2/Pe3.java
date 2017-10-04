

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidStringException extends Exception{  
	 InvalidStringException(String s){  
	   super(s);
	 }  

}

public class Pe3 {
	
	static void val(String str)throws InvalidStringException{  
	      if(str.length()<=5) {
	      throw new InvalidStringException("not valid"); }
	
}
	
	public static void main(String[]args) {
//		question3 qu=new question3();
		  try{  
			  Scanner scan=new Scanner(System.in);
			  String name=scan.next();
			  scan.close();
		      val(name);  
		      }
		  catch(Exception m){
			  System.out.println("Exception occured: "+m);}  
		  
		finally {
		System.out.println("hello"); 
		}
	}
	
	
	
}




