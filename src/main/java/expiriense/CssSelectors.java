package expiriense;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage() {
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        hideBanner();
        hideFooter();
        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getAttribute("class"));

        WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(imgTools.getTagName());
        System.out.println(imgTools.getAttribute("src"));

        WebElement elements = driver.findElement(By.cssSelector("div[class='card-up']"));
        elements.click();

        pause(5);
        hideFooter();
        WebElement radioButton = driver.findElement(By.id("item-2"));
        radioButton.click();
        pause(5);
        //WebElement buttonYes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        WebElement buttonYes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        buttonYes.click();

        //driver.quit();

    }

    public void hideBanner(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display='none'");
    }

    public void hideFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display='none'");
    }

    public void pause(int time){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
