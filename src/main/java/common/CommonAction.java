package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import static common.Config.IMPLICIT_WAIT;

/*
инициализация веб драйвера, тут можно расширить на случай если нужен будет не только хром драйвер
 но и драйверы для других браузеров
 */
public class CommonAction {
    private static WebDriver driver = null;

    public static WebDriver createDriver() {

        if(driver == null) {
            System.getProperty("webdriver.chrome.driver ", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        }
        return driver;
    }
}
