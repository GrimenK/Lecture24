package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.Driver;
import webdriver.ObjectManager;
import webdriver.Utils;

public class FilterTab extends AbstractPage {

    @FindBy(xpath = "//div[@data-filter-name = 'price']//input[@formcontrolname = 'max']")
    public WebElement maxPriceInput;


    @FindBy(xpath = "//div[@data-filter-name = 'price']//button[@type = 'submit']")
    public WebElement applyFilterBtn;

    public FilterTab setMaxPrice(String text){
        Utils.scrollJsIntoView(maxPriceInput);
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.visibilityOf(maxPriceInput));
        maxPriceInput.clear();
        maxPriceInput.sendKeys(text);
        return ObjectManager.getInstance().getFilterTab();
    }

    public FilterTab applyMaxPriceFilter(){
        new WebDriverWait(Driver.getWebDriver(),5).until(ExpectedConditions.elementToBeClickable(applyFilterBtn));
        applyFilterBtn.click();
        //after filter applied the page is inactive

        return ObjectManager.getInstance().getFilterTab();
    }


}
