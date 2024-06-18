package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//img[@src='/web/images/orangehrm-logo.png?v=1711595107870']")
    WebElement logoVerify;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]")
    WebElement Admin;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
    WebElement PIM;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")
    WebElement leave;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]/span[1]")
    WebElement dashBoard;


    public void clickOnAdmin() {
        clickOnElement(Admin);
        CustomListeners.test.log(Status.PASS, "click on Admin " + Admin);
        Reporter.log("Click on Admin" + Admin.toString());
    }

    public void clickOnPIM() {
        clickOnElement(PIM);
        CustomListeners.test.log(Status.PASS, "Click on PIM" + PIM);
        Reporter.log("click on PIM" + PIM.toString());
    }

    public void clickOnLeave() {
        clickOnElement(leave);
        CustomListeners.test.log(Status.PASS, "click on Leave" + leave);
        Reporter.log("click on leave " + leave.toString());
    }

    public void clickOnDashBoard() {
        clickOnElement(dashBoard);
        CustomListeners.test.log(Status.PASS, "click on dashboard " + dashBoard);
        Reporter.log("click on dashboard" + dashBoard.toString());
    }


    }


