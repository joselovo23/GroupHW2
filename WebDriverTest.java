package com.syntax.groupHW2;

interface WebDriver {

    void open();
    void close();
    String getTitle();

}
interface TakeScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakeScreenshot {
    void navigate();

}

class ChromeDriver implements WebDriver, RemoteWebDriver, TakeScreenshot{

    @Override
    public void open() {
        System.out.println("Google Chrome is open");
    }

    @Override
    public void close() {
        System.out.println("Google Chrome is closed");
    }

    @Override
    public String getTitle() {
        String title ="google.com";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to google.com");
    }
}
class FireFoxDriver implements WebDriver, RemoteWebDriver, TakeScreenshot{

    @Override
    public void open() {
        System.out.println("FireFox is open");
    }

    @Override
    public void close() {
        System.out.println("FireFox is closed");
    }

    @Override
    public String getTitle() {
        String title ="mozilla.org";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to mozilla");
    }
}
class SafariDriver implements WebDriver, RemoteWebDriver, TakeScreenshot{

    @Override
    public void open() {
        System.out.println("Safari is open");
    }

    @Override
    public void close() {
        System.out.println("Safari is closed");
    }

    @Override
    public String getTitle() {
        String title ="safari.com";
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Saving screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating to safari.com");
    }
}

public class WebDriverTest{
    public static void main(String[] args) {

        RemoteWebDriver chrome = new ChromeDriver();
        RemoteWebDriver firefox = new FireFoxDriver();
        RemoteWebDriver safari = new SafariDriver();

        RemoteWebDriver[] browsers = {new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};

        for(RemoteWebDriver test : browsers){
            test.open();
            System.out.println("The title is "+test.getTitle());
            test.navigate();
            test.getScreenshot();
            test.close();
            System.out.println();
        }
    }
}