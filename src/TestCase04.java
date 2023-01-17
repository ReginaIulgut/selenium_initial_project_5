import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase04 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");

        if(driver.findElement(By.cssSelector("p[class='pull-left']")).isDisplayed())
            System.out.println("The footer test is PASSED");
        else System.out.println("The footer test is FAILED");

        Driver.quitDriver();
    }
}
