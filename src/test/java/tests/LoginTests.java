package tests;

import org.testng.annotations.Test;

public class LoginTests extends Base {

    @Test
    public void VerifyLoginFunctionality() throws InterruptedException {
        homepage.clickLoginButton();
        Thread.sleep(5000);
        loginPage.enterUsername("nana2017@gmail.com");
        loginPage.enterPassword("Nana@123");
        loginPage.clickLoginSubmitButton();
        Thread.sleep(5000);
        landingPage.verifyLoginSuccess("Welcome to Ndosis");
    }
}


