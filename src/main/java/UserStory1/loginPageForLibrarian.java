package UserStory1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class loginPageForLibrarian {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");

        String pageTitle = driver.getTitle();
        if( pageTitle.equals("Login - Library")){
            System.out.println("It is verified that the title is “Login - Library”");
        }else{
            System.out.println("Test failed,actual result does not match the excepting result "+pageTitle);
        }

        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys("librarian48@library");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");

        WebElement signIn = driver.findElement(By.xpath("//button"));
        signIn.click();

        Thread.sleep(3000);

        List<WebElement> modules = driver.findElements(By.className("title"));
        if (modules.size() == 3){
            System.out.println("Librarian can see 3 models on the page");
        }else{
            System.out.println("Sorry, test is failed "+modules.size());
        }









    }
}
