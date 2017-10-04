import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="one one -one___two,,three,one @three*one?two";
        
		str= str.replaceAll("[^a-zA-Z]+", " ");
		
		String[] str1=str.split("\\s+");
		
		
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String word : str1) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }
		System.out.println(map.toString());

	}

}
