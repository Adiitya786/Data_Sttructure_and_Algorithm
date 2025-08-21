public class Multiple_interface {
    public static void main(String[] args) {
        bear b1 = new bear();
        b1.eat();
    }
}

interface carnivores{
    void eat();
      }

interface herbivores{
    void eat();
}

class bear implements carnivores,herbivores{
    public void eat(){
        System.out.println("eats both grass and meat..");
    }
}