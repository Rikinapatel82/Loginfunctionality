import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInFunctionalityDriverBasic {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\software\\driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get(":https//demo.nopcommerce.com/");
driver.findElement(By.name("USER ID")).sendKeys("riki123");
driver.findElement(By.name("Password")).sendKeys("Riki123");
driver.findElement(By.name("Rikilogin")).click();
    }
}
