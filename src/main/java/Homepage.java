import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Homepage extends Base{

    @FindBy(xpath = "//li[@data-currenttabindex=\"4\"]")
    WebElement fashion;


    @FindBy(xpath = "//a[@_sp=\"p4375194.m1383.l3251\"]")
    WebElement womenClothing;


    @FindBy(xpath = "//input[@placeholder=\"Search for anything\"]")
    WebElement searchBox;


    @FindBy(css = "[_sp=\"m571.l2932\"]")
    WebElement aboutEbay;

    @FindBy(xpath = "//a[@_sp=\"p4375194.m1380.l3250\"]")
    WebElement electronics;

    @FindBy(xpath = "//div[@class=\"b-visualnav__title\"]")
    WebElement computers;

    @FindBy(xpath = "//div[@class=\"gh-control\"]")
    WebElement shopByCategory;

    @FindBy(xpath = "//select[@id=\"gh-cat\"]")
    WebElement allCategory;

    @FindBy(css = "[_sp=\"m570.l2586\"]")
    WebElement logo;

    @FindBy(css = "[_sp=\"m570.l3188\"]")
    WebElement dailyDeals;


    //Relative Xpath
    @FindBy(xpath = "//div[@class=\"gffoot\"]/table/tbody/tr/td[2]/ul/li[2]/a")
    WebElement startSelling;


    //Relative Xpath
    @FindBy(xpath = "//div[@class=\"cta-list\"]/a")
    WebElement sellNow;



    void clickFashion(){
        fashion.click();
    }


// action class
    void moveToFashion(){
        Actions actions = new Actions(driver);
        actions.moveToElement(fashion);

    }

    // search women's clothing by click
    void clickwomenClothing(){
        womenClothing.click();

    }

    // search iphone using sendKeys
    void search(){
        waitForElement(10, searchBox);
        searchBox.sendKeys("iphone", Keys.ENTER);
    }


    //to get the about ebay text
    String textAbout(){
        return aboutEbay.getText();

    }

    void clickElectronics(){
        electronics.click();
    }

    /*void moveToElectronics(){
        Actions actions = new Actions(driver);
        actions.moveToElement(electronics);
    }*/

    void clickComputers(){
        computers.click();
    }

    void clickshopByCategory(){
        shopByCategory.click();
    }

   // select class to handel the drop-down menu
    void allCategory(){
        Select select = new Select(allCategory);
        select.selectByVisibleText("Art");
    }

    // check the ebay logo
    void clickLogo(){
        logo.click();
    }

    // check the daily deals option
    void clickDailyDeals(){
        dailyDeals.click();
    }

    void clickStartSelling(){
        startSelling.click();
    }

    // test  sell-> how to sell--> selling -->What to sell  option top of the homepage
    void clickSellNow(){
        sellNow.click();
    }








}
