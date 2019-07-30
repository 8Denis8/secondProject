package com.ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class applyToDriveTest extends MainTest {

    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;
    private Random random;

    @Test
    public void testApllyToDrive() throws InterruptedException {

        homePage = new HomePage(driver);
        applyToDrivePage = new ApplyToDrivePage(driver);

        homePage.clickApllyToDriveButon();
        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));  /** !!!!!!!!!!!!!!!!!!! */
        applyToDrivePage.inputFirstNameApply("Vasya");
        applyToDrivePage.inputLastNameField("Barankin");
        applyToDrivePage.inputEmailField("abc@abc.io");
        applyToDrivePage.inputPhoneNumber("1234567890");
        applyToDrivePage.clickFlagField();

        random = new Random();
        int randomeCountryListbox = random.nextInt(245);
        applyToDrivePage.selectAreaListbox(randomeCountryListbox);

        applyToDrivePage.selectAreaField();
//        driver.findElement(By.cssSelector("#application_form_applicant_region"));

//        int randomeSelectRegion = random.nextInt(6);
//        applyToDrivePage.selectRegion(randomeSelectRegion);
//        applyToDrivePage.selectRegionByName();
        applyToDrivePage.selectAraeByVisiblName();

//        int randomeArea = random.nextInt(6);
//        applyToDrivePage.clickAreaField(randomeArea);

        applyToDrivePage.inputHomeZipcode("90006");
        applyToDrivePage.inputReferralCode("F3J54LK");

        driver.switchTo().defaultContent(); /** !!!!!!!!!!!!!!!!!!!!! */
        applyToDrivePage.clickCareers(4);
    }
}
