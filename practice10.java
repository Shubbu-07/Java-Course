public class practice10 {
    public static void main(String[] args) {
        // Do-While loop
        // int i = 1;

        // do{
        // System.out.println("Hello" + " " + "-" + " " + i);
        // i++;
        // }while(i <= 4);

        // For loop
        for (int a = 1; a <= 5; a++) {
            System.out.println("Day" + a);

            for(int b = 1; b <= 9; b++)
            {
                System.out.println("  " + (b+8) + "-" + (b+9));
            }
        }
    }
}
