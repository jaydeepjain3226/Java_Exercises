
public class Pe8 {

	public static void main(String[] args) {
		int i  = 1;
	    long fact = 1;
	    while (true)
	    {
	        System.out.printf("The factorial of %1$d is is %2$d.\n", i, fact);
	        if (Long.MAX_VALUE / fact < (i+1)) {
	            System.out.printf("The factorial of %d is out of range.\n", (i+1));
	            break;
	        }
	        i++;
	        fact *= i;
	    }
	     
	    }
	}