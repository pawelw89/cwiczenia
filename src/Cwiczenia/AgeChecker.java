package Cwiczenia;

import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Przykro mi, ale jesteś niepełnoletni i nie możemy Ci sprzedać alkoholu");
        } else {
            System.out.println("Dziękujemy za zakupy!");
        }
    }
}
