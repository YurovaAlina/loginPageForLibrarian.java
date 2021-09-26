package UserStory5;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.ArrayList;

public class SelectUserGroups  {

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

        Thread.sleep(1000);

        WebElement userBtn = driver.findElement(By.xpath("//*[@id='menu_item']/li[2]/a/span[1]"));
        userBtn.click();

        Thread.sleep(1000);


        WebElement AllGroups = driver.findElement(By.xpath("//*[@id='user_groups']"));
        AllGroups.click();

        Thread.sleep(1000);

        List<WebElement> AllGroupOption = driver.findElements(By.xpath("//select[@id='user_groups']//option"));

        int expectedResult = 3;
        int actualResult = AllGroupOption.size();
        assertEquals(expectedResult,actualResult);



    }

    private static void assertEquals(int expectedResult, int actualResult) {
        System.out.println("Expected result is " + expectedResult );
        System.out.println("Actual result is " + actualResult);
    }


}




/*
As a librarian, I want to select user groups.
AC #1:  Given librarian is on the homePage
When librarian click Users module
And librarian click user group dropdown
Then verify librarian have 3 options
 */
