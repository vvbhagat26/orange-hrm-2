package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddUserPage extends Utility {

    //locators
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]")
    WebElement addUser;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement dropDown;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement employee;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[2]/input[1]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")
    WebElement status;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]")
    WebElement save;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]")
    WebElement cancel;

    public void clickOnAddUser() {
        clickOnElement(addUser);
        CustomListeners.test.log(Status.PASS, "Click on add " + addUser);
        Reporter.log("Click on addUser " + addUser.toString());
    }

    public void clickOnUserRole() {
        clickOnElement(dropDown);
        CustomListeners.test.log(Status.PASS, "Click on UserRole DropDown " + dropDown);
        Reporter.log("Click on userRole " + dropDown.toString());
    }

    public void enterEmployeeName() {
        sendTextToElement(employee, "Ananya Dash");
        CustomListeners.test.log(Status.PASS, "enter employee name " + employee);
        Reporter.log("enter employee name " + employee.toString());
    }

    public void enterUserName() {
        sendTextToElement(userName, "Ananya");
        CustomListeners.test.log(Status.PASS, "enter username" + userName);
        Reporter.log("enter user name " + userName.toString());
    }

    public void clickOnStatus() {
        clickOnElement(status);
        CustomListeners.test.log(Status.PASS, "click on status" + status);
        Reporter.log("click on status " + status.toString());
    }

    public void enterPassword() {
        sendTextToElement(password, "admin123");
        CustomListeners.test.log(Status.PASS, "enter password" + password);
        Reporter.log("enter password " + password.toString());
    }

    public void enterConfirmPassword() {
        sendTextToElement(confirmPassword, "admin123");
        CustomListeners.test.log(Status.PASS, "enter password" + confirmPassword);
        Reporter.log("enter password " + confirmPassword.toString());
    }

    public void clickOnSave() {
        clickOnElement(save);
        CustomListeners.test.log(Status.PASS, "click on save" + save);
        Reporter.log("click on save" + save.toString());
    }

    public void clickOnCancel() {
        clickOnElement(cancel);
        CustomListeners.test.log(Status.PASS, "click on cancel " + cancel);
        Reporter.log("click on cancel " + cancel.toString());
    }

}
