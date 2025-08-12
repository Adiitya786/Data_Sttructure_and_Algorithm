public class basic_oops {
     public static void main(String[] args) {
        student s1= new student();    
        s1.name ="Aditya Prajapati";
        s1.age = 19;
        s1.percentage = 87;
        System.out.println("name of student: "+s1.name+"\nage: "+s1.age+"\npercentage: "+s1.percentage);
     }
}

class student{
      String name;
      int age;
      int percentage;;
      
      void st_name(String new_name){
        name = new_name;
      }
      void st_age(int new_age){
        age = new_age;
      }
      void st_perc(int chem,int maths, int phy){
         percentage = (chem+maths+phy)/3;
      }
}