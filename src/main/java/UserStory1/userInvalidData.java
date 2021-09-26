package UserStory1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class userInvalidData {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys("student@library");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sde22*");

        WebElement signIn = driver.findElement(By.xpath("//button"));
        signIn.click();

        Thread.sleep(3000);

        driver.close();
    }
}

