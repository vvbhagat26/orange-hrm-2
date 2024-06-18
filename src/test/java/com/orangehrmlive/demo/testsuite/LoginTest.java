package com.orangehrmlive.demo.testsuite;


import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    /*
    1. verifyUserShouldLoginSuccessFully()
     Enter username
     Enter password
     Click on Login Button

     */
    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldLoginSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
    }

/*
2. verifyThatTheLogoDisplayOnHomePage()
 Login To The application
 Verify Logo is Displayed
 */


    @Test(groups = {"smoke", "regression"})
    public void verifyThatTheLogoDisplayOnHomePage() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        Thread.sleep(2000);
        boolean log = driver.findElement(By.xpath("//img[@src='/web/images/orangehrm-logo.png?v=1711595107870']")).isDisplayed();
        Assert.assertTrue(log);
    }

    /**
     * 3. verifyUserShouldLogOutSuccessFully()
     *  Login To The application
     *  Click on User Profile logo
     *  Mouse hover on "Logout" and click
     *  Verify the text "Login Panel" is displayed
     */

    @Test(groups = {"regression"})
    public void verifyUserShouldLogOutSuccessFully(){
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        loginPage.clickOnUserProfileLogo();
        loginPage.mouseHoverAndClickOnLogout();
        loginPage.verifyLoginPanel();
    }

    /**
     * 4. verifyErrorMessageWithInvalidCredentials()
     *  Enter username <username>
     *  Enter password <password>
     *  Click on Login Button
     *  Verify Error message Required
     */
    @Test(groups = {"regression"})
    public void verifyErrorMessageWithInvalidCredentials(){
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickOnLoginButton();
        loginPage.verifyRequired();

    }
}
