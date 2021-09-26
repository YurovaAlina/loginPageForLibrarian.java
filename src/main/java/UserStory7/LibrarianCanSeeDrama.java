package UserStory7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibrarianCanSeeDrama {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("http://library2.cybertekschool.com/login.html");

        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys("librarian48@library");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");

        WebElement signIn = driver.findElement(By.xpath("//button"));
        signIn.click();

        Thread.sleep(3000);


        WebElement booksModule = driver.findElement(By.xpath("//span[@class='title' and text()='Books']"));
        booksModule.click();
        Thread.sleep(7000);

        WebElement bookCategories = driver.findElement(By.id("book_categories"));
        Select selectDrama = new Select(bookCategories);
        Thread.sleep(2000);

        selectDrama.selectByVisibleText("Drama");

        Thread.sleep(5000);

        String expectedResult = "Drama";
        String actualResult=driver.findElement(By.xpath("//select[@id='book_categories']//option[text()='Drama']")).getText();
        assertEquals(expectedResult, actualResult);

        System.out.println("Expected result is "+ expectedResult);
        System.out.println("Actual Result is "+ actualResult);

        driver.close();
    }
}


/*
As a user, I want to filter book categories.
AC #1:  Given user is on the homePage
 When user click Books module
 And user click book category dropdown
 Then verify there are 21 options

 Test it for librarian and student
 */
