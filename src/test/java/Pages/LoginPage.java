package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {
    WebDriver driver;
    @FindBy(id = "login-email")
    WebElement loginEmail_id;
    @FindBy(id = "login-password")
    WebElement loginPassword_id;
    @FindBy(id = "login-submit")
    WebElement loginSubmit_id;
    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvance_id;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public boolean isValidEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }

        // Basic regex pattern for standard email formats
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        return email.matches(emailRegex);
    }

    public void enterLoginEmail(String email) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(loginEmail_id));
        loginEmail_id.sendKeys(email);

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(loginEmail_id));

        // Clear and enter the email
        loginEmail_id.clear();
        loginEmail_id.sendKeys(email);


        // Validate email format after entering
        if (!isValidEmail(email)) {
            System.out.println("❌ Invalid email format entered: " + email);
        } else {
            System.out.println("✅ Valid email entered: " + email);
        }
    }


    //public void enterLoginInvalidEmail(String email) {
    // Wait for the email field to be visible
    //}


    public boolean isValidPassword(String password) {
        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        // Basic regex pattern for standard email formats
        String passwordRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        return password.matches(passwordRegex);
    }

    public void enterPasswordId(String password) {
        loginPassword_id.sendKeys(password);

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(loginPassword_id));

        // Clear and enter the email
        loginPassword_id.clear();
        loginPassword_id.sendKeys(password);


        // Validate email format after entering
        if (!isValidPassword(password)) {
            System.out.println("❌ Invalid password format entered: " + password);
        } else {
            System.out.println("✅ Valid password entered: " + password);
        }
    }

    public void clickLogin() {
        loginSubmit_id.click();
    }

    //method
    public void webAutomationAdvance() {
        webAutomationAdvance_id.click();

    }
}
