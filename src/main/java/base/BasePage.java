package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.Config.EXPLICIT_WAIT;


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

//    public WebElement waitElementIsVisible(WebElement element) {
//        new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOf(element));
//
//        return element;
//    }
}
