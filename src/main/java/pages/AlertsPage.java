package pages;

import org.openqa.selenium.*;

public class AlertsPage {
	
	 WebDriver driver;

	    By alertBtn = By.id("alertButton");

	    public AlertsPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void handleAlert() {
	        driver.findElement(alertBtn).click();
	        driver.switchTo().alert().accept();
	    }

}
