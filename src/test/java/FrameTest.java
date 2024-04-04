import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest extends Base{
    FramePage framePage;

    @BeforeMethod
    void starting(){
        openBrowser("https://www.google.com/");
        framePage = PageFactory.initElements(driver, FramePage.class);
        //driver.switchTo().frame("callout");
    }

    @AfterMethod
    void close(){
        closeBrowser();
    }

    //Step 1: Open Google Chrome browser using the following link https://www.google.com/
    //Step 2: Click to the Stay signed out
    //Expected Result: When user will click to the stay signed out the page will be gone.

    @Test
    void testSignOut(){
        driver.switchTo().frame("callout"); // go to specific frame
        driver.switchTo().defaultContent();// come back to regular webpage


    }
}
