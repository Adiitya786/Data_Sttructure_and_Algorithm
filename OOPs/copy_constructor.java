public class copy_constructor {
    public static void main(String[] args) {
        student s1 = new student("Aditya");
        s1.age=19;
        s1.marks[0] = 99;
        s1.marks[1] = 95;
        s1.marks[2] = 90;
        s1.password ="abcd";
        student s2 = new student(s1);
        System.out.println(s2.name+"\n"+s2.password);
        for(int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        s1.password ="xyz";  // new paasword assigned to s1 password after copying.
        
        System.out.println(s2.password);  // s2 password has no effect on change after copying.

     // due to call by reference in arrays, it points to same location and after changing value....the value of marks in s2 also changed.
        s1.marks[2] = 85;
        System.out.println(s2.marks[2]);  
    }
}

class student{
       String name;
       int age;
       int marks[];
       String password;

  //  copy constructor
       student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
        this.password=s1.password;
       }

    student(String name){
         marks = new int[3];
       this.name = name;
    }
    student(int age){
         marks = new int[3];
       this.age= age;
    }
    student(int marks[]){
         marks = new int[3];
       this.marks=marks;
    }
}