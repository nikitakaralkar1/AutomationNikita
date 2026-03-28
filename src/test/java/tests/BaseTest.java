package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.DriverFactory;

public class BaseTest {
	
	  protected WebDriver driver;
	  
	  public WebDriver getDriver() {
		    return driver;
		}
	    @BeforeMethod
	    public void setup() {
	        driver = DriverFactory.getDriver();
	        driver.get("https://demoqa.com/alerts");
	    }

	    @AfterMethod
	    public void tearDown() {
	        DriverFactory.quitDriver();
	    }

}
