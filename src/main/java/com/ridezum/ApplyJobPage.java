package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyJobPage extends BasePage{

    public ApplyJobPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".postings-btn.template-btn-submit.hex-color")
    private List<WebElement> applyJobButton;

    public ApplyJobPage clickApplyJobButon(){
        applyJobButton.get(0).click();
        return new ApplyJobPage(driver);
    }
}
