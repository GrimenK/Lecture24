import org.testng.Assert;
import org.testng.annotations.Test;
import webdriver.PageObjectManager;


public class RozetkaTest extends BaseTest {

    @Test
    public void firstTest(){

//        pageObjectManager
//                .getRozetkaHeaderPannel()
//                .enterTextInSearchInput("laptop")
//                .clickSearch();
//        pageObjectManager
//                .getFilterTab()
//                .setMaxPrice("20000")
//                .applyMaxPriceFilter();
//        pageObjectManager
//                .getCatalogPage()
//                .chooseItem(0)
//                .clickBuyBtn()
//                .clickBuyBtnPopup();

        businessObjectManager.getRozetkaMainBO()
                .enterQueryAndSearch("laptop"); //should method return another BO object(like one did in PO)

        businessObjectManager.getCatalogPageBO()
                .setMaximumPriceInFilter(20000);

        businessObjectManager.getCatalogPageBO()
                .selectItemFromCatalogByIndex(1);

        businessObjectManager.getItemPageBO()
                .addItemToCartAndProceedToCheckout();

        Assert.assertTrue(PageObjectManager.getInstance().getCheckoutPage().totalAmountText.getIntValueFromLable() < 20000);

    }

}
