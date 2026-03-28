package utlis;

import org.openqa.selenium.*;

public class JSUtil {
	
	public static void scroll(WebDriver driver) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollBy(0,500)");
    }

}
