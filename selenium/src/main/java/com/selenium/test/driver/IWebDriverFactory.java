package com.selenium.test.driver;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

/**
 ********************************************************************
 * Interface that provides factory methods for each browser
 * 
 * @author Kyle Williamson
 * @version 1.0.0
 ********************************************************************
 */
public interface IWebDriverFactory
{
   WebDriver createElectronDriver() throws IOException;
   WebDriver createChromeDriver();
   WebDriver createFireFoxDriver();
   WebDriver createEdgeDriver();
   WebDriver createIEDriver();
}

