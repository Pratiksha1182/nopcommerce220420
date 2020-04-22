package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.Homepage;
import com.demo.nopcommerce.pages.LoginPage;
import com.demo.nopcommerce.resources.testdata.TestData;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestWithExcel extends TestBase {
    Homepage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        homePage = new Homepage();
        loginPage = new LoginPage();
    }
    @Test(priority = 0, groups = {"Regression"}, dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void verifyUserShouldNavigateToLoginPage(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.logInToNopCommerce(username, password);
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(priority = 1, groups = {"Smoke"},dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void userShouldLogInSuccessfully(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.logInToNopCommerce(username, password);
        String expectedText = "Welcome to our store";
        String actualText = loginPage.getWelcomeText1();
        Assert.assertEquals(expectedText,actualText);
    }
    @Test(priority = 2, groups = {"Sanity"}, dataProvider = "LoginData", dataProviderClass = TestData.class)
    public void userShouldNotLogInSuccessfully(String username, String password){
        homePage.clickOnLoginLink();
        loginPage.logInToNopCommerce(username, password);
        String expectedText = "Login was unsuccessful. Please correct the errors and try again" + "No customer account found";
        String actualText = loginPage.getErrorLoginWasUnsuccefulText();
        Assert.assertEquals(expectedText,actualText);
    }
}
