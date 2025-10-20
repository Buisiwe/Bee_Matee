package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;

    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvance_id;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //method
    public void webAutomationAdvance() {
        webAutomationAdvance_id.click();

    }
}
