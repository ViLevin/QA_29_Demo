package tests;

import dto.Student;
import manager.AppManager;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

public class PracticeFormTests extends AppManager {
    @Test
    public void studentRegFormPositiveTest() {
        Student student = new Student("Vasya", "Vasylev", "111@gmail.com", "Other", "1234567890", "11 Dec 2004", "Maths,Physics,Chemistry", "sport", "", "Street,1", "NCR", "Delhi");
        new HomePage(getDriver()).clickBtnForms();
        new FormsPage(getDriver()).clickBtnPracticeForm();
        new PracticeFormPage(getDriver()).typePracticeForm(student);

    }
}
