package com.selenium.test.common;

import org.openqa.selenium.WebDriver;

/**
 ********************************************************************
 * Provides boilerplate for a generic web page
 * 
 * @author Kyle Williamson
 * @version 1.0.0
 ********************************************************************
 */
public abstract class AGenericPage
{

   protected WebDriver driver;
   
   public AGenericPage(WebDriver driver) {
      this.driver = driver;
   }
}

