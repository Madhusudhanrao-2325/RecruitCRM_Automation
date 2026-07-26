package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getReportObject() {

        ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/AutomationReport.html");

        reporter.config().setReportName("Recruit CRM Automation Report");
        reporter.config().setDocumentTitle("Automation Test Results");

        extent = new ExtentReports();
        extent.attachReporter(reporter);

        return extent;
    }
}