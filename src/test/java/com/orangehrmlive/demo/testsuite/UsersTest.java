package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class UsersTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    AddUserPage addUserPage;
    ViewSystemUsersPage viewSystemUsersPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        addUserPage = new AddUserPage();
        viewSystemUsersPage = new ViewSystemUsersPage();
    }

    /**
     * 1.adminShouldAddUserSuccessFully().
     * Login to Application
     * click On "Admin" Tab
     * Verify "System Users" Text
     * click On "Add" button
     * Verify "Add User" Text
     * Select User Role "Admin"
     * enter Employee Name "Ananya Dash"
     * enter Username
     * Select status "Disable"
     * enter psaaword
     * enter Confirm Password
     * click On "Save" Button
     * verify message "Successfully Saved"
     */
    @Test(groups = {"sanity", "regression"})
    public void adminShouldAddUserSuccessFully() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        addUserPage.clickOnAddUser();
        viewSystemUsersPage.verifyAddUserText();
        //  addUserPage.clickOnAddUser();
        addUserPage.clickOnUserRole();
        addUserPage.enterEmployeeName();
        addUserPage.enterUserName();
        addUserPage.clickOnStatus();
        addUserPage.enterPassword();
        addUserPage.enterConfirmPassword();
        addUserPage.clickOnSave();

    }

    /**
     * 2. searchTheUserCreatedAndVerifyIt().
     * Login to Application
     * click On "Admin" Tab
     * Verify "System Users" Text
     * Enter Username
     * Select User Role
     * Select Satatus
     * Click on "Search" Button
     * Verify the User should be in Result list.
     */
    @Test(groups = {"smoke", "regression"})
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.enterSystemUserName();
        viewSystemUsersPage.selectSystemUserRole();
        viewSystemUsersPage.selectSystemStatus();
        Thread.sleep(2000);

        viewSystemUsersPage.searchButtonClick();
        viewSystemUsersPage.verifyUserResultList();

    }

    /**
     * 3. verifyThatAdminShouldDeleteTheUserSuccessFully().
     * Login to Application
     * click On "Admin" Tab
     * Verify "System Users" Text
     * Enter Username
     * Select User Role
     * Select Satatus
     * Click on "Search" Button
     * Verify the User should be in Result list.
     * Click on Check box
     * Click on Delete Button
     * Popup will display
     * Click on Ok Button on Popup
     * verify message "Successfully Deleted
     */
    @Test(groups = {"regression"})
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.enterSystemUserName();
        viewSystemUsersPage.selectSystemUserRole();
        viewSystemUsersPage.selectSystemStatus();
        Thread.sleep(2000);
        viewSystemUsersPage.searchButtonClick();
        viewSystemUsersPage.verifyUserResultList();
        viewSystemUsersPage.chechOnChechbox();
        viewSystemUsersPage.clickOnDeleteButton();
        Thread.sleep(2000);
        viewSystemUsersPage.clickOnDeletePopUp();
        viewSystemUsersPage.verifyUserSuccessfullyDelete();
    }

    /**
     * 4. searchTheUserAndVerifyTheMessageRecordFound().
     * Login to Application
     * click On "Admin" Tab
     * Verify "System Users" Text
     * Enter Username <username>
     * Select User Role <userRole>
     * Enter EmployeeName <employeeName>
     * Select Satatus <status>
     * Click on "Search" Button
     * verify message "(1) Record Found"
     * Verify username <username>
     * Click on Reset Tab
     */
    @Test(groups = {"regression"}, dataProvider = "DataSet", dataProviderClass = TestData.class)
    public void searchTheUserAndVerifyTheMessageRecordFound(String username, String userrole, String employeeName, String status) {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        homePage.clickOnAdmin();
        viewSystemUsersPage.verifySystemUserText();
        viewSystemUsersPage.enterSystemUserName1(username);
        viewSystemUsersPage.selectSystemUserRole1(userrole);
        viewSystemUsersPage.selectSystemStatus1(status);
        viewSystemUsersPage.selectEmployeeName(employeeName);
        viewSystemUsersPage.searchButtonClick();
        viewSystemUsersPage.verifyRecordFind();
        viewSystemUsersPage.resetClick();
    }

}
