package pages;
import org.openqa.selenium.*;

public class UploadPage {
	
	  WebDriver driver;

	    public UploadPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void uploadFile() {
	        driver.get("https://demoqa.com/upload-download");

	        driver.findElement(By.id("uploadFile"))
	              .sendKeys("D:\testfile.txt");
	    }

}
