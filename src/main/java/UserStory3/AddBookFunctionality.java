package UserStory3;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddBookFunctionality {

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

        WebElement books = driver.findElement(By.xpath("//ul[@id = 'menu_item'] // a[@href ='#books'] / span[@class = 'title']"));
        books.click();

        Thread.sleep(3000);

        WebElement addBook=driver.findElement(By.xpath("//*[@id='books']/div[1]/div[1]/span/a"));
        addBook.click();

        Thread.sleep(3000);

        WebElement bookName = driver.findElement(By.xpath("//*[@id='add_book_form']/div[1]/div/div[1]/div[1]/div/input"));
        bookName.sendKeys("Master and Margarita");

        Thread.sleep(3000);

        WebElement ISBN = driver.findElement(By.xpath("//*[@id='add_book_form']/div[1]/div/div[1]/div[2]/div/input"));
        ISBN.sendKeys("428482049");

        Thread.sleep(3000);

        WebElement year = driver.findElement(By.xpath("//*[@id='add_book_form']/div[1]/div/div[1]/div[3]/div/input"));
        year.sendKeys("1940");

        Thread.sleep(3000);

        WebElement author = driver.findElement(By.xpath("//*[@id='add_book_form']/div[1]/div/div[2]/div[1]/div/input"));
        author.sendKeys("Mikhail Bulgakov");

        Thread.sleep(3000);

        WebElement bookCategory = driver.findElement(By.xpath("//*[@id='book_group_id']"));
        Select bookCateg = new Select(bookCategory);
        bookCateg.selectByVisibleText("Romance");

        Thread.sleep(3000);

        WebElement description = driver.findElement(By.xpath("//*[@id='description']"));
        description.sendKeys("This is a legendary russian novel by Mikhail Bulgakov.");

        Thread.sleep(3000);

        WebElement save = driver.findElement(By.xpath("//*[@id='add_book_form']/div[2]/button[2]"));
        save.click();

        Thread.sleep(3000);




        /*
        Given librarian is on the homePage
        When librarian click Books module
        And librarian click “+Add Book” button
        When librarian enter BookName, ISBN, Year, Author, and Description
        And librarian click save changes
        Then verify a new book is added
         */







    }
}


