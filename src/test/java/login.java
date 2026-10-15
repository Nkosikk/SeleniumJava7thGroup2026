import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(5000);
    }

    @Test
    public void clickLoginButton() {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }

    @Test(dependsOnMethods = {"clickLoginButton"})
    public void enterUsername() {
        driver.findElement(By.id("login-email")).sendKeys("njceles@gmail.com");
    }

    @Test(dependsOnMethods = {"enterUsername"})
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
    }

    @Test(dependsOnMethods = {"enterPassword"})
    public void clickSubmitButton() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Test(dependsOnMethods = {"clickSubmitButton"})
    public void verifyLoginSuccess() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[1]")).isDisplayed();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
