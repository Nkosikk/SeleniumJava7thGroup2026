package LoginPurchaseInvoice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {

    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException{

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
        driver.findElement(By.id("login-email")).sendKeys("monde@gmail.com");
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
    public void verifyLoginSuccess () throws  InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2/span[1]")).isDisplayed();
    }

    @Test(dependsOnMethods = {"verifyLoginSuccess"})
    public void clickLearnTab() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath ("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button")).click();
    }

    @Test(dependsOnMethods = {"clickLearnTab"})
    public void clickLearningMaterial() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
    }

    @Test(dependsOnMethods = {"clickLearningMaterial"})
    public void verifyLearningMaterialPage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("practice-heading")).isDisplayed();
    }

    @Test(dependsOnMethods = {"verifyLearningMaterialPage"})
    public void clickWebAutomationAdvanceTab() {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-web\"]/span[2]")).click();
    }

    @Test(dependsOnMethods = {"clickWebAutomationAdvanceTab"})
    public void verifyWebAutomationAdvancePage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("inventory-title")).isDisplayed();
    }

    @Test(dependsOnMethods = {"verifyWebAutomationAdvancePage"})
    public void selectDeviceType() throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(By.id("deviceType")).click();
        driver.findElement(By.xpath("//*[@id=\"deviceType\"]/option[2]")).click();
    }

    @Test(dependsOnMethods = {"selectDeviceType"})
    public void selectDeviceModel() throws InterruptedException {
        Thread.sleep(3000);
       //driver.findElement(By.id("brand")).click();
        driver.findElement(By.xpath("//*[@id=\"brand\"]/option[2]")).click();
    }

    @Test(dependsOnMethods = {"selectDeviceModel"})
    public void selectDeviceStorage() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("storage-128GB")).click();
    }

    @Test(dependsOnMethods = {"selectDeviceStorage"})
    public void selectDeviceColor() throws InterruptedException {
        Thread.sleep(3000);
        //driver.findElement(By.id("color-blue")).click();
        driver.findElement(By.xpath("//*[@id=\"color\"]/option[4]")).click();
    }

    @Test(dependsOnMethods = {"selectDeviceColor"})
    public void enterDeviceQuantity() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("quantity")).clear();
        driver.findElement(By.id("quantity")).sendKeys("2");
    }

    @Test(dependsOnMethods = {"enterDeviceQuantity"})
    public void enterDeliveryAddress() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("address")).sendKeys("123 Main Street, Serengeti, Gauteng, 12345");
    }

    @Test(dependsOnMethods = {"enterDeliveryAddress"})
    public void clickNextButton() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("inventory-next-btn")).click();
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
