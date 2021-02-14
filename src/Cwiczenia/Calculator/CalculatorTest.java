package Cwiczenia.Calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator  = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Twoje liczby to: " + firstNumber + " oraz " + secondNumber);

        int addition = calculator.addiction(firstNumber, secondNumber);
        System.out.println("Wynik dodawania to: " + addition);

        int subtration = calculator.subtration(firstNumber, secondNumber);
        System.out.println("Wynik odejmowania to: " + subtration);

        int multiplication = calculator.multiplication(firstNumber, secondNumber);
        System.out.println("Wynik mnożenia to: " + multiplication);

        int division = calculator.division(firstNumber, secondNumber);
        System.out.println("Wynik dzielenia to: " + division);

    }
}
