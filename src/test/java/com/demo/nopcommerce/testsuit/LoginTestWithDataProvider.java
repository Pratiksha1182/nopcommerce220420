package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.ComputersPage;
import com.demo.nopcommerce.pages.Homepage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithDataProvider extends TestBase {
    Homepage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        homePage = new Homepage();
        loginPage = new LoginPage();
    }
    @Test(priority = 0, groups = {"Regression"},dataProvider = "Login Data", dataProviderClass = TestData .class)

    public void verifyUserShouldNavigateToLoginPage(String email, String password){
        homePage.clickOnLoginLink();
        loginPage.logInToNopCommerce(email,password);
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(priority = 1,groups = {"Smoke","Regression"}, dataProvider = "Login Data",dataProviderClass = TestData.class)
    public void userShouldLogInSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("pratikshapatel1182@gmail.com");
        loginPage.enterPassword("2810om");
        loginPage.clickOnLoginButton();
        String expectedText = "Welcome to our store";
        String actualText = loginPage.getWelcomeText1();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test(groups = {"Sanity","Regression"})
    public void userShouldNotLogInSuccessfully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("abcdefg@yahoo.com");
        loginPage.enterPassword("2810om");
        loginPage.clickOnLoginButton();
        String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualText = loginPage.getErrorLoginWasUnsuccefulText();
        Assert.assertEquals(expectedText,actualText);
    }
}
