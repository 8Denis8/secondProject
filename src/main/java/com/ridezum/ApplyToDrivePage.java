package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyToDrivePage extends BasePage {

    public ApplyToDrivePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy(css = "input[id=\"application_form_last_name\"")
    private WebElement lastNameField;

    @FindBy(css = "input[id=\"application_form_email\"")
    private WebElement emailField;

    @FindBy(css = "input[id=\"application_form_phone_number\"")
    private WebElement phoneNumberField;

    @FindBy(css = ".selected-flag")
    private WebElement flagField;

    @FindBy(css = ".country")
    private List<WebElement> countryListbox;

    @FindBy(css = "#application_form_applicant_region")
    private List<WebElement> areaField;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement clickAreaField;

    @FindBy(css = "#application_form_zipcode")
    private WebElement homeZipcode;

    @FindBy(css = "#application_form_refcode")
    private WebElement referralCode;

    @FindBy(css = ".application-form__submit-button")
    private WebElement submitButon;

    @FindBy(css = ".main-menu__link")
    private List<WebElement> careers;

    @FindBy(css = ".help-block")
    private List<WebElement> validationError;

    public void clearPhoneField(){
        phoneNumberField.clear();
    }

    public void clearEmailField(){
        emailField.clear();
    }

    public String getValidatonEmailErrorNote(){
//        wait.until(ExpectedConditions.visibilityOfAllElements(validationError));
        return validationError.get(4).getText();
    }

    public String getValidationPhoneErrorNote(){
//        wait.until(ExpectedConditions.visibilityOfAllElements(validationError));
        return validationError.get(6).getText();
    }

    public void clickCareers(int i){
        wait.until(ExpectedConditions.visibilityOfAllElements(careers));
        careers.get(i).click();
    }

    public void clickSubmitButon(){
        wait.until(ExpectedConditions.elementToBeClickable(submitButon));
        submitButon.click();
    }

    public void selectAraeByVisiblName(){
        Select select = new Select(clickAreaField);
        select.selectByVisibleText("Miami, Florida");
    }

    public void selectRegionByName(){
        Select select = new Select(clickAreaField);
        select.selectByValue("Southern California");
    }

    public void inputReferralCode(String code){
        wait.until(ExpectedConditions.elementToBeClickable(referralCode));
        referralCode.sendKeys(code);

    }

    public void inputHomeZipcode(String zipcode){
        wait.until(ExpectedConditions.elementToBeClickable(homeZipcode));
        homeZipcode.sendKeys(zipcode);

    }

    public void selectAreaField(){
        wait.until(ExpectedConditions.elementToBeClickable(clickAreaField));
        clickAreaField.click();
    }

    public void selectAreaListbox(int i){
        wait.until(ExpectedConditions.visibilityOfAllElements(countryListbox));
        countryListbox.get(i).click();
    }

    public void selectRegion(int i){
        Select select = new Select(clickAreaField);
        select.selectByIndex(i);
    }

    public void clickAreaField(int i){
        wait.until(ExpectedConditions.visibilityOfAllElements(areaField));
        areaField.get(i).click();
    }

    public void clickFlagField(){
        wait.until(ExpectedConditions.visibilityOfAllElements(flagField));
        flagField.click();
    }

    public void inputPhoneNumber(String phoneNumber){
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumberField));
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void inputEmailField(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputLastNameField(String lastName){
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);
    }

    public void inputFirstNameApply(String firstName){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);
    }

    public void clickFirstNameField(){
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.click();
    }
}
