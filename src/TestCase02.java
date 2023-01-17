import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class TestCase02 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        List<WebElement> navBar =
                driver.findElements(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul>li"));

        for (WebElement webElement : navBar) {
            if(webElement.isDisplayed() && webElement.isEnabled()) System.out.println(webElement.getText());
            else System.out.println("Test FAILED");
        }

        Driver.quitDriver();
    }
}
