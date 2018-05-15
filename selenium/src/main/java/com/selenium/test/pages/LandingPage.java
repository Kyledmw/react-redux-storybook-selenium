package com.selenium.test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.test.common.AGenericPage;

/**
 ********************************************************************
 * WebDriver mapping of the Landing Page
 * 
 * @author Kyle Williamson
 * @version 1.0.0
 ********************************************************************
 */
public class LandingPage extends AGenericPage
{
   private static final String ROOT_ID = "root";
   
   @FindBy(id = ROOT_ID)
   public WebElement container_Root;
   
   public LandingPage(WebDriver driver)
   {
      super(driver);
   }

}

