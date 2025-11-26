package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;
    @FindBy(id = "nav-btn-practice")
    WebElement learningMaterial_id;
    @FindBy(id = "signup-toggle")
    WebElement signUp_id;
    @FindBy(id = "register-firstName") WebElement firstName_id;
    @FindBy(id = "register-lastName") WebElement lastName_id;
    @FindBy(id = "register-email") WebElement registerEmail_id;
    @FindBy(id = "register-password") WebElement registerPassword_id;
    @FindBy(id = "register-confirmPassword") WebElement confirmPassword_id;
    @FindBy(id = "register-submit") WebElement createAccountButton_id;
    @FindBy(id = "login-toggle")
    WebElement loginToggle_id;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }
    public void learningMaterial() {
        learningMaterial_id.click();signUp_id.click();
    }


    public void enterFirstName(String firstName){
        firstName_id.sendKeys(firstName); System.out.println(firstName);
    }

    public void enterLastName(String lastName){
        lastName_id.sendKeys(lastName); System.out.println(lastName);
    }
    public void enterRegisterEmail(String registerEmail){
        registerEmail_id.sendKeys(registerEmail); System.out.println(registerEmail);
    }
    public void enterRegisterPassword(String registerPass){
        registerPassword_id.sendKeys(registerPass); System.out.println(registerPass);
    }
    public void enterConfirmPassword(String confirmPass){
        confirmPassword_id.sendKeys(confirmPass); System.out.println(confirmPass);
    }
    public void clickCreateAccountButton(){
        createAccountButton_id.click();System.out.println("Clicked Create Account Button");
    }
    public void goToLoginPage() {
        loginToggle_id.click();
        System.out.println("Navigated to Login Page");
    }
}
