import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Base {


    static WebDriver driver;

    //invoke the browser
    void openBrowser(String url){
        driver = new ChromeDriver();
        driver.get(url);
    }
// to handel the windows
    void switchWindow(){
        String currentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String a : windows){
            if (currentWindow != a){
                driver.switchTo().window(a);
            }

        }
        System.out.println(driver.getCurrentUrl());

    }

    //close the browser
    void closeBrowser(){
        driver.quit();
    }

    //Explicit wait for element visibility
    void waitForElement(int time, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Explicit wait for element clickable
    void waitForElementClickable(int time, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
