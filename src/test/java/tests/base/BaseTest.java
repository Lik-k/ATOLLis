package tests.base;

import base.BasePage;
import common.CommonAction;
import org.openqa.selenium.WebDriver;
import practiceform.PracticeFormPage;

public class BaseTest {

    // получаем экземпляр драйвера
    protected static WebDriver driver = CommonAction.createDriver();

    // экземпляр базовой страницы и передаем экземплят драйвера которого создали
    protected static BasePage basePage = new BasePage(driver);

    // экземпляр страницы и передаем экземплят драйвера
    protected static PracticeFormPage practiceFormPage = new PracticeFormPage(driver);
}
