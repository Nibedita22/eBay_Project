import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends Base{

    @FindBy(css = "[class=\"s-item__image-wrapper\"]")
    WebElement item;

    @FindBy(css = "[class=\"ux-textspans ux-textspans--BOLD\"]")
    WebElement itemDetails;


    void openWindow(){
        item.click();
        System.out.println(driver.getCurrentUrl());
        switchWindow();
    }
    String copyMessage(){
        return itemDetails.getText();
    }


}
