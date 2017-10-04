import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;    
public class Pe5{    
 public static void main(String[] args){    
     Scanner scan=new Scanner(System.in);  
     while (true) {    
         System.out.println("Enter regex pattern:");  
         Pattern pattern = Pattern.compile(scan.nextLine());    
         System.out.println("Enter text:");  
         Matcher matcher = pattern.matcher(scan.nextLine());    
         
           if (matcher.find()) {    
             System.out.println("True");    
           
            }    
         else {    
             System.out.println("False");    
         }    
     }    
 }    
}