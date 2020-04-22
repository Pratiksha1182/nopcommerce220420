package com.demo.nopcommerce.testsuit;

import com.demo.nopcommerce.pages.ComputersPage;
import com.demo.nopcommerce.pages.Homepage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {
    Homepage homePage;
    ComputersPage computersPage;

    @BeforeMethod
    public void setup(){
        homePage = new Homepage();
        computersPage = new ComputersPage();
    }
    @Test(groups = {"Regression","sanity"})
    public void verifyUserCanAddToShoppingCart() throws InterruptedException {
        homePage.mouseHoverOnComputerTab();
        computersPage.mouseHoverOnDesktopAndClick();
        computersPage.clickOnBuildYourOwnComputer();
        computersPage.clickOnHddRadioButton();
        computersPage.clickOnAddToCartButton();
        String expectedText = "The product has been added to your shopping cart";
        String actualText = computersPage.addToCartConfirmationText();
        Assert.assertEquals(expectedText,actualText);
        Thread.sleep(3000);
    }

}
