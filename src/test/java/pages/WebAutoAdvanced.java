package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Author: Martin Itope
 * Email: martyitope@gmail.com
 * Date: 19/10/2026
 */
public class WebAutoAdvanced {

    WebDriver driver;

    @FindBy(xpath = "//option[@value='phone']")
    WebElement selectDeviceType;

    @FindBy(xpath = "//option[@value='apple']")
    WebElement selectApple;

    @FindBy(id = "storage-128GB")
    WebElement storage;

    @FindBy(xpath = "//option[@value='blue']")
    WebElement colorBlue;

    @FindBy(id = "quantity")
    WebElement quantity;

    @FindBy(id = "address")
    WebElement address;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton;

    @FindBy(id = "shipping-option-express")
    WebElement expressOption;

    @FindBy(id = "warranty-option-1yr")
    WebElement warranty;

    @FindBy(id = "discount-code")
    WebElement dicountCode;

    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchase;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoice;

    @FindBy(xpath = "//button[contains(@id,'view-invoice')]")
    WebElement viewINV;


    public void setDeviceType() {
//       Select killing me
//        Select select = new Select(selectDeviceType);
//       selectDeviceType.getAccessibleName();

        selectDeviceType.click();
    }

    public void selectBrand(){
        selectApple.click();
    }

       public void selectStorage() {
           storage.click();
       }

       public void selectColor(){
           colorBlue.click();
       }

        public void setQuantity(){
            quantity.sendKeys();
        }

        public void typeAddress(){
            address.sendKeys();
        }

        public void clickNextButtont(){
            nextButton.click();
        }

        public void selectExpress(){
            expressOption.click();
        }


        public void setWarranty(){
            warranty.click();
        }

        public void enterDiscountCode(){
            dicountCode.click();
        }

        public void clickConfirm(){
            confirmPurchase.click();
        }

        public void clickInvoice(){
            viewInvoice.click();
        }

        public void openInvoice(){
        viewINV.click();
    }


}
