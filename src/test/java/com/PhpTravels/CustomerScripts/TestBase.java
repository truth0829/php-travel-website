package com.PhpTravels.CustomerScripts;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {
	
    public static Properties prop = null;
    WebDriver driver;
    String driverPath = "C:\\Users\\Ann Tuitions\\Desktop\\selenium new\\PhpTravels\\driver\\\\chromedriver.exe";

 public static void TestBase() {
        try {
        	//Below line creates an object of Properties called 'prop'
            prop = new Properties();
          //Below line creates an object of FileInputStream called 'ip'. 
          //Give the path of the properties file which you have created
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
            //Below line of code will loa d the property file
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
@Parameters("browser")

  @BeforeClass
    public void onSetup(String browserName) {
	 Thread.currentThread().getStackTrace();
	 System.out.println("onSetup is called......");
	 
        TestBase(); // for loading the configurations
  

        if (browserName.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();

        }

        if (browserName.equals("firefox")) {
        	System.setProperty("webdriver.gecko.driver", driverPath);
            driver = new FirefoxDriver();

        }

    
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();   
    }
@AfterClass
public void teardown() {
	driver.quit();

}

}
