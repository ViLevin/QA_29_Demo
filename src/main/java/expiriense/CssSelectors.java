package expiriense;

import org.openqa.selenium.By;
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

        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getAttribute("class"));

        WebElement imgTools = driver.findElement(By.cssSelector("img[src='/images/Toolsqa.jpg']"));
        System.out.println(imgTools.getTagName());
        System.out.println(imgTools.getAttribute("src"));

        WebElement elements = driver.findElement(By.cssSelector("div[class='card-up']"));
        elements.click();

        pause(5);

        driver.quit();

    }
    public void pause(int time){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
