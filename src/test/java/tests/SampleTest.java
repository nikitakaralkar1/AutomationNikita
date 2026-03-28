package tests;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import listeners.TestListener;
import listeners.Retry;


@Listeners(TestListener.class)

public class SampleTest  extends BaseTest {
	
	   @Test(retryAnalyzer = Retry.class)
	    public void testFail() {
	        Assert.assertTrue(true);
	    }

}
