package pages;

import org.openqa.selenium.*;
import java.util.*;

public class WindowPage {
	
	  WebDriver driver;

	    public WindowPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void handleWindow() {
	        driver.get("https://demoqa.com/browser-windows");

	        driver.findElement(By.id("windowButton")).click();

	        String parent = driver.getWindowHandle();

	        for (String win : driver.getWindowHandles()) {
	            if (!win.equals(parent)) {
	                driver.switchTo().window(win);
	                driver.close();
	            }
	        }

	        driver.switchTo().window(parent);
	    }

}
