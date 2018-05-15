package com.selenium.test.common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.selenium.test.driver.IWebDriverFactory;
import com.selenium.test.driver.WebDriverApplicationStarter;
import com.selenium.test.driver.WebDriverFactory;
import com.selenium.test.properties.IPropertiesManager;
import com.selenium.test.properties.PropertiesManager;

/**
 ********************************************************************
 * Provides boilerplate and initial setup for each web driver test case.
 * 
 * @author Kyle Williamson
 * @version 1.0.0
 ********************************************************************
 */
public abstract class AGenericTest
{
   
   private static final String BROWSER_NAME_PARAM = "browserName";
   private static final String BASE_URL_PARAM = "baseURL";
   
   private static IWebDriverFactory driverFactory;
   private static IPropertiesManager propertiesManager;
   
   protected static WebDriver driver;
   
   /**
    * Initialize objects required for each test case setup
    * 
    * @throws IOException IO error reading in properties file
    */
   private void init() throws IOException {
      if(driverFactory == null) {
         driverFactory = new WebDriverFactory();
      }
      if(propertiesManager == null) {
         propertiesManager = new PropertiesManager();
         propertiesManager.initialiseProperties();
      }
   }
   
   @BeforeMethod
   @Parameters({BROWSER_NAME_PARAM, BASE_URL_PARAM})
   public void beforeMethod(String browserName, String baseURL) throws IOException {
      init();
      Browsers browser = Browsers.valueOf(browserName);
      switch(browser) {
         case chrome: {
            driver = driverFactory.createChromeDriver();
            break;
         }
         case firefox: {
            driver = driverFactory.createFireFoxDriver();
            break;
         }
         case edge: {
            driver = driverFactory.createEdgeDriver();
            break;
         }
         case ie: {
            driver = driverFactory.createIEDriver();
            break;
         }
         case electron:
         default: {
            driver = driverFactory.createElectronDriver();
            break;
         }
      }
      new WebDriverApplicationStarter(driver).start();
      initialisePages();
   }

   @AfterMethod
   public void afterMethod(ITestResult result)
   {
      driver.close();
      driver.quit();
   }
   
   /**
    * Implemented by each specific test case to allow for the initialization of pages required for that test
    */
   public abstract void initialisePages();
}

