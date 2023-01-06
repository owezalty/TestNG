package techproed.tests.smoketest;

import org.testng.annotations.Test;
import techproed.pages.CreateCustomerPage;
import techproed.pages.EmployeeDefaultPage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class Day14_CustomerCreation {

    LoginPage loginPage = new LoginPage();
    EmployeeDefaultPage employeeDefaultPage = new EmployeeDefaultPage();
    CreateCustomerPage createCustomerPage = new CreateCustomerPage();

    @Test
    public void createCustomerAsEmployee(){
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        //calling the loginApplication method to log in
        loginPage.loginApplication("gino.wintheiser","%B6B*q1!TH");
        employeeDefaultPage.myOperationsDropdown.click();
        employeeDefaultPage.manageCustomers.click();

        createCustomerPage.createANewCustomer.click();

    }

}
