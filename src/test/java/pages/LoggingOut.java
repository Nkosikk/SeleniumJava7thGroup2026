package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import java.time.Instant;

public class LoggingOut {
    WebDriver driver;
    @FindBy(xpath = "//span[text()='Menu']")
    WebElement profileIcon;
    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]")
    WebElement logoutButton;



    public LoggingOut(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProfileIcon() {
        profileIcon.click();
    }


    public void clickLogoutButton() {
        logoutButton.click();
    }
    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
