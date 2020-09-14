package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class LoginStepDefs {

    ExcelUtil excelUtil=new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA1-short");

    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("the user logged in with the username and password of the {int} of excelfile")
    public void the_user_logged_in_with_the_username_and_password_of_the_of_excelfile(int rowIndex) {
        LoginPage loginPage=new LoginPage();
        String username = excelUtil.getCellData(rowIndex, 0);
        String password = excelUtil.getCellData(rowIndex, 1);

        loginPage.login(username,password);
    }

    @Then("the user fullname should be same with the {int} of excelfile")
    public void the_user_fullname_should_be_same_with_the_of_excelfile(int rowIndex) {
        DashboardPage dashboardPage=new DashboardPage();
        BrowserUtils.waitFor(2);
        String actualFullname = dashboardPage.getUserName();

        String firstName = excelUtil.getCellData(rowIndex, 2);
        String lastName = excelUtil.getCellData(rowIndex, 3);
        String expectedFullname=firstName+" "+lastName;

        Assert.assertEquals(expectedFullname, actualFullname);

    }

}
