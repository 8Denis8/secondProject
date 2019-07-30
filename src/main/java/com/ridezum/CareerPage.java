package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareerPage extends BasePage {

    public CareerPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".m-btn.m-banner__btn")
    private WebElement viewJobsButton;

    public JobsRidezumPage clickViewJobsButton(){
        viewJobsButton.click();
        return new JobsRidezumPage(driver);
    }
}
