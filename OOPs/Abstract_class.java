import javax.swing.plaf.multi.MultiScrollBarUI;

public class Abstract_class{
    public static void main(String[] args) {
        mustang m = new mustang();
        // m.walk();
    }
}

abstract class Animal{
    // constructor is called in abstraction....
        Animal(){
            System.out.println("Animal constructor is called...");
        }
        void breathes(){
            System.out.println("breathes...");
        }
    abstract void walk();
       
}

class horse extends Animal{
    
    horse(){
        System.out.println("horse constructor is called....");
    }
    void walk(){
        System.out.println("horse walk");
    }

}

class mustang extends horse{
    mustang(){
        System.out.println("horse constructor is called....");
    }
    void walk(){
        System.out.println("horse breed fasts...");
    }
}