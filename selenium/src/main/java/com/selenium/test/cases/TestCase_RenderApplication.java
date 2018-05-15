package com.selenium.test.cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.test.common.AGenericTest;
import com.selenium.test.pages.LandingPage;

/**
 ********************************************************************
 * Ensures application is being rendered correctly inside electron
 * 
 * @author Kyle Williamson
 * @version 1.0.0
 ********************************************************************
 */
public class TestCase_RenderApplication extends AGenericTest
{
   
   private LandingPage landingPage;

   @Override
   public void initialisePages()
   {
      landingPage = PageFactory.initElements(driver, LandingPage.class);
   }
   
   @Test
   public void hasPageRenderedCorrectly() {
      
      final String EXPECTED_VALUE = "Hello World";
      
      Assert.assertEquals(landingPage.container_Root.getText(), EXPECTED_VALUE);
   }

}

