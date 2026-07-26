package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class RegistrationPage {

    private WebDriver driver;

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
    // Material UI Dropdown Locators
    //=========================

    private By ddlState = By.id("state");
    private By ddlDistrict = By.id("district");
    private By ddlPrincipalActivity = By.id("principalActivityId");
    private By ddlCategory = By.id("categoryId");
    private By ddlInstitutionType = By.id("institutionTypeId");

    //=========================
    // Button Locator
    //=========================

    private By btnSubmit = By.xpath("//button[@type='submit']");

    //=========================
    // Text Box Methods
    //=========================

    public void enterInstituteName(String name) {
        WaitUtils.waitForVisible(driver, txtInstituteName).sendKeys(name);
    }

    public void enterAddress(String address) {
        WaitUtils.waitForVisible(driver, txtAddress).sendKeys(address);
    }

    public void enterCity(String city) {
        WaitUtils.waitForVisible(driver, txtCity).sendKeys(city);
    }

    public void enterPincode(String pincode) {
        WaitUtils.waitForVisible(driver, txtPincode).sendKeys(pincode);
    }

    //=========================
    // Material UI Dropdown Methods
    //=========================

    public void selectState(String state) {

        WaitUtils.waitForVisible(driver, ddlState).click();
        WaitUtils.waitForVisible(driver, ddlState).sendKeys(state);
        WaitUtils.waitForVisible(driver, ddlState).sendKeys(Keys.ARROW_DOWN);
        WaitUtils.waitForVisible(driver, ddlState).sendKeys(Keys.ENTER);
    }

    public void selectDistrict(String district) {

        WaitUtils.waitForVisible(driver, ddlDistrict).click();
        WaitUtils.waitForVisible(driver, ddlDistrict).sendKeys(district);
        WaitUtils.waitForVisible(driver, ddlDistrict).sendKeys(Keys.ARROW_DOWN);
        WaitUtils.waitForVisible(driver, ddlDistrict).sendKeys(Keys.ENTER);
    }

    public void selectPrincipalActivity(String activity) {

        WaitUtils.waitForVisible(driver, ddlPrincipalActivity).click();
        WaitUtils.waitForVisible(driver, ddlPrincipalActivity).sendKeys(activity);
        WaitUtils.waitForVisible(driver, ddlPrincipalActivity).sendKeys(Keys.ARROW_DOWN);
        WaitUtils.waitForVisible(driver, ddlPrincipalActivity).sendKeys(Keys.ENTER);
    }

    public void selectCategory(String category) {

        WaitUtils.waitForVisible(driver, ddlCategory).click();
        WaitUtils.waitForVisible(driver, ddlCategory).sendKeys(category);
        WaitUtils.waitForVisible(driver, ddlCategory).sendKeys(Keys.ARROW_DOWN);
        WaitUtils.waitForVisible(driver, ddlCategory).sendKeys(Keys.ENTER);
    }

    public void selectInstitutionType(String institutionType) {

        WaitUtils.waitForVisible(driver, ddlInstitutionType).click();
        WaitUtils.waitForVisible(driver, ddlInstitutionType).sendKeys(institutionType);
        WaitUtils.waitForVisible(driver, ddlInstitutionType).sendKeys(Keys.ARROW_DOWN);
        WaitUtils.waitForVisible(driver, ddlInstitutionType).sendKeys(Keys.ENTER);
    }

    //=========================
    // Submit Button
    //=========================

    public void clickSubmit() {

        WaitUtils.waitForVisible(driver, btnSubmit).click();
    }
}