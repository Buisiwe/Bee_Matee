package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginToLearningMaterial {

    WebDriver driver;

    @BeforeTest
    public void launchBrowser() {
        driver = new ChromeDriver();
    }

    @Test
    public void startBrowser() throws InterruptedException {
        // driver = new ChromeDriver();
        driver.get("https://www.ndosiautomation.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void verifyHomePageIsDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"overview-hero\"]/h2")).isDisplayed();
    }

    @Test(priority = 2)
    public void clickLearningMaterials() throws InterruptedException {
        driver.findElement(By.id("nav-btn-practice")).click();
        Thread.sleep(2000);
    }


    @Test(priority = 3)
    public void enterEmail() {
        driver.findElement(By.id("login-email")).sendKeys("Busi27@gmail.com");
    }

    @Test(priority = 4)
    public void enterPassword() {
        driver.findElement(By.id("login-password")).sendKeys("Busi271302");
    }

    @Test(priority = 5)
    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 6)
    public void clickBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        //driver.findElement(By.id("overview-hero")).click();
        Thread.sleep(2000);
    }

    @Test(priority = 7)
    public void enterFullName() {
        driver.findElement(By.id("name")).sendKeys("Buisiwe Matee");
    }

    @Test(priority = 8)
    public void enterEmailAddress() {
        driver.findElement(By.id("email")).sendKeys("Busi27@gmail.com");
    }

    @Test(priority = 9)
    public void selectAge() {
        driver.findElement(By.id("age")).sendKeys("18");
    }

    @Test(priority = 10)
    public void selectGender() {
        driver.findElement(By.id("gender")).sendKeys("Female");
    }

    @Test(priority = 11)
    public void selectCountry() {
        driver.findElement(By.id("country")).sendKeys("South Africa");
    }

    @Test(priority = 12)
    public void selectExperienceLevel() throws InterruptedException {
        driver.findElement(By.id("experience")).sendKeys("Beginner (0-2 years)");
        Thread.sleep(1000);
    }

    @Test(priority = 13)
    public void clickSkills() {
        driver.findElement(By.id("skill-javascript")).click();
    }

    @Test(priority = 14)
    public void enterComments() {
        driver.findElement(By.id("comments")).sendKeys("Benginner' Luck!");
    }

    @Test(priority = 15)
    public void clickTsAndCs() throws InterruptedException {
        driver.findElement(By.id("terms")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 16)
    public void clickSubmitForm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(3000);
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();

    }
}
