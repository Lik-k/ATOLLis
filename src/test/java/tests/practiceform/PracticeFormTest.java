package tests.practiceform;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static tests.practiceform.DataObject.*;


// сценарий теста
public class PracticeFormTest extends BaseTest {

    @Test
    public void checkPracticeFormTest() {
        // передаем url
        basePage.open("https://demoqa.com/automation-practice-form");

        // запускает сценарий заполнения формы
        practiceFormPage.registrationStudent(testFirstName, testLastName, testEmail, testMobileNumber, testCurrentAddress);

        // basePage.closeBrowser();
    }
}
