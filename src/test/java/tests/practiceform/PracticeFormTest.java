package tests.practiceform;

import org.openqa.selenium.WebDriver;
import base.BasePage;
import org.testng.annotations.Test;
import practiceform.PracticeFormPage;
import common.CommonAction;
import tests.base.BaseTest;

import static tests.practiceform.DataObject.*;


// сценарий теста
public class PracticeFormTest extends BaseTest {

    @Test
    public static void main(String[] args) {

        // передаем url
        basePage.open("https://demoqa.com/automation-practice-form");

        // запускает сценарий заполнения формы
        practiceFormPage.registrationStudent(testFirstName, testLastName, testEmail, testMobileNumber, testCurrentAddress);

//        basePage.closeBrowser();

    }
}
