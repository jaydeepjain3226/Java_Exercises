import java.util.*;


public class Pe7 {

    public static void main(String[] args)  {
        // TODO Auto-generated method stub
        ArrayList<String> list1= new ArrayList<String>();
        list1.add("Java");    
       list1.add("C");  
        list1.add("C++");
        list1.add("Python");  
       list1.add("JavaScript");
        
       ArrayList<String> list2= new ArrayList<String>();
        list2.add("Java");    
       list2.add("C");  
        list2.add("C++");
        list2.add("fortran");  
       list2.add("JavaScript");
        
       ArrayList<String> list3= new ArrayList<String>();
        
       int sizeOfTheShortestList = Math.min(list1.size(), list2.size());
        for (int i=0; i<sizeOfTheShortestList; i++) {
            if (list1.get(i).equals(list2.get(i))) {
                list3.add("Yes");
               // System.out.println("Yes" + list1.get(i));
            }
            else {
                list3.add("NO");
                //System.out.println("no");
            }
        }
        System.out.println(list3);
        
   }

}