package tests;

import org.testng.annotations.Test;

public class LoginTests extends Base {

    @Test
    public void clickLoginButton() throws InterruptedException {
        homepage.clickLoginButton();
    }

    @Test
    public void enterUsernameTests() {
        loginPage.enterUsername("itopeprinting@gmail.com");
        loginPage.enterPassword("Password@123");
        loginPage.clickLoginSubmitButton();
    }

    //ToDo: Add password and submit button tests


}
