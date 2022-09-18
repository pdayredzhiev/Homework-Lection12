import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
public WebDriver driver;
    @Test
    public void Test1(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gotse\\IdeaProjects\\FirstJunitAndSeleniumProject\\src\\main\\resources\\Driver\\chromedriver.exe");
 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.google.com/");
driver.findElement(By.id("L2AGLb")).click();
driver.findElement(By.name("q")).sendKeys("HP"+ Keys.ENTER);
driver.quit();
    }
}
