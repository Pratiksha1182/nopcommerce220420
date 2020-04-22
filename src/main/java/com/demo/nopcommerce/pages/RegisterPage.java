package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());


    /*By femaleRadioButton = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By emailField = By.id("Email");
    By companyNameField = By.id("Company");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationCompletedText = By.xpath("//div[@class='result']");
*/
    @FindBy(id = "gender-female")
    WebElement _femaleRadioButton;

    @FindBy(id ="FirstName" )
    WebElement _firstNameField;

    @FindBy(id ="LastName" )
    WebElement _lastNameField;

    @FindBy(id ="Email" )
    WebElement _emailField;

    @FindBy(id ="Company" )
    WebElement _companyNameField;

    @FindBy(id ="Password" )
    WebElement _passwordField;

    @FindBy(id ="ConfirmPassword" )
    WebElement _confirmPasswordField;

    @FindBy(id ="register-button" )
    WebElement _registerButton;

    @FindBy(xpath = "//div[@class='result']")
    WebElement _registrationCompletedText;


    public void clickOnRadioButton() {
        Reporter.log("Clicking on radio button" + _femaleRadioButton.toString()+"<br>");
        clickOnElement(_femaleRadioButton);
        log.info("Clicking on radio button" + _femaleRadioButton.toString());
    }

    public void enterFirstName(String FirstName) {
        Reporter.log("Entering first name" + FirstName +"in first name field" + _firstNameField.toString()+"<br>");
        sendTextToElement(_firstNameField,FirstName);
        log.info("Entering first name" + FirstName +"in first name field" + _firstNameField.toString());
    }

    public void enterLastName(String Lastname) {
        Reporter.log("Entering last name" + Lastname + "in last name field" + _lastNameField.toString()+"<br>");
        sendTextToElement(_lastNameField,Lastname);
        log.info("Entering last name" + Lastname + "in last name field" + _lastNameField.toString());
    }

    public void enterEmailId(String Email) {
        Reporter.log("Entering email" + Email + "in email field" + _emailField.toString()+"<br>");
        sendTextToElement(_emailField,Email);
        log.info("Entering email" + Email + "in email field" + _emailField.toString());
    }

    public void enterCompanyNameField(String CompanyName) {
        Reporter.log("Entering company name" + CompanyName + "in company name field" + _companyNameField.toString()+"<br>");
        sendTextToElement(_companyNameField, CompanyName);
        log.info("Entering company name" + CompanyName + "in company name field" + _companyNameField.toString());
    }

    public void enterPassword(String Password) {
        Reporter.log("Entering password " + Password + "in password field" + _passwordField.toString()+"<br>");
        sendTextToElement(_passwordField, Password);
        log.info("Entering password " + Password + "in password field" + _passwordField.toString());
    }

    public void enterconfirmpassword(String ConfirmPassword) {
        Reporter.log("Entering confirm password" + ConfirmPassword +" in confirm password field" + _confirmPasswordField.toString()+"<br>");
        sendTextToElement(_confirmPasswordField, ConfirmPassword);
        log.info("Entering confirm password" + ConfirmPassword +" in confirm password field" + _confirmPasswordField.toString());
    }

    public void clickOnRegisterButton() {
        Reporter.log("Clicking on register button" + _registerButton.toString()+"<br>");
        clickOnElement(_registerButton);
        log.info("Clicking on register button" + _registerButton.toString());
    }

    public String getRegistrationComplition() {
        Reporter.log("Getting registration complition confirmation" + _registrationCompletedText.toString()+"<br>");
        log.info("Getting registration complition confirmation" + _registrationCompletedText.toString());
        return getTextFromElement(_registrationCompletedText);
    }
    public void registerInNopCommerce(String FirstName,String Lastname,String Email, String CompanyName, String Password,String ConfirmPassword){
        clickOnRadioButton();
        enterFirstName(FirstName);
        enterLastName(Lastname);
        enterEmailId(Email);
        enterCompanyNameField(CompanyName);
        enterPassword(Password);
        enterconfirmpassword(ConfirmPassword);
        clickOnRegisterButton();
        getRegistrationComplition();
    }
}
