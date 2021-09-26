package UserStory1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class loginPageForStudent {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys("student46@library");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");

        WebElement signIn = driver.findElement(By.xpath("//button"));
        signIn.click();

        Thread.sleep(3000);

        List<WebElement> modules = driver.findElements(By.className("title"));
        if (modules.size() == 3){
            System.out.println("Student can see 3 modules on the page");
        }else{
            System.out.println("Sorry, but test is failed "+modules.size());
        }

        driver.close();


    }
}

