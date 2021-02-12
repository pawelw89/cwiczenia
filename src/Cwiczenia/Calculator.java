package Cwiczenia;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Twoje liczby to: " + firstNumber + " oraz " + secondNumber);

        int addition = firstNumber + secondNumber;
        int subtration = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;

        System.out.println("Wynik dodawania to: " + addition);
        System.out.println("Wynik odejmowania to: " + subtration);
        System.out.println("Wynik mnożenia to: " + multiplication);
        System.out.println("Wynik dzielenia to: " + division);

    }
}
