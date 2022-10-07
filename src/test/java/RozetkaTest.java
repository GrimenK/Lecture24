import org.testng.annotations.Test;
import pageObject.AbstractPage;
import pageObject.RozetkaHeaderPannel;


public class RozetkaTest extends BaseTest {

    @Test
    public void firstTest(){
        LOG.info("lOG IN TEST");
        objectManager.getRozetkaHeaderPannel().enterTextInSearchInput("laptop").clickSearch();
    }

}
