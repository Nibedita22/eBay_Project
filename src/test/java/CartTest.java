import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTest extends Base{

    CartPage cartPage;

    @BeforeMethod
    void starting(){
        openBrowser("https://cart.payments.ebay.com/");
        cartPage = PageFactory.initElements(driver, CartPage.class);
    }

    @AfterMethod
    void close(){
        closeBrowser();
    }


    // test case for you don't have any items in your cart.

    //Step 1: open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: click to the cart
    //Expected Result: It will show, You don't have any items in your cart.

    @Test
    void testText(){
        String expected = "You don't have any items in your cart.";
        String actual = cartPage.text();
        Assert.assertEquals(actual, expected);
    }

    //test case for start shopping button

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the cart
    //Step 4: Click to the Start Shopping button
    //Expected Result: It will go to the home page and the expected url is https://www.ebay.com/


    @Test
    void testShop(){
        cartPage.clickShop();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.ebay.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    //test case for sign in button

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the cart
    //Step 4: Click to the Sign-in button
    //Expected Result: It will go to the login page and the expected url is https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&UsingSSL=1&siteid=0&co_partnerId=2&pageType=2495737&ru=https%3A%2F%2Fcart.payments.ebay.com%2F

    @Test
    void testSignIn(){
        cartPage.clickSignIn();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&UsingSSL=1&siteid=0&co_partnerId=2&pageType=2495737&ru=https%3A%2F%2Fcart.payments.ebay.com%2F";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    //test case for advanced button beside the search button

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the Advance beside the search bar
    //Expected Result: It will go to the advance search page

    @Test
    void testAdvanced(){
        cartPage.clickAdvanced();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.ebay.com/sch/ebayadvsearch";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    //test case for search button inside the advance search button

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the Advance beside the search bar
    //Step 3: Click to the Search button under the find items
    //Expected Result: It will go to the All Category page and the expected url is https://www.ebay.com/n/all-categories

    @Test
    void testSearchItem(){
        cartPage.clickAdvanced();
        cartPage.clickSearchItem();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.ebay.com/n/all-categories";
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    //test case for send us your comments under the search bar

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the cart
    //Step 4: Click to the Send Us Your Comments option under the search bar
    //Expected Result: It will show Tell us about your experience on the eBay Shopping Cart.

    @Test
    void testComments(){
        cartPage.clickComments();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://connect.ebay.com/srv/survey/a/payments.cart.survey";
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    //test case for select the issues inside the send us your comments button under the search bar

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the cart
    //Step 4: Click to the Send Us Your Comments option under the search bar
    //Step 5: Select the issue The shopping cart is slow in adding, removing and saving items
    //Expected Result: The issue is successfully selected

    @Test
    void testIssues(){
        cartPage.clickComments();
        cartPage.clickIssues();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://connect.ebay.com/srv/survey/a/payments.cart.survey";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    // test the search bar ()
    // search iphone using sendKeys

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the search bar any type laptop
    //Step 4: Click enter
    //Expected Result: It will show all the laptops

    @Test
    void testSearch(){
        cartPage.search();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("laptop"));
    }


    // test case for sort by options in the search laptop using sendKeys from the cart page

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the search bar any type laptop
    //Step 4: Click enter
    //Step 5: Click Sort: option
    //Expected Result: It will successfully select the option

    @Test
    void testSortBy(){
        cartPage.search();
        cartPage.clicksortBy();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("laptop"));
    }


    // test case for sort by (timed: newly listed) options in the search laptop using sendKeys from the cart page

    //Step 1: Open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: Click to the search bar any type laptop
    //Step 4: Click enter
    //Step 5: Click Sort: option
    //Step 6: Select Sort:Time:newly listed
    //Expected Result: It will show the newly listed products

    @Test
    void testNewlyListed(){
        cartPage.search();
        cartPage.clicksortBy();
        cartPage.clicknewlyListed();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("laptop"));
    }

    //test case for select the issues inside the send us your comments button under the search bar
//    @Test
//    void testSend(){
//        cartPage.clickComments();
//        cartPage.clickIssues();
//        cartPage.clickSend();
//        String actualUrl = driver.getCurrentUrl();
//        String expectedUrl = "https://connect.ebay.com/srv/survey/64b88249eb6e2c30ecc21654/payments.cart.survey";
//        Assert.assertEquals(actualUrl, expectedUrl);
//    }


//test case for send us your comments under the search bar


   /* @Test
    void testTextShopping() {
        String expected = "Shopping cart";
        String actual = cartPage.text();
        Assert.assertEquals(actual, expected);
    } */



}