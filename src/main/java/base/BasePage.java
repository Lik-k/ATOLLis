package base;

import common.ResourceFileFinder;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.net.URL;


public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // медот передачи url браузеру
    public void open(String url) {
        driver.get(url);
    }

    // метод закрытия браузера
    public void closeBrowser() {
        driver.close();
    }
}
