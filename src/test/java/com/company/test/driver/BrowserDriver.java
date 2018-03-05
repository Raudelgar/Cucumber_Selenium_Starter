package com.company.test.driver;

import org.openqa.selenium.WebDriver;

public class BrowserDriver {

    public WebDriver chromeDriver;
    public WebDriver ieDriver;
    private String stepInfo;

    public String getStepInfo() {
        return stepInfo;
    }

    public void setStepInfo(String stepInfo) {
        this.stepInfo = stepInfo;
    }
}
