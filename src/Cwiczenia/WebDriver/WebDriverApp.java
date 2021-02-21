package Cwiczenia.WebDriver;

public class WebDriverApp {

    public static void main(String[] args) {

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.findElementBy();
        firefoxDriver.get();

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.findElementBy();
        chromeDriver.get();
    }

}
