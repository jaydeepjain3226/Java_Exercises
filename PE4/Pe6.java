import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
public class Pe6 {
    public static void main(String[] args){
        Set<String> s1 = new HashSet<>();
        s1.add("Mohit");
        s1.add("Shasha");
        s1.add("Lolu");
        s1.add("Jimmy");
        s1.add("Grey");
        
       SortedSet<String> s2 = new TreeSet<>(s1);
        List<String> list = new ArrayList<String>(s2);
       System.out.println("Sorted Set"); 
      System.out.println(s2);
      
      System.out.println("ArrayList");
      System.out.println(list);
        /*System.out.println(s2);*/
        
   }
    }