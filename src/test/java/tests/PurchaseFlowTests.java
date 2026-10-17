package tests;

import org.testng.annotations.Test;

public class PurchaseFlowTests extends Base {

    @Test
    public void testNavigateToLearningMaterials() throws InterruptedException {

        homepage.clickLoginButton();
        loginPage.loginAs();
        Thread.sleep(1500);
        landingPage.clickLearnTab();
        Thread.sleep(1200);
        landingPage.selectLearningMaterials();
    }

    @Test(dependsOnMethods = {"testNavigateToLearningMaterials"})
    public void testDevicePurchase() throws InterruptedException {
        learningMaterialsPage.clickWebAutomationAdvanceTab();
        learningMaterialsPage.selectDeviceType("Phone");
        learningMaterialsPage.selectBrand("Apple");
        learningMaterialsPage.selectStorage();
        learningMaterialsPage.chooseColor("Blue");
        learningMaterialsPage.enterQuantity("2");
        learningMaterialsPage.enterAddress("Selenium street");
        learningMaterialsPage.clickNextButton();
        Thread.sleep(1200);
        learningMaterialsPage.selectShipping();
        learningMaterialsPage.selectWarranty();
        learningMaterialsPage.enterDiscountCode("SAVE10 ");
        learningMaterialsPage.clickAppyDiscountButton();
        Thread.sleep(1200);
        learningMaterialsPage.confirmPurchase();
        Thread.sleep(3500);
        learningMaterialsPage.viewInvoice();
    }


}
