class Multiplier{
    public int mul(int i1,int i2){
        int r = i1 * i2;
        return r;
    }
}

public class practice12 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        Multiplier calc = new Multiplier();
        int result = calc.mul(num1,num2);

        System.out.println(result);
    }
}
