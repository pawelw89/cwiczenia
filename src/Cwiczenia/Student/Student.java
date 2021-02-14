package Cwiczenia.Student;

public class Student {

    public String name;
    public String nazwisko;
    public String nick;
    public String mail;
    public int numerIndeksu;

    public Student(String name, String nazwisko, String nick, String mail, int numerIndeksu) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.nick = nick;
        this.mail = mail;
        this.numerIndeksu = numerIndeksu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public void setNumerIndeksu(int numerIndeksu) {
        this.numerIndeksu = numerIndeksu;
    }
}
