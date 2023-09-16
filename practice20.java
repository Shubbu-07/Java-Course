// Mutable & Immutable strings 
public class practice20 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Shubham");
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        System.out.println(s1.append(" Mergu"));
        System.out.println(s1.insert(1, "Bro"));
        
        // String str = s1.toString();
        //System.out.println(str);
    }
}
