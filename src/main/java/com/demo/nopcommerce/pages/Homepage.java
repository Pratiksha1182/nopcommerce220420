package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Homepage extends Utility {
   /* By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");
    By computerTab = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
*/
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @FindBy(linkText = "Log in")
    WebElement _loginLink;
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registerLink;
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement _computerTab;


    public void clickOnLoginLink(){
        Reporter.log("Clicking on login link" + _loginLink.toString()+"<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on login link" + _loginLink.toString());
    }

    public void clickOnRegisterLink(){
        Reporter.log("Clicking on register link" + _registerLink.toString()+"<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on register link" + _registerLink.toString());
    }

    public void mouseHoverOnComputerTab(){
        Reporter.log("Mouse hovering on computer tab " + _computerTab.toString()+"<br>");
        clickOnElement(_computerTab);
        log.info("Mouse hovering on computer tab " + _computerTab.toString());
    }

}
