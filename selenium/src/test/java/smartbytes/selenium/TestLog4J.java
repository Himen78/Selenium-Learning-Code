package smartbytes.selenium;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import junit.framework.TestCase;

public class TestLog4J extends TestCase{
	//create the instance of log 4j.
	private final Logger logger = LogManager.getLogger(TestLog4J.class);
	
	public void test_logger() {
		//debug , info, warn, error
		logger.info("This is info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.debug("This is debug message");
	}
	
}
