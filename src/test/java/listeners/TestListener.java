package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import factory.DriverFactory;
import utilities.ScreenshotUtils;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.BaseTest;

public class TestListener implements ITestListener {

    private static ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {

        test = BaseTest.extent.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.log(Status.PASS, "Test Passed");

    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.log(Status.FAIL, "Test Failed");

        test.fail(result.getThrowable());

        String screenshotPath =
                ScreenshotUtils.captureScreenshot(
                        DriverFactory.getDriver(),
                        result.getMethod().getMethodName());

        try {

            test.addScreenCaptureFromPath(screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.log(Status.SKIP, "Test Skipped");

    }
}