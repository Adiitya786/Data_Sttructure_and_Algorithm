public class Method_overriding {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.eat();
    }
}
 // same functions in both child class and parent class but child class calls its own function, it is method overriding. 

class Animal{
    void eat(){
        System.out.println("eats anything...");
    }
}

class cat extends Animal{
    void eat(){
    System.out.println("drinks milk...");
    }
}