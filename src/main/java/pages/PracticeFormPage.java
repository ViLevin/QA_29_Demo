package pages;

import dto.Student;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(id = "firstName")
    WebElement fieldName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement fieldLastName;
    @FindBy(id = "userEmail")
    WebElement fieldEmail;
    @FindBy(xpath = "//input[@placeholder='Mobile Number']")
    WebElement fieldMobile;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement fieldAddress;
    @FindBy(id="dateOfBirth")
    WebElement fieldDateOfBirth;
    @FindBy(id="react-select-3-input")
    WebElement inputState;
    @FindBy(id="react-select-4-input")
    WebElement inputCity;
    @FindBy(xpath = "//button[text()='Submit']")
    WebElement btnSubmit;



    public void typePracticeForm(Student student) {
        hideFooter();
        fieldName.sendKeys(student.getName());
        fieldLastName.sendKeys(student.getLastName());
        fieldEmail.sendKeys(student.getEmail());
        fieldMobile.sendKeys(student.getMobile());
        fieldAddress.sendKeys(student.getAddress());
        fieldDateOfBirth.sendKeys(student.getDateOfBirth());
        inputState.sendKeys(student.getState());
        inputCity.sendKeys(student.getCity());
        btnSubmit.click();
    }
}
