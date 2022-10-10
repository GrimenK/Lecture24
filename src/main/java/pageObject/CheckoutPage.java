package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends AbstractPage {

    @FindBy(xpath = "//dl[contains(@class, 'js-total')]//dd")
    public WebElement totalAmountText;

}
