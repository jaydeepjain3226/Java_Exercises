import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
	    while (c.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
	        c.add(Calendar.DATE, -1);
	    }
	    System.out.println(df.format(c.getTime()));
	    Calendar s=Calendar.getInstance();
	    while(s.get(Calendar.DAY_OF_WEEK) !=Calendar.SUNDAY) {
	    	s.add(Calendar.DATE, +1);
	    }
	    
	    System.out.println(df.format(s.getTime()));
	   
	}

}
