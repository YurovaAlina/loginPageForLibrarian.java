package UserStory2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AddNewUser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://library2.cybertekschool.com/login.html");
        WebElement login = driver.findElement(By.id("inputEmail"));
        login.sendKeys("librarian48@library");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("Sdet2022*");

        Thread.sleep(2000);


        WebElement signIn = driver.findElement(By.xpath("//button"));
        signIn.click();

        Thread.sleep(2000);

        WebElement userBtn=driver.findElement(By.linkText("Users"));
        userBtn.click();

        Thread.sleep(2000);

        WebElement addUserBtn = driver.findElement(By.xpath("//*[@id='users']/div[1]/div[1]/span/a"));
        addUserBtn.click();

        Thread.sleep(2000);

        WebElement fullName = driver.findElement(By.xpath("//*[@id=\"add_user_form\"]/div[1]/div/div[1]/div/div/input"));
        fullName.sendKeys("Alina Yurova");

        Thread.sleep(2000);

        WebElement password2 = driver.findElement(By.xpath("//*[@id=\"add_user_form\"]/div[1]/div/div[2]/div[1]/div/input"));
        password2.sendKeys("Alina");

        Thread.sleep(2000);

        WebElement email = driver.findElement(By.xpath("//*[@id=\"add_user_form\"]/div[1]/div/div[2]/div[2]/div/input"));
        email.sendKeys("lalafa@gmail.com");

        Thread.sleep(2000);

        WebElement address = driver.findElement(By.xpath("//*[@id=\"address\"]"));
        address.sendKeys("2735 Bristol Dr., Lisle");

        Thread.sleep(2000);

        WebElement submit = driver.findElement(By.xpath("//*[@id=\"add_user_form\"]/div[2]/button[2]"));
        submit.click();

        WebElement UsersAfterAdding=driver.findElement(By.id("tbl_users_info"));
        String afterAddingUsers=UsersAfterAdding.getText();




    }
}

/*
Given librarian is on the homePage
 When librarian click Users module
 And librarian click “+Add User” button
 When librarian enter full name, password, email and address
 And librarian click save changes
 Then verify a new user is created
 */