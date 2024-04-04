import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest extends Base{

    Homepage homepage;


    @BeforeMethod
    void starting(){
        openBrowser("https://ebay.com");
        homepage = PageFactory.initElements(Base.driver,Homepage.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //implicit wait

    }

    //close the browser

    @AfterMethod
    void finishTest(){
        closeBrowser();
    }


    // test the fashion bar

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the Fashion under the search bar
    //Expected Result: It will go to the Clothing, Shoes & Accessories page

    @Test
    void testFashion(){
        String expectedUrl = "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545";
        homepage.clickFashion();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    //test the women's clothing under the fashion bar

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Hover the mouse over the Fashion
    //Step 4: Select Women's Clothing
    //Expected Result: It will go to the Women's Clothing page and show all types of women clothing

    @Test
    void testWomenClothing(){
        homepage.moveToFashion();
        homepage.clickwomenClothing();
        String expectedUrl = "https://www.ebay.com/b/Womens-Clothing/15724/bn_661783";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    // test the search bar ()
    // search iphone using sendKeys

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the search bar
    //Step 4: Type iphone
    //Step 5: Click enter
    //Expected Result: It will show all types of iphone.

    @Test
    void testSearch(){
        homepage.search();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("iphone"));
    }


    // about eBay

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Go to the bottom of the homepage
    //Expected Result: User will see the About eBay option under the page.

    @Test
    void testAbout(){
        String expectedText = "About eBay";
        String actualText = homepage.textAbout();
        Assert.assertEquals(actualText, expectedText);

    }

    // test the electronics bar

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the Electronics under the search bar
    //Expected Result: It will go to the Electronics page and show all types of electronic gadget.

    @Test
    void testElectronics(){
        homepage.clickElectronics();
        String expectedUrl = "https://www.ebay.com/b/Electronics/bn_7000259124";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    // test the computer bar

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the Electronics under the search bar
    //Step 4: Click to the Computers, Tablets & Network Hardware under the Shop by Category
    //Expected Result: It will go to the Computers, Tablets & Network Hardware page and show all types of products

    @Test
    void testComputers(){
        homepage.clickElectronics();
        homepage.clickComputers();
        String expectedUrl = "https://www.ebay.com/b/Computers-Tablets-Network-Hardware/58058/bn_1865247";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    // test the shop by category option

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the Shop by category option beside the ebay logo
    //Expected Result: User will be able to successfully click it and it will show all the category.

    @Test
    void testshopByCategory(){
        homepage.clickshopByCategory();
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    // test the (dropdown) all category option beside the search bar

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the All Categories option beside the search bar
    //Step 4: Select Art
    //Expected Result: User will be able to successfully select Art from all categories

    @Test
    void testAllCategory(){
        homepage.allCategory();
        String expectedUrl = "https://cart.ebay.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the ebay logo left side of the homepage
    //Expected Result: User will be able to see the logo and if clicked it then the expected url will be https://www.ebay.com/

    @Test
    void testEbayLogo(){
        homepage.clickLogo();
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    // test  daily deals option top of the homepage

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the Daily Deals  top of the homepage
    //Expected Result: User will be able to see all the deals.

    @Test
    void testDailyDeals(){
        homepage.clickDailyDeals();
        String expectedUrl = "https://www.ebay.com/deals";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    // test  sell-> how to sell option bottom the homepage

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Go to bottom of the homepage
    //Step 4: Select How to sell from the Sell option
    //Expected Result: It will go to a new page and show all the sell information.

    @Test
    void testStartSelling(){
        homepage.clickStartSelling();
        String expectedUrl = "https://www.ebay.com/sellercenter/selling/how-to-sell";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    // test  sell-> how to sell--> selling -->What to sell  option top of the homepage

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Go to bottom of the homepage
    //Step 4: Select How to sell from the Sell option
    //Step 4: Hover the mouse over the Selling then select What to sell
    //Expected Result: It will go to a new page and show what the user can sell.

    @Test
    void testSellNow(){
        homepage.clickStartSelling();
        homepage.clickSellNow();
        String expectedUrl = "https://www.ebay.com/sellercenter/selling/what-to-sell";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }









}
