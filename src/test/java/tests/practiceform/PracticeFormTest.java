package tests.practiceform;

import org.testng.annotations.Test;
import practiceform.FormDto;
import tests.base.BaseTest;


// сценарий теста
public class PracticeFormTest extends BaseTest {

    @Test
    public void checkPracticeFormTest() {
        // передаем url
        basePage.open("https://demoqa.com/automation-practice-form");

        // запускает сценарий заполнения формы
        practiceFormPage.registrationStudent(FormDto.testData());
    }
}
