package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class DashboardPage extends Utility {

    //locators
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]/span[1]")
    WebElement dashBoard1;

    public void clickOnDashBoard1() {
        clickOnElement(dashBoard1);
        Reporter.log("click on dashboard" + dashBoard1.toString());
        CustomListeners.test.log(Status.PASS, "click on dashboard " + dashBoard1);
    }


}
