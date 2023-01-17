import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase01 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        if(driver.findElement(By.cssSelector("img[src='/static/images/home/logo.png']")).isDisplayed())
            System.out.println("Logo validation is PASSED");
        else System.out.println("Logo validation is FAILED");

        Driver.quitDriver();
    }
}
