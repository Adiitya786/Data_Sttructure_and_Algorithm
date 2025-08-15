public class Inheritance {
    public static void main(String[] args) {
        fish tuna = new fish();
        tuna.eat();
        tuna.color ="black";
       System.out.println(tuna.color);
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

// child class or derived class
class fish extends Animal{
    String fins;
    void swim(){
        System.out.println("swims very fast...");
    }
}
