package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitUtils;

public class RegistrationPage {

    private WebDriver driver;

    //=========================
    // Constructor
    //=========================

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    //=========================
    // Text Box Locators
    //=========================

    private By txtInstituteName = By.id("name");
    private By txtAddress = By.id("address");
    private By txtCity = By.id("city");
    private By txtPincode = By.id("pincode");

    //=========================
    // Dropdown Locators
    //=========================

    private By ddlState = By.id("state");
    private By ddlDistrict = By.id("district");
    private By ddlPrincipalActivity = By.id("principalActivity");
    private By ddlCategory = By.id("category");
    private By ddlInstitutionType = By.id("institutionType");

    //=========================
    // Text Box Methods
    //=========================

    public void enterInstituteName(String name) {

        WaitUtils.waitForVisible(driver, txtInstituteName)
                 .sendKeys(name);
    }

    public void enterAddress(String address) {

        WaitUtils.waitForVisible(driver, txtAddress)
                 .sendKeys(address);
    }

    public void enterCity(String city) {

        WaitUtils.waitForVisible(driver, txtCity)
                 .sendKeys(city);
    }

    public void enterPincode(String pincode) {

        WaitUtils.waitForVisible(driver, txtPincode)
                 .sendKeys(pincode);
    }

    //=========================
    // Dropdown Methods
    //=========================

    public void selectState(String state) {

        Select select = new Select(
                WaitUtils.waitForVisible(driver, ddlState));

        select.selectByVisibleText(state);
    }

    public void selectDistrict(String district) {

        Select select = new Select(
                WaitUtils.waitForVisible(driver, ddlDistrict));

        select.selectByVisibleText(district);
    }

    public void selectPrincipalActivity(String activity) {

        Select select = new Select(
                WaitUtils.waitForVisible(driver, ddlPrincipalActivity));

        select.selectByVisibleText(activity);
    }

    public void selectCategory(String category) {

        Select select = new Select(
                WaitUtils.waitForVisible(driver, ddlCategory));

        select.selectByVisibleText(category);
    }

    public void selectInstitutionType(String institutionType) {

        Select select = new Select(
                WaitUtils.waitForVisible(driver, ddlInstitutionType));

        select.selectByVisibleText(institutionType);
    }
}