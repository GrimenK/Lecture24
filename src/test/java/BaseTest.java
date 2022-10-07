import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import webdriver.Driver;
import webdriver.LoggerManager;
import webdriver.ObjectManager;


public class BaseTest {
    protected String url;
    protected ObjectManager objectManager;
    public final Logger LOG = LogManager.getLogger(getClass().getName());

    @BeforeClass
    public void SetUp(){
        objectManager = new ObjectManager();

        LOG.info("Test started.");
        url = Params.URL;
        Driver.createDriver();
        get(url);
    }

    @AfterClass
    public void TearDown(){
       LOG.info("Close and quit driver");
        Driver.getWebDriver().close();
        Driver.getWebDriver().quit();
    }


    public void get(String url){
        LOG.info("Open url: " + url);
        Driver.getWebDriver().get(url);
    }

}
