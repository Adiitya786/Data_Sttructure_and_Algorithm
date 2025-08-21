
public class Interface{
    public static void main(String[] args) {
        rook r1 = new rook();
        r1.moves();
    }
}

interface chess{
       void moves();
}

class queen implements chess{
    public void moves(){
        System.out.println("horizontal,vertical,diagonal");
    }
}
class pawn implements chess{
    public void moves(){
        System.out.println("horizontal");
    }
}
class rook implements chess{
    public void moves(){
        System.out.println("horizontal,vertical...");
    }
}