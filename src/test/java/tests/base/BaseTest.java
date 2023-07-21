package tests.base;

import base.BasePage;
import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import practiceform.PracticeFormPage;

public class BaseTest {

    // получаем экземпляр драйвера
    protected WebDriver driver;

    // экземпляр базовой страницы и передаем экземплят драйвера которого создали
    protected BasePage basePage;

    // экземпляр страницы и передаем экземплят драйвера
    protected PracticeFormPage practiceFormPage;

    @BeforeSuite
    protected void beforeSuite() {
        driver = CommonAction.createDriver();
    }

    @BeforeMethod
    protected void beforeMethod() {
        basePage = new BasePage(driver);
        practiceFormPage = new PracticeFormPage(driver);
    }

    @AfterSuite
    protected void afterSuite() {
        driver.close();
        driver.quit();
    }
}
