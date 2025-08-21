public class Static_keyword {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.schoolName = "S.B.M";
        System.out.println(s2.schoolName);
        System.out.println(s2.percentage(90, 90, 80));
    }
}

class student{
 static int percentage(int maths,int chem,int phy){
    return (maths+phy+chem)/3;
}

    String name;
    int roll_no;
    static String schoolName;

    void setName(String name){
    this.name = name;
    }
}