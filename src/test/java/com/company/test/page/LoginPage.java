package com.company.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "username")
    public WebElement txtUsername;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.NAME, using = "login")
    public WebElement btnLogin;

    public void login(String txtUsername, String txtPassword) {
        this.txtUsername.sendKeys(txtUsername);
        this.txtPassword.sendKeys(txtPassword);
    }

    public void clickLogin() {
        this.btnLogin.submit();
    }
}
