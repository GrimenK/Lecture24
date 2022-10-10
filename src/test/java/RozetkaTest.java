import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.AbstractPage;
import pageObject.RozetkaHeaderPannel;


public class RozetkaTest extends BaseTest {

    @Test
    public void firstTest(){
        LOG.info("lOG IN TEST");
        objectManager
                .getRozetkaHeaderPannel()
                .enterTextInSearchInput("laptop")
                .clickSearch();
        objectManager
                .getFilterTab()
                .setMaxPrice("20000")
                .applyMaxPriceFilter();
        objectManager
                .getCatalogPage()
                .chooseItem(0)
                .clickBuyBtn()
                .clickBuyBtnPopup();

        String sum = objectManager.getCheckoutPage().totalAmountText.getText().replaceAll("\\D","");

        Assert.assertTrue(Integer.parseInt(sum) < 20000);
    }

}
