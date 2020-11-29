package pages;
//Page Object Model
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    //Fields to represent the elements - see refactor generic "clickLink"
    //private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    //methods to intereact with the methods
    //if your action changes the page you should now return a handle to the new page
    public LoginPage clickFormAuthentication(){
        //driver.findElement(formAuthenticationLink).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswor(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public DropdwonPage clickDropDown() {
        clickLink("Dropdown");
        return new DropdwonPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
