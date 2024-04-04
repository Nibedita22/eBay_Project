import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class WindowTest extends Base{
    WindowPage windowPage;


    @BeforeMethod
    void starting(){
        openBrowser("https://www.ebay.com/b/Small-Kitchen-Appliances/20667/bn_2311275");
        windowPage = PageFactory.initElements(Base.driver,WindowPage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait

    }

    //close the browser

    @AfterMethod
    void finishTest(){
        closeBrowser();
    }

    //Step 1: Open google chrome browser
    //Step 2: Go to this link https://www.ebay.com/b/Small-Kitchen-Appliances/20667/bn_2311275
    //Step 3: Select The Water Machine ® water purifier World's first all-glass gravity water filter.
    //Expected Result: The selected item will be open into a new windows.

    @Test
    void testWindow(){
        windowPage.openWindow();
        String expectedUrl = "https://www.ebay.com/itm/145094465671?itmmeta=01HTG534B51GV37HN5PB3WEE04&hash=item21c84dd887:g:jOQAAOSworJjeodT&amdata=enc%3AAQAJAAAA0K1XMQkARHiNZTYx29bHf6woeGEhA7oqyCIJaD0Ipf6loCsi40OB09THY%2FrLschUDRyu5aEwdKR9bfCAr1ilMn2QYAaz2aegD9YoxuWJU5vtWgIpxylj5fzvlVXLZDgIBIyRNUHgZLOMIgGjJ9lHauOSOPU6HtL94gEw772kCg14keE9QEiJFm40Ig9ixbBfm0gi--KPBtC6xbICEIy9iAcxcaMEOMxbLaWw11mzvN%2FHtZ4J93AWI8Ta1a3l3MVvI6xhGkdPBKQKsXvpjK%2Bs5bY%3D%7Ctkp%3ABFBM7MWMhdRj";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);


    }
}
