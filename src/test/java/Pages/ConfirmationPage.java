package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ConfirmationPage {
    WebDriver driver;
    @FindBy(id = "preview-section-title")
    WebElement previewHeading_id;

    @FindBy(id = "shipping-express")
    WebElement shippingMethod_id;

    @FindBy(id = "warranty-option-2yr")
    WebElement warranty_id;

    @FindBy(id = "discount-code")
    WebElement discount_id;

    @FindBy(id = "apply-discount-btn")
    WebElement applyButton_id;

    @FindBy(id = "add-to-cart-btn")
    WebElement addToCard_id;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropDown_id;

    @FindBy(id = "brand")
    WebElement tabletBrand_id;

    @FindBy(id = "storage-64GB")
    WebElement deviceStorage_id;

    @FindBy(id = "color")
    WebElement deviceColour_id;

    @FindBy(id = "quantity")
    WebElement deviceQuantity_id;

    @FindBy(id = "address")
    WebElement deliveryAddress_id;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyPreviewHeading() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(previewHeading_id));
        previewHeading_id.isDisplayed();
    }

    public void selectShippingMethod(String deviceMethod) {
        shippingMethod_id.click();System.out.println(deviceMethod);
    }

    public void selectWarranty(String deviceWarranty) {
        warranty_id.sendKeys(deviceWarranty);System.out.println(deviceWarranty);
    }

    public void enterDiscount(String deviceDiscount) {

        // Wait for the discount input field to be visible
        WebElement discountField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("discount-code")));

        // Scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", discountField);

        // Clear any existing value and enter the new discount
        discountField.clear();
        discountField.sendKeys(deviceDiscount);

        // Log the discount value for tracking
        System.out.println("✅ Entered discount code: " + deviceDiscount);
    }

   public void clickApplyButton() {
       WebElement applyButton = new WebDriverWait(driver, Duration.ofSeconds(10))
               .until(ExpectedConditions.elementToBeClickable(By.id("apply-discount-btn")));

       // Scroll so the button is fully visible
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", applyButton);

       // Small pause to allow any animation or repositioning
       try {
           Thread.sleep(500);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       applyButton.click();
       // Click the Apply button
       applyButton_id.click();
    }

    public void selectDeviceTypeTwo(String deviceType) {
        deviceTypeDropDown_id.sendKeys(deviceType)
        ;
    }

    public void selectTabletBrandTwo(String deviceBrand) {
        tabletBrand_id.sendKeys(deviceBrand); System.out.println(deviceBrand);
    }

    public void clickDeviceStorageTwo() {
        deviceStorage_id.click();System.out.println(deviceStorage_id);
    }

    public void clickDeviceColourTwo(String deviceColour) {
        deviceColour_id.sendKeys(deviceColour); System.out.println(deviceColour);
    }

    public void clickDeviceQuantityTwo(int deviceQuantity)  throws InterruptedException{
        deviceQuantity_id.clear();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", deviceQuantity_id);
        Thread.sleep(4000);
        if (deviceQuantity > 0 && deviceQuantity <= 10) {
            String num = String.valueOf(deviceQuantity);
            deviceQuantity_id.sendKeys(num);
        }
        System.out.println(deviceQuantity);
    }

    public void enterDeliveryAddressTwo(String deviceAddress) {
        deliveryAddress_id.sendKeys(deviceAddress); System.out.println(deviceAddress);
    }

    public void clickNextButtonSubmitFormTwo() {
        nextButton_id.click();
    }


    public void clickAddToCardButton() throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", addToCard_id);
        addToCard_id.click();
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0, 500);");
    }



}
