package tests;

import org.testng.annotations.Test;

public class LoginTests extends Base {

  /*  @Test
    public void clickLoginButton() throws InterruptedException {
        homepage.clickLoginButton();
    }

    @Test
    public void enterUsernameTests() {
        loginPage.enterUsername("playtest@gmail.com");
    }*/
    @Test
    public void VerifyLoginFunctionality() throws InterruptedException {
        homepage.clickLoginButton();
        Thread.sleep(5000);
        loginPage.enterUsername("nana2017@gmail.com");
        loginPage.enterPassword("Nana@123");
        loginPage.clickLoginSubmitButton();
    }
}


