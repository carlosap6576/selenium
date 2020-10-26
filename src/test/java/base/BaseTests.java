package base;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.List;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseTests {
    private WebDriver driver;

    protected HomePage homePage;

    public static final String URL = "http://localhost:4444/wd/hub";
    @BeforeClass
    public void setUp() throws MalformedURLException {
        //https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.html
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
        DesiredCapabilities caps = new DesiredCapabilities();
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(URL), chromeOptions);
        driver.get("https://the-internet.herokuapp.com");
        System.out.println(driver.getTitle());



        homePage = new HomePage(driver);

        //driver.manage().window().setSize(new Dimension(375, 812));
        //Find only one (the first one)
        // WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        // inputLink.click();

        //Multiple Items
        //List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.println(links.size());

        //find an element that does not exist
        //System.out.println(driver.getTitle());


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        //driver.close();

    }

//    public static void main(String args[]){
//        BaseTests test = new BaseTests();
//        test.setUp();
//    }
}
