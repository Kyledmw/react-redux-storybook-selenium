package com.selenium.test.properties;

import java.io.IOException;

/**
 ********************************************************************
 * Interface for managing application properties
 * 
 * @author Kyle Williamson
 * @version 1.0.0
 ********************************************************************
 */
public interface IPropertiesManager
{
   /**
    * Initialize properties provided in resource files
    * 
    * @throws IOException
    */
   void initialiseProperties() throws IOException;
}

