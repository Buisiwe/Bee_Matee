package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;

public class TakeScreenshots {
    private static final String screenshotDir = System.getProperty("user,dir") + "/Screenshots";

    public  void takesSnapShot(WebDriver driver, String screenShotName){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination =new File(screenshotDir, screenShotName + ".jpeg");

        /*try{
            Fil
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
