package Cwiczenia.WebDriver;

public class ChromeDriver implements WebDriver{
    @Override
    public void get() {
        System.out.println("Otwieramy przeglądarkę za pomocą Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomocą przeglądarki Chrome");
    }
}
