package UserStory7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterBookCategoriesForStudent {
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

        WebElement BooksModule = driver.findElement(By.xpath("//*[@id='menu_item']/li[3]/a/span[1]"));
        BooksModule.click();

        Thread.sleep(3000);

        WebElement Categories = driver.findElement(By.xpath("//*[@id='book_categories']"));
        Categories.click();

        Thread.sleep(3000);



        List<WebElement> AllСategoriesCheck = driver.findElements(By.xpath("//*[@id='book_categories']//option"));


        Thread.sleep(5000);



        int expectedResultForStudent = 21;
        int actualResultForStudent = AllСategoriesCheck.size();
        assertEquals(expectedResultForStudent, actualResultForStudent);
        System.out.println("Expected result is "+ expectedResultForStudent);
        System.out.println("Actual result is "+ actualResultForStudent);

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