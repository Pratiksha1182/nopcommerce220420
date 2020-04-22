package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

@FindBy(id = "Email")
    WebElement _emailField;
@FindBy(id = "Password")
    WebElement _passwordField;
@FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;
@FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement _welcomeText;
@FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement _welcomeText1;
@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement _errorLoginWasUnsuccessfulText;


    public void enterEmailId(String email) {
        Reporter.log("Entering emial " + email + "in email id field "+_emailField.toString()+"<br>");
        sendTextToElement(_emailField, email);
        log.info("Entering emial " + email + "in email id field "+_emailField.toString());
    }
    public void enterPassword(String password){
        Reporter.log("Entering password" + password + " in password field "+ _passwordField.toString()+"<br>");
        sendTextToElement(_passwordField, password);
        log.info("Entering password" + password + " in password field "+ _passwordField.toString());
    }
    public void clickOnLoginButton(){
        Reporter.log("Clicking on login button" + _loginBtn.toString()+"<br>");
        clickOnElement(_loginBtn);
        log.info("Clicking on login button" + _loginBtn.toString());
    }
    public String getWelcomeText(){
        Reporter.log("Geting welcome text" + _welcomeText.toString()+"<br>");
        log.info("Geting welcome text" + _welcomeText.toString());
        return getTextFromElement(_welcomeText); }

    public String getWelcomeText1(){
        Reporter.log("Getting welcome text1" + _welcomeText1.toString()+"<br>");
        log.info("Getting welcome text1" + _welcomeText1.toString());
        return getTextFromElement(_welcomeText1);
    }
    public String getErrorLoginWasUnsuccefulText(){
        Reporter.log("Getting login error message" + _errorLoginWasUnsuccessfulText.toString()+"<br>");
        log.info("Getting login error message" + _errorLoginWasUnsuccessfulText.toString());
        return getTextFromElement(_errorLoginWasUnsuccessfulText);
    }

    public void logInToNopCommerce(String email, String password){
        enterEmailId(email);
        enterPassword(password);
        clickOnLoginButton();
    }
}
