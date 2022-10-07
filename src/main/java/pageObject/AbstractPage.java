package pageObject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import webdriver.Driver;

import java.util.Objects;

public abstract class AbstractPage {

    public AbstractPage(){
        PageFactory.initElements(Driver.getWebDriver(), this);
    }

}
