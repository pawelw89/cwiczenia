package Cwiczenia.Exception;

import java.util.Scanner;

public class AgeTester {

    public static void main(String[] args) throws InvalidAgeException {

        int age;

        System.out.println("Podaj swój wiek");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age<0) {
            throw new InvalidAgeException("Nieprawidłowy wiek");
        } else if (age<18) {
            System.out.println("Jesteś niepełnoletni");
        } else {
            System.out.println("Jesteś pełnoletni");
        }
    }
}
