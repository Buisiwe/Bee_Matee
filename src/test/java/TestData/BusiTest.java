package TestData;

import Pages.ConfirmationPage;
import Pages.WebAutomationAdvancePage;
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
    public void enterLoginEmail() throws InterruptedException {
        loginPage.enterLoginEmail("Busi27@gmail.com");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "enterLoginEmail")
    public void enterPasswordTests() throws InterruptedException {
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

    @Test(dependsOnMethods = "clickNextButtonTest")
    public void clickPreviewTitleTests() {
        confirmationPage.verifyPreviewHeading();
    }

    @Test(dependsOnMethods = "clickPreviewTitleTests")
    public void clickDeviceShippingMethodTest() throws InterruptedException {
        confirmationPage.selectShippingMethod("Express(+R25)");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "clickPreviewTitleTests")
    public void clickDeviceWarrantyTest() throws InterruptedException {
        confirmationPage.selectWarranty("2 year (+R89)");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "clickDeviceWarrantyTest")
    public void enterDiscountTest() throws InterruptedException {
        confirmationPage.enterDiscount("SAVE10");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "enterDiscountTest")
    public void clickApplyButtonTest() throws InterruptedException {
        confirmationPage.clickApplyButton();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "clickApplyButtonTest")
    public void clickAddToCardButtonTest() throws InterruptedException {
        confirmationPage.clickAddToCardButton();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "clickAddToCardButtonTest")
    public void selectDeviceTypeTestTwo() throws InterruptedException {
        confirmationPage.selectDeviceTypeTwo("Laptop");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceTypeTestTwo")
    public void selectDeviceBrandTestTwo() throws InterruptedException {
        confirmationPage.selectTabletBrandTwo("Macbook pro");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceBrandTestTwo")
    public void clickDeviceStorageTestTwo() throws InterruptedException {
        confirmationPage.clickDeviceStorageTwo();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "clickDeviceStorageTestTwo")
    public void selectDeviceColourTestTwo() throws InterruptedException {
        confirmationPage.clickDeviceColourTwo("white");
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "selectDeviceColourTestTwo")
    public void selectDeviceQuantityTestTwo() throws InterruptedException {
        confirmationPage.clickDeviceQuantityTwo(1);

    }

    @Test(dependsOnMethods = "selectDeviceQuantityTestTwo")
    public void enterDeviceAddressTestTwo() throws InterruptedException {
        confirmationPage.enterDeliveryAddressTwo("27 Henry Dyter");
        Thread.sleep(4000);
    }


    @Test(dependsOnMethods = "enterDeviceAddressTest")
    public void clickNextButtonTestTwo() {
        confirmationPage.clickNextButtonSubmitFormTwo();
    }

    @Test(dependsOnMethods = "enterDeviceAddressTestTwo")
    public void clickReviewCardButtonTest() throws InterruptedException {
        reviewCartOrderPage.reviewCartButton(2);
        Thread.sleep(4000);
    }


    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
