package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SubmitYourApplicationPage extends BasePage {

    public SubmitYourApplicationPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "input[name=\"name\"]")
    private WebElement inputFullNameField;

    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[name=\"phone\"]")
    private WebElement inputPhoneField;

    @FindBy(css = "select[name=\"eeo[gender]\"]")
    private WebElement selectGenderDropDownList;

    @FindBy(css = "select[name=\"eeo[race]\"]")
    private WebElement selectRaceDropDownList;

    @FindBy(css = "select[name=\"eeo[veteran]\"")
    private WebElement selectVeteranDropDownList;

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private WebElement submitButton;

    @FindBy(css = ".error-message")
    private List<WebElement> errorMissageAttachResume;

    public String getErrorMissageAttachResume(){
        return errorMissageAttachResume.get(0).getText();
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void selectVeteran(){
        wait.until(ExpectedConditions.elementToBeClickable(selectVeteranDropDownList));
        Select select = new Select(selectVeteranDropDownList);
        select.selectByValue("I am not a veteran");
    }

    public void selectRace(){
        wait.until(ExpectedConditions.elementToBeClickable(selectRaceDropDownList));
        Select select = new Select(selectRaceDropDownList);
        select.selectByVisibleText("Two or More Races (Not Hispanic or Latino)");
    }

    public void selectGender(){
        wait.until(ExpectedConditions.elementToBeClickable(selectGenderDropDownList));
        Select select = new Select(selectGenderDropDownList);
        select.selectByIndex(2);
    }

    public void inputPhone(String phone){
        wait.until(ExpectedConditions.elementToBeClickable(inputPhoneField));
        inputPhoneField.sendKeys(phone);
    }

    public void inputEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);
    }

    public void inputFullName(String fullName){
        wait.until(ExpectedConditions.elementToBeClickable(inputFullNameField));
        inputFullNameField.sendKeys(fullName);
    }
}
