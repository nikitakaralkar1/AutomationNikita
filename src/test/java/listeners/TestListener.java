package listeners;

import org.testng.*;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import utils.ScreenshotUtil;
import tests.BaseTest;

public class TestListener implements ITestListener {
	
	
	static ExtentReports extent = new ExtentReports();
    static {
        extent.attachReporter(new ExtentSparkReporter("reports/report.html"));
    }

    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());

        BaseTest base = (BaseTest) result.getInstance();
        String path = ScreenshotUtil.capture(base.getDriver(), result.getName());

        test.addScreenCaptureFromPath(path);
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
