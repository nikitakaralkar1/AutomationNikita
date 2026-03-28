package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ActionsPage {
	
	 WebDriver driver;

	    public ActionsPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void mouseHover() {
	        driver.get("https://demoqa.com/buttons");

	        WebElement element = driver.findElement(By.id("doubleClickBtn"));
	        new Actions(driver).moveToElement(element).perform();
	    }

}
