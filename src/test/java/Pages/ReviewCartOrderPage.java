package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewCartOrderPage {
    WebDriver driver;

    @FindBy(id = "review-cart-btn")
    WebElement reviewCart_id;

    @FindBy(id = "cart-item-increase-1763056761556.3975") WebElement numberOfItems_id;

    public void reviewCartButton(int itemQuantity) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", numberOfItems_id);
        Thread.sleep(2000);
        // Validate input range
        if (itemQuantity > 0 && itemQuantity <= 10) {
            numberOfItems_id.clear(); // Clear old value
            numberOfItems_id.sendKeys(String.valueOf(itemQuantity));
            js.executeScript("arguments[0].scrollIntoView(true);", reviewCart_id);
            reviewCart_id.click();
        } else {
            System.out.println("❌ Invalid item quantity: " + itemQuantity + ". Must be between 1 and 10.");
        }
    }
}
