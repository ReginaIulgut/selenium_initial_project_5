import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class TestCase03 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get(" https://automationexercise.com/");


        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='single-widget"));
        for (WebElement e : elements) {
            if (driver.findElement(By.id("subscribe_email")).isDisplayed())
                System.out.println("email placeholder validation PASSED");
            if (driver.findElement(By.cssSelector("i[class*='fa fa-arrow'")).isDisplayed())
                System.out.println("arrow submit validation PASSED");
            System.out.println(e.getText());
        }
        Driver.quitDriver();
    }
}
