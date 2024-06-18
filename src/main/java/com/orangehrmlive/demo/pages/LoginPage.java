package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

public class LoginPage extends Utility {
    //locators

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")
    WebElement logIn;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement textLocator;

    public void enterUserName(String name) {
        Reporter.log("Click on UserName" + userName.toString());
        sendTextToElement(userName, "Admin");
        CustomListeners.test.log(Status.PASS, "Enter UserName " + userName);
    }


    public void enterPassword(String password) {
        Reporter.log("Click on UserName" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on Login" + logIn.toString());
        clickOnElement(logIn);
        CustomListeners.test.log(Status.PASS, "click on Login " + logIn);
    }

    public void loginPanelTextLocators() {
        Reporter.log("Click on Login" + logIn.toString());
        CustomListeners.test.log(Status.PASS, "click on Login " + logIn);
        List<WebElement> panel = driver.findElements(By.className("oxd-main-menu-item"));
        for (WebElement e : panel) {
            System.out.println(e.getText());
        }
    }

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    WebElement userLogo;

    public void clickOnUserProfileLogo() {
        mouseHoverToElementAndClick(userLogo);
        Reporter.log("Click on User Profile logo" + userLogo.toString());
        CustomListeners.test.log(Status.PASS, "Click on user logo" + userLogo);

    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;

    public void mouseHoverAndClickOnLogout() {
        mouseHoverToElementAndClick(logout);
        Reporter.log("Click on Logout" + logout.toString());
        CustomListeners.test.log(Status.PASS, "Click on logout" + logout);

    }

    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='Login']")
    WebElement verifLogin;

    public void verifyLoginPanel() {
        String expected = "Login";
        String actual = (verifLogin).getText();
        Assert.assertEquals(actual, expected);
        Reporter.log("verify login panel" + verifLogin.toString());
        CustomListeners.test.log(Status.PASS, "Verify login panel " + verifLogin);

    }

    public void verifyRequired() {
        String expected = "Required";
        String actual = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/span[1]")).getText();
        Assert.assertEquals(actual, expected);

    }

}
