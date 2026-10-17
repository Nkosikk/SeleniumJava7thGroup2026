package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LearningMaterialsPage {

    WebDriver driver;

    @FindBy(id = "tab-btn-web") WebElement webAutomationAdvanceTab;

    @FindBy(id = "deviceType") WebElement deviceType;

    @FindBy(id = "brand") WebElement brand;

    @FindBy(id = "storage-128GB")WebElement storage128GB;

    @FindBy(id = "color") WebElement color;

    @FindBy(id = "quantity") WebElement quantity;

    @FindBy(id = "address")WebElement address;

    @FindBy(id = "inventory-next-btn") WebElement inventory_next_btn;

    @FindBy(id = "shipping-express") WebElement shipping_express;

    @FindBy(id = "warranty-1yr")WebElement warranty_1yr;

    @FindBy(id = "discount-code")WebElement discount_code;

    @FindBy(id = "apply-discount-btn")WebElement apply_discount_btn;

    @FindBy(id = "purchase-device-btn")WebElement purchase_device_btn;

    @FindBy(id = "view-history-btn") WebElement view_history_btn;


    public LearningMaterialsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickWebAutomationAdvanceTab(){
        webAutomationAdvanceTab.click();
    }

    public void selectDeviceType(String pickedDevice){
        new Select(deviceType).selectByVisibleText(pickedDevice);
    }

    public void selectBrand(String pickedBrand){
        new Select(brand).selectByVisibleText(pickedBrand);
    }

    public void selectStorage(){
        storage128GB.click();
    }

    public void chooseColor(String chosenColor){
        new Select(color).selectByVisibleText(chosenColor);
    }

    public void enterQuantity(String number){
        quantity.sendKeys(number);
    }

    public void enterAddress(String typedAddress){
        address.sendKeys(typedAddress);
    }

    public void clickNextButton(){
        inventory_next_btn.click();
    }

    public void selectShipping(){
        shipping_express.click();
    }

    public void selectWarranty(){
        warranty_1yr.click();
    }

    public void enterDiscountCode(String code){
        discount_code.sendKeys(code);
    }

    public void clickAppyDiscountButton(){
        apply_discount_btn.click();
    }

    public void confirmPurchase(){
        purchase_device_btn.click();
    }

    public void viewInvoice(){
        view_history_btn.click();
    }

}
