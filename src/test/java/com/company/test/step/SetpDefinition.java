package com.company.test.step;

import com.company.test.driver.BrowserDriver;
import com.company.test.page.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.ArrayList;
import java.util.List;

public class SetpDefinition extends BrowserDriver{

    private BrowserDriver base;
    private LoginPage page;

    public SetpDefinition(BrowserDriver driver) {
        this.base = driver;
    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        System.out.println("I navigate to the login page");
        System.out.println("The base is: "+base.getStepInfo());

        base.chromeDriver.get("http://www.executeautomation.com/demosite/Login.html");
//        base.ieDriver.get("http://www.executeautomation.com/demosite/Login.html");

        Thread.sleep(2000);
//        LoginPage.implicitWait(base.chromeDriver);
    }

    @And("^I enter the following details for login$")
    public void iEnterTheFollowingDetailsForLogin(DataTable table) throws Throwable {
        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);
        page = new LoginPage(base.chromeDriver);
        for(User user : users) {
            page.login(user.username, user.password);
        }
    }

    public class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}
