public class practice5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 15;
        int z = 9;

        if (x < y && x > z)
            System.out.println(x);
        else if (y > x && y > z)
            System.out.println(y);
        else
            System.out.println(z);
    }    
}
