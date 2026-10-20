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
    public void validLoginTest() throws InterruptedException {
        takeScreenshots.takeSnapShot(driver, "BeforeLogin");
        homepage.clickLoginButton();
        loginPage.enterUsername(readData.username);
        loginPage.enterPassword(readData.password);
        loginPage.clickLoginSubmitButton();
        Thread.sleep(4000);
        landingPage.verifyLoginSuccess();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");

    }

    @Test (priority = 2)
    public void invalidLoginTest() throws InterruptedException {
        homepage.clickLoginButton();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("12345");
        loginPage.clickLoginSubmitButton();
        takeScreenshots.takeSnapShot(driver, "InvalidLogin");
        landingPage.verifyLoginSuccess();
    }

    //ToDo: Add logOut functionality test

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}
