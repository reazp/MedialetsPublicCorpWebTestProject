package com.medilets.base;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * User: reaz
 * 
 */
public class MedialetsBase extends WebDriverWrapper {

    @BeforeClass
    public static void setApplicationController() {
          driver = new FirefoxDriver();             
    }

    @Before
    public void setUp() {
    	driver.get("http://muse.medialets.com/signup");
    }
    @AfterClass
    public static void tearDown(){
    	driver.close();
    }
   
}
