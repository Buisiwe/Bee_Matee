package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//class
public class HomePage {
    //declaration of elements
    WebDriver driver;
    @FindBy(id = "overview-hero")
    WebElement homepageTitle_id;
    @FindBy(id = "nav-btn-practice")
    WebElement learningMaterial_id;


    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //method
    public void VerifyHomePageDisplay() {
        homepageTitle_id.isDisplayed();
    }

    //method
    public void learningMaterial() {
        learningMaterial_id.click();
    }

}

