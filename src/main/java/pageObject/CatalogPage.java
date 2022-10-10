package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.ObjectManager;
import webdriver.Utils;


public class CatalogPage extends AbstractPage {


    @FindBy(xpath = "//a[contains(@class, 'goods-tile__picture')]")
    public List<WebElement> catalogItem;


    public ItemPage chooseItem(int index){
        Utils.scrollJsIntoView(catalogItem.get(index));
        new WebDriverWait(Driver.getWebDriver(),10).until(ExpectedConditions.elementToBeClickable(catalogItem.get(index)));
        Utils.jsClickElement(catalogItem.get(index));
        //catalogItem.get(index).click();
        return ObjectManager.getInstance().getItemPage();
    }
}
