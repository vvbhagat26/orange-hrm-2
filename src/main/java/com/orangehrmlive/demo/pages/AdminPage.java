package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AdminPage extends Utility {
    //locators

    @CacheLookup
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[1]/span[1]")
    WebElement userManagement;

    @CacheLookup
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[2]")
    WebElement job;

    @CacheLookup
    @FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[3]/span[1]")
    WebElement organization;

    public void clickOnUserManagement() {
        clickOnElement(userManagement);
        Reporter.log("click on userManagement " + userManagement.toString());
        CustomListeners.test.log(Status.PASS, "click on userManagement " + userManagement);
    }

    public void clickOnJob() {
        clickOnElement(job);
        Reporter.log("Click on job " + job.toString());
        CustomListeners.test.log(Status.PASS, "click on job " + job);
    }

    public void clickOnOrganization() {
        clickOnElement(organization);
        Reporter.log("click on organization" + organization.toString());
        CustomListeners.test.log(Status.PASS, "click on organization " + organization);
    }
}
