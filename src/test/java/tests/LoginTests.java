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
        homepage.clickLoginButton();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("1234567!");
        loginPage.clickLoginSubmitButton();
        Thread.sleep(4000);
        landingPage.verifyLoginSuccess();

    }

    @Test
    public void invalidLoginTest() throws InterruptedException {
        homepage.clickLoginButton();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("12345");
        loginPage.clickLoginSubmitButton();
        landingPage.verifyLoginSuccess();
    }


    //ToDo: Add logOut functionality test


}
