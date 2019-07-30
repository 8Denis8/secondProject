package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class VeraficationRequiredFieldTest extends MainTest {
    private HomePage homePage;
    private ApplyToDrivePage applyToDrivePage;

    @Test
    public void testVeraficationRequiredField(){

        homePage = new HomePage(driver);
        applyToDrivePage = new ApplyToDrivePage(driver);

        homePage.clickApllyToDriveButon();
        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
        applyToDrivePage.inputFirstNameApply("aaaaaaaa");
        applyToDrivePage.inputLastNameField("bbbbbbb");

        applyToDrivePage.inputEmailField("aabb");
        String emailErrorNote = applyToDrivePage.getValidatonEmailErrorNote();
        System.out.println(emailErrorNote);
        Assert.assertEquals("Please enter a valid email address", emailErrorNote);
        driver.findElement(By.cssSelector("#application_form_email")).clear();

        applyToDrivePage.inputPhoneNumber("123456p890");
        String phoneErrorNote = applyToDrivePage.getValidationPhoneErrorNote();
        System.out.println(phoneErrorNote);
        Assert.assertEquals("The phone number is not valid", phoneErrorNote);
        driver.findElement(By.cssSelector("#application_form_phone_number"));

        applyToDrivePage.clearEmailField();
        applyToDrivePage.inputEmailField("asd@asd.io");
        applyToDrivePage.clearPhoneField();
        applyToDrivePage.inputPhoneNumber("1234567890");

    }
}
