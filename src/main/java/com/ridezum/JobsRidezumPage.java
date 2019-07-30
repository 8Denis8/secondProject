package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class JobsRidezumPage extends BasePage{

    public JobsRidezumPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
    private List<WebElement> applyButtonJobsRidezumPage;

    public ApplyJobPage clickButtonApplyRidezumPage(){
        applyButtonJobsRidezumPage.get(0).click();
        return new ApplyJobPage(driver);
    }

}
