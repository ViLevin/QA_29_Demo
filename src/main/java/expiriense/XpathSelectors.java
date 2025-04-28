package expiriense;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XpathSelectors {
    WebDriver driver = new ChromeDriver();

    @Test

    public void selectorsTextBox() {
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        hideBanner();
        hideFooter();

        WebElement inputFullName = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        inputFullName.sendKeys("Monkey");

        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        inputEmail.sendKeys("monkey@gmail.com");
        // WebElement divCurrAdd = driver.findElement(By.id("currentAddress-wrapper"));
        // divCurrAdd.sendKeys("Monkey str, 5");

        WebElement inputCurrAdd = driver.findElement(By.xpath("//*[@placeholder='Current Address']"));
        inputCurrAdd.sendKeys("Monkey str, 5");

        WebElement inputPerAdd = driver.findElement(By.id("permanentAddress"));
        inputPerAdd.sendKeys("MonkeyCity");
        WebElement btnSubmit = driver.findElement(By.xpath("//button[text()='Submit']"));
        btnSubmit.click();
        WebElement outPut = driver.findElement(By.xpath("//div[@id='output']"));
        System.out.println(outPut.getText());

        driver.quit();

    }


    public void hideBanner() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }

    public void hideFooter() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }

    public void pause(int time) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


