package com.ridezum;

import org.junit.Assert;
import org.junit.Test;

public class ApplyJobTest extends MainTest {

    private HomePage homePage;
    private CareerPage careerPage;
    private JobsRidezumPage jobsRidezumPage;
    private ApplyJobPage applyJobPage;
    private SubmitYourApplicationPage submitYourApplicationPage;

    @Test
    public void testApplyJob() {

        homePage = new HomePage(driver);

        careerPage = homePage.ClickCareerButton();

        // remember window(tab) to switch
        String windowHandlBefore = driver.getWindowHandle();

        jobsRidezumPage = careerPage.clickViewJobsButton();
//        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs2.get(1));

        //switch to new window(tab)
        for (String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }

        // click button
        applyJobPage = jobsRidezumPage.clickButtonApplyRidezumPage();

        applyJobPage.clickApplyJobButon();

        submitYourApplicationPage = new SubmitYourApplicationPage(driver);

        submitYourApplicationPage.inputFullName("Ivan Susanin");
        submitYourApplicationPage.inputEmail("abc@mail.io");
        submitYourApplicationPage.inputPhone("2134567890");
        submitYourApplicationPage.selectGender();
        submitYourApplicationPage.selectRace();
        submitYourApplicationPage.selectVeteran();
        submitYourApplicationPage.clickSubmitButton();

        String errorMessage = submitYourApplicationPage.getErrorMissageAttachResume();
        System.out.println(errorMessage);
        Assert.assertEquals("✱ Please attach a resume", errorMessage);

        // close current window(tab)
        driver.close();

        // Switch back
        driver.switchTo().window(windowHandlBefore);


    }
}
