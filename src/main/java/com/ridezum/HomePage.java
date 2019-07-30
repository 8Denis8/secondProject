package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".m-btn.front-banner__btn")
    public List<WebElement> applyToDriveButton;

    @FindBy(css = ".main-menu__link")
    public List<WebElement> careersButton;

    public CareerPage ClickCareerButton(){
        careersButton.get(4).click();
        return new CareerPage(driver);

    }

    public ApplyToDrivePage clickApllyToDriveButon(){
        applyToDriveButton.get(1).click();
        return new ApplyToDrivePage(driver);
    }
}
