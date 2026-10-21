package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2")
    WebElement welcomeText;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLoginSuccess(String expectedText) {
        if(welcomeText.isDisplayed()){
            System.out.println("Login successful! Welcome text is displayed: ");

        }
        else {
            System.out.println("Login failed! Welcome text is not displayed.");
        }
    }
}
