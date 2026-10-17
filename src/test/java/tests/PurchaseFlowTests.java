package tests;

import org.testng.annotations.Test;

public class PurchaseFlowTests extends Base {

    @Test
    public void testPurchaseFlow() throws InterruptedException {

            homepage.clickLoginButton();
            loginPage.loginAs();
            Thread.sleep(1500);
            landingPage.clickLearnTab();
            Thread.sleep(1200);
            landingPage.selectLearningMaterials();

    }
}
