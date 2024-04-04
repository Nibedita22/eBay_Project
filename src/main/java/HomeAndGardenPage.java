import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeAndGardenPage extends Base{

    // test the text shop by category in the Home and garden section
    @FindBy(css = "[id=\"s0-28_1-9-0-1[1]-0-2-0-title\"]")
    WebElement furnitureCategory;


    @FindBy(css = "[_sp=\"p2489527.m4947.l9675\"]")
    WebElement kitchenAppliances;


    //test case for small kitchen appliance under shop by category then select countertop mixers

    @FindBy(css = "[_sp=\"p2489527.m4647.l9749\"]")
    WebElement mixers;

    //test case for small kitchen appliance under shop by category then select countertop mixers and color

    @FindBy(css = "[class=\"b-guidancecard__link b-guidancecard__link--noimg\"]")
    WebElement color;


    //test case for small kitchen appliance under shop by category
    // then select countertop mixers and color and brand

    @FindBy(css = "[class=\"x-flyout brm__flyout\"]")
    WebElement brand;

    //test case for small kitchen appliance under shop by category then select countertop mixers
    // and color and select brand name
    @FindBy(css = "[class=\"brm__item-label\"]")
    WebElement brandName;




    // test the text shop by category in the Home and garden section
    String text(){
        String category = furnitureCategory.getText();
        return category;
    }

    //test case for small kitchen appliance under shop by category
    void clickKitchenAppliances(){
        kitchenAppliances.click();

    }
    //test case for small kitchen appliance under shop by category then select countertop mixers

    void clickMixers(){
        mixers.click();

    }
    //test case for small kitchen appliance under shop by category then select countertop mixers and color

    void clickColor(){
        color.click();

    }

    //test case for small kitchen appliance under shop by category
    // then select countertop mixers and color and brand
    void clickBrand(){
        brand.click();

    }

    //test case for small kitchen appliance under shop by category then select countertop mixers
    // and color and select brand name
    void clickBrandName(){
        brandName.click();
    }




}
