import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
        String str=scan.nextLine();
        
		str= str.replaceAll("[^a-zA-Z]+", " ");
		
		String[] str1=str.split("\\s+");
		
		
		
       HashMap<String, Boolean> map = new HashMap<>();
		
		for (String word : str1) {
            if (map.containsKey(word)) {
                map.put(word, true);

            } else {
                map.put(word, false);
            }
        }
		System.out.println(map.toString()); 

	}

}