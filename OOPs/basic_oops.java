public class basic_oops {
     public static void main(String[] args) {
        student s1= new student();    
        s1.set_name("Aditya Prajapati");
        s1.set_age(19);
        s1.percentage = 87;
        System.out.println("name of student: "+s1.get_name()+"\nage: "+s1.get_age()+"\npercentage: "+s1.percentage);
     }
}

class student{
      private String name;
      private int age;
      int percentage;

    
      
      void set_name(String name){
        this.name = name;
      }
      String get_name(){
        return this.name;
      }
      void set_age(int age){
        this.age = age;
      }
      int get_age(){
        return this.age;
      }
      void st_perc(int chem,int maths, int phy){
         percentage = (chem+maths+phy)/3;
      }
}