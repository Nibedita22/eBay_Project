import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramePage extends Base{


    @FindBy(css = "[class=\"M6CB1c rr4y5c\"]")
    WebElement signoutText;

    String text(){
        String message = signoutText.getText();
        return message;
    }


}
