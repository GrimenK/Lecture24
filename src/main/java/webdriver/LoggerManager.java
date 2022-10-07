package webdriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerManager {

    public static Logger LOG;

    public static void createLogger(Class claz){
        LOG = LogManager.getLogger(claz.getName());
    }

    public static Logger getLogger() {
        return LOG;
    }

}
