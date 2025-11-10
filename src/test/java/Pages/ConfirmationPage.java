package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ConfirmationPage {
    WebDriver driver;
    @FindBy(id = "preview-section-title")
    WebElement previewHeading_id;

    @FindBy(id = "shipping-option-express")
    WebElement shippingMethod_id;

    @FindBy(id = "warranty-option-2yr")
    WebElement warranty_id;

    @FindBy(id = "C")
    WebElement discount_id;

    @FindBy(id = "apply-discount-btn")
    WebElement applyButton_id;

    @FindBy(id = "add-to-cart-btn")
    WebElement addToCard_id;

    public ConfirmationPage (WebDriver driver) {this.driver = driver;}

    public void verifyPreviewHeading(){new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(previewHeading_id));previewHeading_id.isDisplayed();}

    public void selectShippingMethod(String deviceMethod) {
        shippingMethod_id.sendKeys(deviceMethod);
    }

    public void selectWarranty(String deviceWarranty) {
        warranty_id.sendKeys(deviceWarranty);
    }

    public void enterDiscount(String deviceDiscount) {
        discount_id.sendKeys(deviceDiscount);
    }

    public void clickApplyButton() {
        discount_id.click();
    }

    public void clickAddToCardButton() {
        discount_id.click();
    }

}
