package utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks {
    @Before
    public void setUp(){
        ThreadSafeDriver.threadBrowserName.set(ConfigReader.getProperty("browser"));
        ThreadSafeDriver.getDriver();
    }
    @After
    public void tearDown(){
        ThreadSafeDriver.quitDriver();
    }
}
