package tests;

import org.testng.annotations.Test;

public class LoginTests extends Base {

    /*@Test
    public void clickLoginButton() throws InterruptedException {
        homepage.clickLoginButton();
    }

    //@Test
    //public void enterUsernameTests() {
        //loginPage.enterUsername("playtest@gmail.com");
    }*/
    @Test
    public void VerifyLogin() {
        homepage.clickLoginButton();
        loginPage.enterUsername("playtest@gmail.com");
        loginPage.enterPassword("@12345678");
        loginPage.clickLoginSubmitButton();


    }


    //ToDo: Add password and submit button tests


}
