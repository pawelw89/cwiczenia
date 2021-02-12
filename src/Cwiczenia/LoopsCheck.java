package Cwiczenia;

public class LoopsCheck {

    public static void main(String[] args) {

        for (int i = 0; i<100; i++) {
            if (i%3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n ====================");

        int[] numbers = {1, 3, 5};
        int[] numbersInverted = new int[numbers.length];
        for (int j = 0; j<numbersInverted.length;  j++) {
            numbersInverted [j] = numbers[numbers.length-1 - j];
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (int element2 : numbersInverted) {
            System.out.print(element2 + " ");
        }
    }
}
