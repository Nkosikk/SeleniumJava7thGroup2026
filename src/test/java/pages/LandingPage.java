package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

    WebDriver driver;

    @FindBy(xpath = "//span[normalize-space()='My Learning']")
    WebElement myLearningTab;

    @FindBy(xpath = "//button/span[text()='Logout']")
    WebElement logoutButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginSuccess() {
        myLearningTab.isDisplayed();
    }
    public void logout(){
        logoutButton.click();
    }

}
