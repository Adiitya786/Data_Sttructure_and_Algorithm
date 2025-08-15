public class shallow_deepCopy {
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
      // by changing s1 marks, it does not reflect changes in s2 marks due to deep copy.
        s1.marks[2] = 85;
        System.out.println(s2.marks[2]);  
    }
}

class student{
       String name;
       int age;
       int marks[];
       String password;

  // shallow copy: changes reflects in the new object copied.
    //    student(student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
    //     this.password=s1.password;
    //    }

    // deep copy: changes doesn't reflect in the new object copied.
     student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.password=s1.password;
        for(int i=0;i<marks.length;i++){
          this.marks[i] = s1.marks[i];
        }
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
    
