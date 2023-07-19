package tests.practiceform;

import org.openqa.selenium.WebDriver;
import base.BasePage;
import practiceform.PracticeFormPage;
import common.CommonAction;
import static tests.practiceform.ConfigFotPracticeForm.*;

// сценарий теста
public class PracticeFormTest {

    public static void main(String[] args) {

        WebDriver driver = CommonAction.createDriver();

        // создаем экземпляр BasePage
        BasePage basePage = new BasePage(driver);

        // создаем экземпляр страницы PracticeFormPage
        PracticeFormPage practiceFormPage = new PracticeFormPage(driver);

        // передаем url
        basePage.open("https://demoqa.com/automation-practice-form");

        // запускает сценарий заполнения формы
        practiceFormPage.registrationStudent(testFirstName, testLastName, testEmail, testMobileNumber, testCurrentAddress);

//        basePage.closeBrowser();

    }
}
