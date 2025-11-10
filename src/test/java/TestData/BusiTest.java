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

public class BusiTest extends Base {
    @Test
    public void verifyHomePageIsDisplayedTests() {
        homePage.VerifyHomePageDisplay();
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayedTests")
    public void clickLearningMaterialTests() {
        homePage.learningMaterial();
    }

    @Test(dependsOnMethods = "clickLearningMaterialTests")
    public void enterLoginEmail() throws InterruptedException{
        loginPage.enterLoginEmail("Busi27@gmail.com");
        Thread.sleep(4000);
    }

    //@Test(dependsOnMethods = "clickLearningMaterialTests")
    /*public void enterLoginInvalidEmail() throws InterruptedException{
        loginPage.enterLoginInvalidEmail("Busi27@gmail.comm");
        Thread.sleep(2000);
    }*/

    @Test(dependsOnMethods = "enterLoginEmail")
    public void enterPasswordTests() throws InterruptedException{
        loginPage.enterPasswordId("Busi271302");
        Thread.sleep(4000);
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
    public void verifyWebAutomationAdvancePageIsDisplayedTest() {
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

    @Test(dependsOnMethods = "selectDeviceBrandTest")
    public void clickDeviceStorageTest() throws InterruptedException {
        webAutomationAdvancePage.clickDeviceStorage();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "clickDeviceStorageTest")
    public void selectDeviceColourTest() throws InterruptedException {
        webAutomationAdvancePage.clickDeviceColour("blue");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceColourTest")
    public void selectDeviceQuantityTest() throws InterruptedException {
        webAutomationAdvancePage.clickDeviceQuantity(2);

    }

    @Test(dependsOnMethods = "selectDeviceQuantityTest")
    public void enterDeviceAddressTest() throws InterruptedException {
        webAutomationAdvancePage.enterDeliveryAddress("27 Henry Dyter");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "enterDeviceAddressTest")
    public void clickNextButtonTest() {
        webAutomationAdvancePage.clickNextButtonSubmitForm();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
