

import java.util.regex.*;
import java.util.*;
public class Pe6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        sc.close();
        Pattern p = Pattern.compile("se");
        Matcher m = p.matcher(str);
        while(m.find()) {
            System.out.println("Found at"+" "+m.start()+"-"+(m.end()));
        }
    }
}