package Cwiczenia.WebDriver;

public class FirefoxDriver implements WebDriver{

    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą przeglądarki Firefox");
    }
}
