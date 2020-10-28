package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestB {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("*******************");
        System.out.println("launching chrome browser");
        driver = com.test.Browser.getBrowser("chrome");
        driver.manage().window().maximize();
    }

    @Test
    @Parameters("browserName")
    public void testGooglePageTitleInChrome(@Optional("chrome") String browserName) {
        System.out.println("Parameterized value is : " + browserName);
        driver.navigate().to("http://www.google.com");
        String strPageTitle = driver.getTitle();
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
    }

    @AfterClass
    public void tearDown() {
        if(driver!=null) {
            System.out.println("Closing chrome browser");
            driver.quit();
        }
    }
}

//C:\Users\cperez\gocode\src\github.com\selenium\SampleTestNg>java -cp C:\Users\cperez\gocode\src\github.com\selenium\SampleTestNg\lib\*;C:\Users\cperez\gocode\src\github.com\selenium\SampleTestNg\bin org.testng.TestNG testng.xml
//        ...
//        ... TestNG 6.14.3 by Cédric Beust (cedric@beust.com)
//        ...
//
//        *******************
//        launching chrome browser
//        Starting ChromeDriver 86.0.4240.22 (398b0743353ff36fb1b82468f63a3a93b4e2e89e-refs/branch-heads/4240@{#378}) on port 44262
//        Only local connections are allowed.
//        Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
//        ChromeDriver was started successfully.
//        Oct 27, 2020 10:08:43 PM org.openqa.selenium.remote.ProtocolHandshake createSession
//        INFO: Detected dialect: W3C
//        Closing chrome browser
//        PASSED: testGooglePageTitleInChrome
//
//        ===============================================
//        TestNG Test Group
//        Tests run: 1, Failures: 0, Skips: 0
//        ===============================================
//
//
//        ===============================================
//        Main Test Suite
//        Total tests run: 1, Failures: 0, Skips: 0
//        ===============================================
//
//
//        C:\Users\cperez\gocode\src\github.com\selenium\SampleTestNg>