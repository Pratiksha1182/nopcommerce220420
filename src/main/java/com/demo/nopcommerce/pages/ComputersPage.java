package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputersPage extends Utility {
   /*By desktopsTab = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
   By buildYourOwnComputer = By.xpath("//h2[@class='product-title']//a[contains(text(),'Build your own computer')]");
   By hddRadioButton = By.id("product_attribute_3_7");
   By addToCart = By.id("add-to-cart-button-1");
   By addedToShoppingCartText = By.xpath("//a[contains(text(),'shopping cart')]");
*/
   private static final Logger log = LogManager.getLogger(ComputersPage.class.getName());

   @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
   WebElement _desktopsTab;
   @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'Build your own computer')]")
   WebElement _buildYourOwnComputer;
   @FindBy(id = "product_attribute_3_7")
   WebElement _hddRadioButton;
   @FindBy(id = "add-to-cart-button-1")
   WebElement _addToCart;
   @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
   WebElement _addedToShoppingCartText;

   public void mouseHoverOnDesktopAndClick(){
      Reporter.log("Mouse hovering on desktop and click" + _desktopsTab.toString()+"<br>");
      mouseHoverToElementAndClick(_desktopsTab);
      log.info("Mouse hovering on desktop and click" + _desktopsTab.toString());
   }

   public void clickOnBuildYourOwnComputer(){
      Reporter.log("clicking on build your own computer" + _buildYourOwnComputer.toString()+"<br>");
      clickOnElement(_buildYourOwnComputer);
      log.info("clicking on build your own computer" + _buildYourOwnComputer.toString());
   }

   public void clickOnHddRadioButton(){
      Reporter.log("Clicking on Hdd radio button" + _hddRadioButton.toString()+"<br>");
      //waitUntilElementToBeClickable(_hddRadioButton, 20);
      clickOnElement(_hddRadioButton);
      log.info("Clicking on Hdd radio button" + _hddRadioButton.toString());
   }

   public void clickOnAddToCartButton(){
      Reporter.log("Clicking on add to cart button" + _addToCart.toString()+"<br>");
      clickOnElement(_addToCart);
      log.info("Clicking on add to cart button" + _addToCart.toString());
   }

   public String addToCartConfirmationText(){
      Reporter.log("Get add to cart confirmation" + _addedToShoppingCartText.toString()+"<br>");
      log.info("Get add to cart confirmation" + _addedToShoppingCartText.toString());
      return getTextFromElement(_addedToShoppingCartText);}

}
