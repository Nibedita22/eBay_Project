import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeAndGardenTest extends Base{

    HomeAndGardenPage homeAndGarden;


    @BeforeMethod
    void starting(){
        openBrowser("https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGarden = PageFactory.initElements(driver, HomeAndGardenPage.class);
    }

    @AfterMethod
    void close(){
        closeBrowser();
    }

    // test the text shop by category in the Home and garden section

    //Step 1: open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: click to the Home & Garden
    //Expected Result: User will see the Shop by category texts under the Limited time events..

    @Test
    void testCategory(){
        String expected = "Shop by category";
        String actual = homeAndGarden.text();
        Assert.assertEquals(actual, expected);

    }


    //test case for small kitchen appliance under shop by category

    //Step 1: open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: click to the Home & Garden
    //Step 4: click to the Small Kitchen Appliances
    //Expected Result: It will show all the small kitchen appliances.

    @Test
    void testAppliances(){
        homeAndGarden.clickKitchenAppliances();
        String expectedUrl = "https://www.ebay.com/b/Small-Kitchen-Appliances/20667/bn_2311275";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }


    //test case for small kitchen appliance under shop by category then select countertop mixers

    //Step 1: open gGoogle Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: click to the Home & Garden
    //Step 4: click to the Small Kitchen Appliances
    //Step 5: Select Countertop Mixers
    //Expected Result: It will show all the countertop mixer.

    @Test
    void testCountertopMixers(){
        homeAndGarden.clickKitchenAppliances();
        homeAndGarden.clickMixers();
        String expectedUrl = "https://www.ebay.com/b/Countertop-Mixers/133701/bn_2710956";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    //test case for small kitchen appliance under shop by category then select countertop mixers and color

    //Step 1: open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: click to the Home & Garden
    //Step 4: click to the Small Kitchen Appliances
    //Step 5: Select Countertop Mixers
    //Step 6: Select color White
    //Expected Result: It will show all the white countertop mixer.

    @Test
    void testProductColor(){
        homeAndGarden.clickKitchenAppliances();
        homeAndGarden.clickMixers();
        homeAndGarden.clickColor();
        String expectedUrl = "https://www.ebay.com/b/Countertop-Mixers/133701?Color=White&rt=nc";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }
    //test case for small kitchen appliance under shop by category
    // then select countertop mixers and color and brand

    //Step 1: open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: click to the Home & Garden
    //Step 4: click to the Small Kitchen Appliances
    //Step 5: Select Countertop Mixers
    //Step 6: Select color White
    //Step 7: Click Brand
    //Expected Result: When the user will click to the brand button the brand dropdown button will work successfully.

    @Test
    void testProductBrand(){
        homeAndGarden.clickKitchenAppliances();
        homeAndGarden.clickMixers();
        homeAndGarden.clickColor();
        homeAndGarden.clickBrand();
        String expectedUrl = "https://www.ebay.com/b/Countertop-Mixers/133701?Color=White&rt=nc";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }
    //test case for small kitchen appliance under shop by category then select countertop mixers
    // and color and select brand name

    //Step 1: open Google Chrome browser
    //Step 2: Open the ebay website using the following link https://www.ebay.com/
    //Step 3: click to the Home & Garden
    //Step 4: click to the Small Kitchen Appliances
    //Step 5: Select Countertop Mixers
    //Step 6: Select color White
    //Step 7: Click to the Brand
    //Step 8: Select brand Cuisinart
    //Expected Result: the brand dropdown button will work successfully.

    @Test
    void testProductBrandName(){
        homeAndGarden.clickKitchenAppliances();
        homeAndGarden.clickMixers();
        homeAndGarden.clickColor();
        homeAndGarden.clickBrand();
        homeAndGarden.clickBrandName();
        String expectedUrl = "https://www.ebay.com/b/Countertop-Mixers/133701?Color=White&rt=nc";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);

    }


}

