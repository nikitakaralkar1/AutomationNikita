package pages;

import org.openqa.selenium.*;

public class FramesPage {
	
	 WebDriver driver;

	    public FramesPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void switchToFrame() {
	        driver.get("https://demoqa.com/frames");
	        driver.switchTo().frame("frame1");
	        System.out.println(driver.findElement(By.tagName("h1")).getText());
	        driver.switchTo().defaultContent();
	    }

}
