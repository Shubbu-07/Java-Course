// Method Overloading in java
class calc {
    public int add(int n1, int n2, int n3) {
        return n1 + n2;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }

}

public class practice14 {
    public static void main(String[] args) {
        calc obj = new calc();
        int r1 = obj.add(7, 9);
        System.out.println(r1);
    }
}
