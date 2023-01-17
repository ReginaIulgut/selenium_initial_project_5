import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class TestCase05 {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        driver.findElement(By.xpath("(//ul//li//a)[5]")).click();

        if( driver.getTitle().equals("Automation Practice Website for UI Testing - Test Cases")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");

        if(driver.getCurrentUrl().equals("https://automationexercise.com/test_cases")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        Driver.quitDriver();

    }
}
