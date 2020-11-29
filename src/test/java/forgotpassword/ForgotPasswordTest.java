package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void testForgotPassword() {
        String expectedValue = "Your e-mail's been sent!";
        var forgotPasswordPage = homePage.clickForgotPasswor();
        forgotPasswordPage.setEmail("carlosap@gmail.com");

        var emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();
        var results = emailSentPage.getContentText();
        assertTrue(results.equals(expectedValue), "Failed to retrieve expected value: " + expectedValue);

    }
}
