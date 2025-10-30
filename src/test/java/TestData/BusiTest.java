package TestData;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class BusiTest extends  Base {
    @Test public void verifyHomePageIsDisplayedTests(){
        homePage.VerifyHomePageDisplay();
    }
    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.learningMaterial();
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void enterLoginEmail(){
        loginPage.enterLoginEmail("Busi27@gmail.com");
    }

    @Test(dependsOnMethods = "enterLoginEmail")
    public void enterPasswordTests() {
        loginPage.enterPasswordId("Busi271302");
    }

    @Test(dependsOnMethods = "enterPasswordTests")
    public void clickLoginTests() {
        loginPage.clickLogin();
    }

    @Test(dependsOnMethods = "clickLoginTests")
    public void verifyWelcomeHeading() {
        learningMaterialPage.verifyHeading();
    }

    @Test(dependsOnMethods = "verifyWelcomeHeading")
    public void clickWebAutomationAdvanceTab() throws InterruptedException {
        learningMaterialPage.clickWebAutomationAdvanceTab();
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "clickWebAutomationAdvanceTab")
    public void verifyWebAutomationAdvancePageIsDisplayedTest(){
        webAutomationAdvancePage.verifyInventoryHeaderIsDisplayed();
    }

    @Test(dependsOnMethods = "verifyWebAutomationAdvancePageIsDisplayedTest")
    public void selectDeviceTypeTest() throws InterruptedException {
        webAutomationAdvancePage.selectDeviceType("Tablet");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceTypeTest")
    public void selectDeviceBrandTest() throws InterruptedException {
        webAutomationAdvancePage.selectTabletBrand("Samsung");
        Thread.sleep(4000);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}
