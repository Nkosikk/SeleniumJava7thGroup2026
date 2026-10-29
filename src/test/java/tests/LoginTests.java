package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginTests extends Base {

    //Single line tests for login functionality, commented out as they are now part of the VerifyLogin test
//    @Test
//    public void clickLoginButton() throws InterruptedException {
//        homepage.clickLoginButton();
//    }
//
//    @Test
//    public void enterUsernameTests() {
//        loginPage.enterUsername("playtest@gmail.com");
//    }
//

    @Test
    public void validLoginTest() {
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.enterUsername(readData.username);
        loginPage.enterPassword(readData.password);
        loginPage.clickLoginSubmitButton();
        landingPage.verifyLoginSuccess();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");
        landingPage.clickMenuButton();
        landingPage.clickLogoutButton();
        landingPage.acceptAlert();

    }

    @Test (priority = 2)
    public void invalidLoginTest(){
        homepage.clickLoginButton();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("12345");
        loginPage.clickLoginSubmitButton();
        takeScreenshots.takeSnapShot(driver, "InvalidLogin");

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
