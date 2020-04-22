package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.Homepage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.pages.RegisterPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTestWithDataProvider extends TestBase {
    Homepage homePage;
    RegisterPage registerPage;

    @BeforeMethod
    public void setup() {
        homePage = new Homepage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"Regression","smoke"})
    public void verifyUserShouldRegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("Pratiksha");
        registerPage.enterLastName("Patel");
        registerPage.enterEmailId("abc123@gmail.com");
        registerPage.enterCompanyNameField("PBS Limited");
        registerPage.enterPassword("2810om");
        registerPage.enterconfirmpassword("2810om");
        registerPage.clickOnRegisterButton();
        String expectedText = "Your registration completed";
        String actualText = registerPage.getRegistrationComplition();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(3000);

    }
}
