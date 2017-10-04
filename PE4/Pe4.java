import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Pe4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
   		new MainTest().createStudent();
    }
    
}
    
     class Student {
         
        @Override
        public String toString() {
            return "[id=" + id + ", age=" + age + ", name=" + name + "]";
        }
        public Student(int id, int age, String name) {
            super();
            this.id = id;
            this.age = age;
            this.name = name;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        private int id;
        private int age;
        private String name;        
    }
    
class MainTest{
        
     public void createStudent(){
    	 ArrayList al = new ArrayList();
         al.add(new Student(1,22,"Mohit"));
         al.add(new Student(2,22,"Mohit"));
         al.add(new Student(3,23,"Ankur"));
         al.add(new Student(4,23,"Ghoda"));
         al.add(new Student(5,12,"Avinash"));
     
		
		Collections.sort(al, new AgeComparator());
		System.out.println("Sorted by name");
		for (int i=0; i<al.size(); i++)
		 System.out.println(al.get(i));
        
     }
        
    }

     class AgeComparator implements Comparator<Student>{  
         public int compare(Student s1,Student s2){  
           
           
         if(s1.getAge()==s2.getAge()) {
             if( s1.getName() != s2.getName()) {
             return s1.getName().compareTo(s2.getName());}
             else if (s1.getId()>s2.getId()) {
                 return 1;
             }else {return -1;}
             } 
         else if(s1.getAge()>s2.getAge())  
         return 1;  
         else  
         return -1;  
         }  
         }  
      
     class Sortbyname implements Comparator<Student>
     {
         
         public int compare(Student a, Student b)
         {
             return a.getName().compareTo(b.getName());
         }
         
     }