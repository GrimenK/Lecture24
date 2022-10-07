package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaHeaderPannel extends AbstractPage {

    @FindBy(xpath = "//input[contains(@class, 'search-form__input')]")
    public WebElement searchInput;

    @FindBy(xpath = "//button[contains(@class, 'search-form__submit')]")
    public WebElement searchButton;


    public RozetkaHeaderPannel enterTextInSearchInput(String text){
        searchInput.sendKeys(text);
        return this;
    }

    public RozetkaHeaderPannel clickSearch(){
        searchButton.click();
        return this;
    }
}
