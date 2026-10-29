package tests;

import org.testng.annotations.Test;
import pages.WebAutoAdvanced;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 19/10/2026
 */
public class WebAutomationAdvanceTest extends Base {

    @Test
    public void enterUsernameTests() {
        loginPage.enterUsername("itopeprinting@gmail.com");
        loginPage.enterPassword("Password@123");
        loginPage.clickLoginSubmitButton();
    }

    @Test
    public void landingPage(){
        learnPage.clickWebAutoAdvance();
    }

    @Test
    public void AdvancedPage(){

        WebAutoAdvanced.
    }


}
