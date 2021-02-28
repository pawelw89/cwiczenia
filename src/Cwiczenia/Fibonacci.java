package Cwiczenia;

public class Fibonacci {

    public static void main(String[] args) {

        fibnacci(8);
    }

    public static void fibnacci(int n) {
        int number1 = 1;
        int number2 = 1;
        if (n == 1) {
            System.out.println("1");
        } else if (n == 2) {
            System.out.println("1");
        } else {
            for (int i = 3; i<=n; i++){
                int temp = number1 + number2;
                number1 = number2;
                number2 = temp;
            }
            System.out.println(number2);
        }
    }
}
