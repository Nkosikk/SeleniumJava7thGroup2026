package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends Base {

    @Test
    public void clickLoginButton() throws InterruptedException {
        homepage.clickLoginButton();
        loginPage.enterUsername("itopeprinting@gmail.com");
        loginPage.enterPassword("Password@123");
        loginPage.clickLoginSubmitButton();
    }

//    @Test (dependsOnMethods = "clickLoginButton")
//    public void enterUsernameTests() {
//        loginPage.enterUsername("itopeprinting@gmail.com");
//    }
//    @Test (dependsOnMethods = "enterUsernameTests")
//    public void enterUsername(){
//        loginPage.enterPassword("Password@123");
//    }
//    @Test (dependsOnMethods = "enterUsername")
//    public void clickLoginSubmit(){
//        loginPage.clickLoginSubmitButton();
//    }

    //ToDo: Add password and submit button tests - Completed by Martin Now


}
