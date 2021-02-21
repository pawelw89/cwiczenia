package Cwiczenia.PhoneApp;

public class AppChecker {

    public static void main(String[] args) {

        AndroidApp androidApp = new AndroidApp( "Android Application");
        IphoneApp iphoneApp = new IphoneApp("Iphone Application");

        androidApp.AppInfo();
        iphoneApp.AppInfo();
    }
}
