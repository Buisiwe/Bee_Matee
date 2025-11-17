package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

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


    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyPreviewHeading() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(previewHeading_id));
        previewHeading_id.isDisplayed();
    }

    public void selectShippingMethod(String deviceMethod) {
        shippingMethod_id.click();
    }

    public void selectWarranty(String deviceWarranty) {
        warranty_id.sendKeys(deviceWarranty);
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Check for invalid discount error message
        try {

            WebElement errorMsg = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("discount-error-msg"))
            );

            String errorText = errorMsg.getText();
            System.out.println("❌ Invalid discount code message displayed: " + errorText);

            // Optional: assert the error text for tests
            if (!errorText.contains("Invalid") && !errorText.contains("not valid")) {
                System.out.println("⚠ Unexpected error message: " + errorText);
            }

        } catch (TimeoutException e) {
            System.out.println("✔ No error message shown. Discount may be valid.");
        }

    }

    public void clickApplyButton() {
        WebElement applyButton = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("apply-discount-btn")));

        // Scroll so the button is fully visible
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", applyButton);

        // Small pause to allow any repositioning
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        applyButton.click();
        // Click the Apply button
        applyButton_id.click();
    }

    public void clickAddToCardButton() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", addToCard_id);
        addToCard_id.click();
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0, 500);");
    }


}
