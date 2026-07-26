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
    public void instituteRegistration(
            String instituteName,
            String address,
            String state,
            String district,
            String city,
            String pincode,
            String phone,
            String fax,
            String instituteEmail,
            String adminEmail,
            String principalActivity,
            String category,
            String institutionType,
            String firstName,
            String lastName,
            String designation,
            String contactEmail,
            String mobile,
            String campus) {

        test = extent.createTest("Institute Registration Test");

        RegistrationPage page = new RegistrationPage(driver);

        page.enterInstituteName(instituteName);
        page.enterAddress(address);
        page.selectState(state);
        page.selectDistrict(district);
        page.enterCity(city);
        page.enterPincode(pincode);

        // Add the remaining methods in RegistrationPage as you implement them
        // page.enterPhone(phone);
        // page.enterFax(fax);
        // page.enterInstituteEmail(instituteEmail);
        // page.enterAdminEmail(adminEmail);
        // page.selectPrincipalActivity(principalActivity);
        // page.selectCategory(category);
        // page.selectInstitutionType(institutionType);
        // page.enterFirstName(firstName);
        // page.enterLastName(lastName);
        // page.enterDesignation(designation);
        // page.enterContactEmail(contactEmail);
        // page.enterMobile(mobile);
        // page.enterCampus(campus);

        page.clickSubmit();

        Assert.assertTrue(driver.getCurrentUrl().contains("registration"));

        test.pass("Institute Registration completed successfully.");
    }
}