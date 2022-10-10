package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.ObjectManager;

public class ItemPage extends AbstractPage {

    @FindBy(xpath = "//ul[@class = 'product-buttons']//span[@class = 'buy-button__label ng-star-inserted']")
    public WebElement buyBtn;


    public CartPopup clickBuyBtn(){
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.visibilityOf(buyBtn));
        buyBtn.click();
        return ObjectManager.getInstance().getCartPopup();
    }
}
