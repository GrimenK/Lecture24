package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.ObjectManager;

public class CartPopup extends AbstractPage {

    @FindBy(xpath = "//div[contains(@class, 'cart-receipt')]//a")
    public WebElement buyBtn;

    @FindBy(xpath = "//div[contains(@class, 'cart-receipt')]//a")
    public WebElement sumText;


    public CheckoutPage clickBuyBtnPopup(){
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.elementToBeClickable(buyBtn));
        buyBtn.click();
        return ObjectManager.getInstance().getCheckoutPage();
    }
}
