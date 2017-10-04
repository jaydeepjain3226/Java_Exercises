import java.util.HashMap;
import java.util.Scanner;

public class Pe5 {

public static void main(String[] args) {
 // TODO Auto-generated method stub

  HashMap <String, String> hmap = new HashMap<String, String>();
    Scanner in = new Scanner(System.in);

          for(int i=1;i<=2;i++){

            String str1="val"+i;

           String str2=in.next();
           hmap.put(str1, str2);
        }
         String temp=hmap.get("val1");
         hmap.put("val1","");
         hmap.put("val2", temp);
          System.out.println(hmap.toString());

    }


  }      