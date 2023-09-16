// All about Class & Object

class Calculator {

    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}

public class practice11 {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 9;

        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);

        // result = num1 + num2
        System.out.println(result);
    }
}

// Object Oriented Programming
// Object - Properties & Behaviours
// It has Class