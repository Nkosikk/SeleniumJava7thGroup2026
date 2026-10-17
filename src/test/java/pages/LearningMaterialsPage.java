package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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




}
