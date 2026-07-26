package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;

import factory.DriverFactory;
import utilities.ExtentManager;

public class BaseTest {

    protected WebDriver driver;

    public static ExtentReports extent;

    private static final Logger logger =
            LogManager.getLogger(BaseTest.class);

    @BeforeSuite
    public void setupReport() {

        logger.info("Creating Extent Report");

        extent = ExtentManager.getReportObject();

    }

    @BeforeMethod
    public void setUp() {

        logger.info("Launching Browser");

        DriverFactory.initializeDriver();

        driver = DriverFactory.getDriver();

        logger.info("Browser Launched Successfully");

    }

    @AfterMethod
    public void tearDown() {

        logger.info("Closing Browser");

        DriverFactory.quitDriver();

        logger.info("Browser Closed");

    }

    @AfterSuite
    public void tearDownReport() {

        logger.info("Saving Extent Report");

        extent.flush();

        logger.info("Extent Report Saved Successfully");

    }
}