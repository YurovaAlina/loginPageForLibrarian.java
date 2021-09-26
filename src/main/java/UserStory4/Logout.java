package UserStory4;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Logout  {
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

        WebElement Librarian = driver.findElement(By.xpath("//*[@id='navbarDropdown']"));
        Librarian.click();

        Thread.sleep(3000);

        WebElement logOut = driver.findElement(By.xpath("//*[@id='navbarCollapse']/ul[2]/li/div/a"));
        logOut.click();

        String expectedTitle = "Login - Library" ;
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle ) ;


    }

    private static void assertEquals(String expectedTitle, String actualTitle) {
        System.out.println("Expected Title " + expectedTitle);
        System.out.println("Actual Title " + actualTitle);
    }
}



/*
AC #1:  Given user (librarian) is on the homePage
When user click username on the right top corner
And user click Log Out
Then verify user navigate back to login page.
 */