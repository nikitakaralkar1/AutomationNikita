package tests;
import org.testng.annotations.Test;
import listeners.Retry;
import org.testng.annotations.Listeners;
import listeners.TestListener;

import pages.*;

@Listeners(TestListener.class)
public class AllConceptsTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void testAlerts() {
        new AlertsPage(driver).handleAlert();
    }

    @Test(retryAnalyzer = Retry.class)
    public void testFrames() {
        new FramesPage(driver).switchToFrame();
    }

    @Test(retryAnalyzer = Retry.class)
    public void testWindows() {
        new WindowPage(driver).handleWindow();
    }

    @Test(retryAnalyzer = Retry.class)
    public void testDropdown() {
        new DropdownPage(driver).selectDropdown();
    }

    @Test(retryAnalyzer = Retry.class)
    public void testActions() {
        new ActionsPage(driver).mouseHover();
    }

    @Test(retryAnalyzer = Retry.class)
    public void testUpload() {
        new UploadPage(driver).uploadFile();
    }
}

