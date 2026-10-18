package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstLogin {


    WebDriver driver;

    @BeforeTest
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#dashboard");
        driver.manage().window().maximize();
        Thread.sleep(6000);

    }

    @Test
    public void clickLoginButton() {
        driver.findElement(By.xpath("/html/body/div/div/main/div/button")).click();

    }

    @Test(dependsOnMethods = {"clickLoginButton"})
    public void inputUserName() {
        driver.findElement(By.id("login-email")).sendKeys("Bongza123@gmail.com");
    }

    @Test(dependsOnMethods = {"inputUserName"})
    public void inputPassword() {
        driver.findElement(By.id("login-password")).sendKeys("Test1234?");
    }

    @Test(dependsOnMethods = {"inputPassword"})
    public void clickSubmitButton() {
        driver.findElement(By.id("login-submit")).click();

    }

    @Test(dependsOnMethods = {"clickSubmitButton"})
    public void clickLearnDropDown() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button")).click();
        Thread.sleep(6000);
    }

    @Test(dependsOnMethods = {"clickLearnDropDown"})
    public void clickLearnMaterial() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]")).click();
        Thread.sleep(6000);

    }

    @Test(dependsOnMethods = {"clickLearnMaterial"})
    public void clickAPITesting() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"tab-btn-api\"]/span[2]")).click();
        Thread.sleep(3000);

    }


    @Test(dependsOnMethods = {"clickAPITesting"})
    public void clickWebBasicForm() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();

    }

    @Test(dependsOnMethods = {"clickWebBasicForm"})
    public void enterFullName() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Bongani Automation");

    }

    @Test(dependsOnMethods = {"enterFullName"})
    public void enterEmail() {
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Bongza@Yahoo.com");

    }

    @Test(dependsOnMethods = {"enterEmail"})
    public void enterAge() {
        driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("25");

    }

    @Test(dependsOnMethods = {"enterAge"})
    public void clickGenderDropdown() {
        driver.findElement(By.xpath("//*[@id=\"gender\"]")).click();
    }

    @Test(dependsOnMethods = {"clickGenderDropdown"})
    public void selectGender() {
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
    }

    @Test(dependsOnMethods = {"selectGender"})
    public void clickCountryDropdown() {
        driver.findElement(By.id("country")).click();
    }

    @Test(dependsOnMethods = {"clickCountryDropdown"})
    public void selectCountry() {
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[5]")).click();
    }

    @Test(dependsOnMethods = {"selectCountry"})
    public void clickExperienceDropdown() {
        driver.findElement(By.id("experience")).click();
    }

    @Test(dependsOnMethods = {"clickExperienceDropdown"})
    public void selectExperience() {
        driver.findElement(By.xpath("//*[@id=\"experience\"]/option[3]")).click();
    }

    @Test(dependsOnMethods = {"selectExperience"})
    public void selectSkill() {
        driver.findElement(By.id("skill-java")).click();
        driver.findElement(By.id("skill-selenium")).click();
    }

    @Test(dependsOnMethods = {"selectSkill"})
    public void addingComments() {
        driver.findElement(By.id("comments")).sendKeys("No comment Please!!!!! ...");
    }

    @Test(dependsOnMethods = {"addingComments"})
    public void checkRadioButtons() {
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("terms")).click();
    }

    @Test(dependsOnMethods = {"checkRadioButtons"})
    public void clickValidateForm() {
        driver.findElement(By.id("validate-btn")).click();

    }

    @Test(dependsOnMethods = {"clickValidateForm"})
    public void clickSubmitFormButton() throws InterruptedException {
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(5000);
    }

    @Test(dependsOnMethods = {"clickSubmitFormButton"})
    public void clickSubmissionsButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"submissions-toggle-btn\"]")).click();
        Thread.sleep(3000);

    }

    @Test(dependsOnMethods = {"clickSubmissionsButton"})
    public void clickViewOnSubmissions() {
        driver.findElement(By.xpath("/html/body/div/div/main/section/div[3]/div/div[2]/div[2]/div/button")).click();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
