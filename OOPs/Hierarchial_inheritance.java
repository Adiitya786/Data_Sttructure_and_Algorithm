public class Hierarchial_inheritance {

     public static void main(String[] args) {
    fish shark = new fish();
    shark.breathe();
    
    birds sparrow = new birds();
    sparrow.fly();
    
    }
}

// Parent class or base class
class Animal{
    String color;
   
    public void cm(String color){
        this.color=color;
    }
   
    public void eat(){
        System.out.println("eats...");
    }
    public void breathe(){
        System.out.println("breathes...");
    }
}

class fish extends Animal{
    void swims(){
        System.out.println("swim");
    }
}
class mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
