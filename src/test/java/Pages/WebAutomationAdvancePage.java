package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class WebAutomationAdvancePage {
    WebDriver driver;

    @FindBy(id = "inventory-title")
    WebElement inventoryHeader_id;

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

    public WebAutomationAdvancePage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyInventoryHeaderIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(inventoryHeader_id));
        inventoryHeader_id.isDisplayed();
    }

    public void selectDeviceType(String deviceType) {
        deviceTypeDropDown_id.sendKeys(deviceType);
    }

    public void selectTabletBrand(String deviceBrand) {
        tabletBrand_id.sendKeys(deviceBrand);
    }

    public void clickDeviceStorage() {
        deviceStorage_id.click();
    }

    public void clickDeviceColour(String deviceColour) {
        deviceColour_id.sendKeys(deviceColour);
    }

    public void clickDeviceQuantity(int deviceQuantity)  throws InterruptedException{
        deviceQuantity_id.clear();

       /* if (deviceQuantity <= 10) {
            String num = String.valueOf(deviceQuantity);
            deviceQuantity_id.sendKeys(num);
        }*/
        Thread.sleep(4000);
        if (deviceQuantity > 0 && deviceQuantity <= 10) {
            String num = String.valueOf(deviceQuantity);
            deviceQuantity_id.sendKeys(num);
        }
    }

    public void enterDeliveryAddress(String deviceAddress) {
        deliveryAddress_id.sendKeys(deviceAddress);
    }

    public void clickNextButtonSubmitForm() {
        nextButton_id.click();
    }
}
