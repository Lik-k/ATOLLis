package practiceform;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static common.ResourceFileFinder.getResourceFilePath;

// локаторы и методы страницы
public class PracticeFormPage extends BasePage {

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    // локаторы на странице с формой
    By inputFirstName = By.id("firstName");
    By inputLastName = By.id("lastName");
    By inputEmail = By.id("userEmail");
    By radioGenderMan = By.cssSelector("[for='gender-radio-1']");
    By inputDateOfBird = By.id("dateOfBirthInput");
    By inputMobileNumber = By.id("userNumber");
    By inputSubjects = By.id("subjectsInput");
    By checkSport = By.cssSelector("[for = 'hobbies-checkbox-1']");
    By checkReading = By.cssSelector("[for = 'hobbies-checkbox-2']");
    By uploadPicture = By.id("uploadPicture");
    By currentAddress = By.id("currentAddress");
    By inputState = By.id("state");
    By inputCity = By.id("city");
    By buttonSubmit = By.id("submit");


    String fileName = "dream.jpg";
    public String ResourceFileFinder(){
        String absolutePath = getResourceFilePath(fileName);
        if (absolutePath != null) {
            System.out.println("Found file: " + absolutePath);
        }
        return absolutePath;
    }


    // заполнение всех полей в форме регистрации
    public PracticeFormPage registrationStudent(String testFirstName, String testLastName, String testEmail,
                                                String testMobileNumber, String testCurrentAddress){

        driver.findElement(inputFirstName).sendKeys(testFirstName);
        driver.findElement(inputLastName).sendKeys(testLastName);
        driver.findElement(inputEmail).sendKeys(testEmail);
        driver.findElement(radioGenderMan).click();
        driver.findElement(inputMobileNumber).sendKeys(testMobileNumber);
        driver.findElement(inputDateOfBird).click();

        WebElement inputDateOfBirdValue = driver.findElement(By.xpath("//div[@class='react-datepicker__week'][1]/div[1]"));
        inputDateOfBirdValue.click();

        driver.findElement(inputSubjects).sendKeys("Accounting");
        driver.findElement(inputSubjects).sendKeys(Keys.RETURN);
        driver.findElement(checkSport).click();
        driver.findElement(checkReading).click();
        driver.findElement(uploadPicture).sendKeys(ResourceFileFinder());
        driver.findElement(currentAddress).sendKeys(testCurrentAddress);

        driver.findElement(inputState).click();
        WebElement inputStateValue = driver.findElement(By.id("react-select-3-input"));
        inputStateValue.sendKeys(Keys.ENTER);

        driver.findElement(inputCity).click();
        WebElement inputCityValue = driver.findElement(By.id("react-select-4-input"));
        inputCityValue.sendKeys(Keys.ENTER);
        driver.findElement(buttonSubmit).click();
        return this;
    }

    public void registrationStudent(FormDto formDto) {
        registrationStudent(
                formDto.testFirstName(),
                formDto.testLastName(),
                formDto.testEmail(),
                formDto.testMobileNumber(),
                formDto.testCurrentAddress());
    }

}

