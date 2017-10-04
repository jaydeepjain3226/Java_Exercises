

public class Pe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;                                                    
	    int size = 3;
	    int badSize = -1;                                                  
	    int[] array = null;                                                
	 
	    for(int choice = 0; choice<3 ; ++choice) 
	    try {
	      switch(choice) {
	        case 0:
	         result = array[0];                                            
	         break;
	        case 1:
	         array = new int[badSize];                                     	         
	         break;
	        case 2:
	         array = new int[size];
	         result = array[size];                                    
	         break;
	      }
	    }
	    catch(NullPointerException e) {
	    	System.out.println("nullpointerexception");
	    	
	    }
	    catch(NegativeArraySizeException e) {
	    	System.out.println("NegativeArraySizeException");
	    	
	    }
	    catch(IndexOutOfBoundsException e) {
	    	System.out.println("IndexOutOfBoundsException");
	    	
	    }
	    
	    

}}
