package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"app-main-content\"]/section/div[1]/div[1]/h2")
    WebElement welcomeText;

    @FindBy(xpath = "/html/body/div/div/nav/div[1]/div[3]/div/button")
    WebElement menuButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/div/button[5]/span[2]")
    WebElement logoutButton;

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

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }
}
