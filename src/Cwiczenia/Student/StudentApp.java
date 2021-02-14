package Cwiczenia.Student;

public class StudentApp {

    public static void main(String[] args) {

        Student Piotr = new Student("Piotr", "Kowalski", "Piotrunio", "piotrunio@wp.pl", 1);
        Student Kaska = new Student("Katarzyna", "Nowak", "Kacha", "kacha@wp.pl", 1);
        Student Lukasz = new Student("Lukasz", "Wyżny", "Luki", "luki@wp.pl", 1);

        Student [] student = new Student [] {Piotr, Kaska, Lukasz};

        System.out.println(student[1].getName());
    }
}
