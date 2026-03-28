package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
public class DropdownPage {
	
	WebDriver driver;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectDropdown() {
        driver.get("https://demoqa.com/select-menu");

        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByVisibleText("Blue");
    }
}


