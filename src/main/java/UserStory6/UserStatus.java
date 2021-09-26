package UserStory6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserStatus {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys("librarian48@library");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");

        WebElement signIn = driver.findElement(By.xpath("//button"));
        signIn.click();

        Thread.sleep(3000);

        WebElement userBtn;
        userBtn = driver.findElement(By.xpath("//*[@id='menu_item']/li[2]/a/span[1]"));
        userBtn.click();

        Thread.sleep(3000);

        WebElement status = driver.findElement(By.xpath("//*[@id='user_status']"));
        status.click();

        Thread.sleep(3000);

        List<WebElement>statusCheck = driver.findElements(By.xpath("//*[@id='user_status']//option"));
        int expectedResult = 2;
        int actualResult = statusCheck.size();
        assertEquals(expectedResult, actualResult);
        System.out.println("Expected result is "+ expectedResult);
        System.out.println("Actual result is "+ actualResult);



    }
}

/*
As a librarian, I want to select user status - active vs inactive.
AC #1:  Given librarian is on the homePage
When librarian click Users module
And librarian click Status dropdown
Then verify there are 2 status options
 */
