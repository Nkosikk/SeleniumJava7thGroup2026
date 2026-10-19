package tests;

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
        loginPage.enterUsername("Bongza123@gmail.com");
        loginPage.enterPassword("Test1234?");
        loginPage.clickLoginSubmitButton();
        Thread.sleep(4000);
        landingPage.verifyLoginSuccess();
        takeScreenshots.takeSnapShot(driver, "AfterLogin");
        Thread.sleep(5000);
        loggingOut.clickProfileIcon();
        Thread.sleep(4000);
        loggingOut.clickLogoutButton();
        loggingOut.acceptAlert();
        takeScreenshots.takeSnapShot(driver, "AfterLogout");


    }

    @Test
    public void invalidLoginTest() throws InterruptedException {
        homepage.clickLoginButton();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("12345");
        loginPage.clickLoginSubmitButton();
        takeScreenshots.takeSnapShot(driver, "InvalidLogin");
        landingPage.verifyLoginSuccess();
    }


    //ToDo: Add logOut functionality test


}
