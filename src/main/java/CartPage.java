import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Base{

    // test case for you don't have any items in your cart.
    @FindBy(xpath = "//div[@class=\"font-title-3\"]/span/span/span")
    WebElement cartText;


    //test case for start shopping button
    @FindBy(css = "[data-test-id=\"start-shopping\"]")
    WebElement startShopping;


    //test case for sign in button
    @FindBy(css = "[data-test-id=\"SIGN_IN\"]")
    WebElement signIn;


    //test case for advanced button beside the search button
    @FindBy(css = "[_sp=\"m570.l2614\"]")
    WebElement advanced;


    //test case for search button inside the advance search button beside the search bar
    @FindBy(css = "[_sp=\"p4433449.m150127.l158973\"]")
    WebElement searchItem;


    //test case for send us your comments under the search bar
    @FindBy(css = "[data-test-id=\"SURVEY_LINK\"]")
    WebElement comments;


    //test case for select the issues inside the send us your comments button under the search bar
    @FindBy(css = "[id=\"_1_2\"]")
    WebElement issues;


    // test case for search laptop using sendKeys from the cart page
    @FindBy(css = "[class=\"gh-tb ui-autocomplete-input\"]")
    WebElement searchBar;

    // test case for sort by options in the search laptop using sendKeys from the cart page
    @FindBy(css = "[class=\"srp-sort srp-sort--filter-evolution\"]")
    WebElement sortBy;

    // test case for sort by (timed: newly listed) options in the search laptop using sendKeys from the cart page
    @FindBy(css = "[_sp=\"p2351460.m4116.l5869.c3\"]")
    WebElement newlyListed;

    //test case for send button in the issues inside the send us your comments button under the search bar
    //@FindBy(css = "[id=\"submitFdbk\"]")
    //WebElement send;








    //@FindBy(css = "[data-test-id=\"main-title\"]")
    //WebElement shoppingCartText;


    String text(){
        String cart = cartText.getText();
        return cart;
    }

    void clickShop(){
        startShopping.click();
    }

    void clickSignIn(){
        signIn.click();
    }


    //test case for advanced button beside the search button
    void clickAdvanced(){
        advanced.click();
    }


    //test case for search button inside the advance search button beside the search bar
    void clickSearchItem(){
        searchItem.click();
    }


    //test case for send us your comments under the search bar
    void clickComments(){
        comments.click();
    }

    //test case for select the issues inside the send us your comments button under the search bar
    void clickIssues(){
        issues.click();
    }

    // test case for search laptop using sendKeys from the cart page

    void search(){
        waitForElement(10, searchBar);
        searchBar.sendKeys("laptop", Keys.ENTER);
    }

    // test case for sort by options in the search laptop using sendKeys from the cart page
    void clicksortBy(){
        sortBy.click();
    }


    // test case for sort by (timed: newly listed) options in the search laptop using sendKeys from the cart page
    void clicknewlyListed(){
        newlyListed.click();
    }

    //test case for select the issues inside the send us your comments button under the search bar
//    void clickSend(){
//        send.click();
//
//    }



    /*String textShopping(){
        String shopping = shoppingCartText.getText();
        return shopping;
    }*/




}