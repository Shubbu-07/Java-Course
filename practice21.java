// Static keyword in Java

class Mobile{
    String brand;
    int price;
    String network;
    static String name; //used static keyword here

    static{
        name="Phone";
        System.out.println("In statc block");
    }
    public Mobile(){
        brand=" ";
        price=200;
        System.out.println("In Constructor");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class practice21 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "Smartphone";

        // Mobile obj2 = new Mobile();

        // obj1.show();
        
    }
}
