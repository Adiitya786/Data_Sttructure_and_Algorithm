public class constructor_overload {
    public static void main(String[] args) {
        // constructor is called as per their suitability of the creation of the objects, it is called construction overloading.
        pen p1 = new pen();
        pen p2 = new pen("trimax",5);
        pen p3 = new pen("reynolds");
        System.out.println(p2.brand+"\n"+p3.brand);

        
        
    }
}


class pen{
    String brand;
    int tip;
    int price;
    pen(){
        System.out.println("constructor is called...");
    }
    pen(String brand){
        this.brand = brand;
    }
    pen(String brand, int tip){
        this.tip =tip;
        this.brand =brand;
    }
    
}