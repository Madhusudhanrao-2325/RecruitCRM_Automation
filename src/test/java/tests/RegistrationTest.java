package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import base.BaseTest;
import pages.RegistrationPage;
import utilities.ExcelUtils;

public class RegistrationTest extends BaseTest {

    ExtentTest test;

    @DataProvider(name = "InstituteData")
    public Object[][] getInstituteData() {

        return ExcelUtils.getTestData("Sheet1");

    }

    @Test(dataProvider = "InstituteData")
    public void instituteRegistration(String name,
                                      String address,
                                      String state,
                                      String district,
                                      String city,
                                      String pincode) {

        test = extent.createTest("Institute Registration Test");

        try {

            RegistrationPage page = new RegistrationPage(driver);

            test.info("Entering Institute Registration Details");

            page.enterInstituteName(name);
            page.enterAddress(address);
            page.selectState(state);
            page.selectDistrict(district);
            page.enterCity(city);
            page.enterPincode(pincode);

            page.clickSubmit();

            test.info("Clicked Submit Button");

            Assert.assertTrue(
                    driver.getCurrentUrl().contains("registration"),
                    "Registration failed or URL is incorrect."
            );

            test.pass("Institute Registration completed successfully.");

            System.out.println("Registration Test Passed Successfully.");

        } catch (Exception e) {

            test.fail("Test Failed : " + e.getMessage());

            throw e;
        }
    }
}