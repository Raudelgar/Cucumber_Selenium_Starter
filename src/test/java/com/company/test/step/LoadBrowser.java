package com.company.test.step;

import com.company.test.driver.BrowserDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoadBrowser extends BrowserDriver {

    private BrowserDriver base;

    public LoadBrowser(BrowserDriver base) {
        this.base = base;
    }

    @Before
    public void setUpTest() {
        System.out.println("Opening the browser");
        base.setStepInfo("Chrome base");
//        base.setStepInfo("IExplorer base");

        System.setProperty("webdriver.chrome.driver","../ChromeDriver(v2.35)/chromedriver.exe");
        base.chromeDriver = new ChromeDriver();

//        System.setProperty("webdriver.ie.base","../IE(v64)/IEDriverServer.exe");
//        base.ieDriver = new InternetExplorerDriver();
    }

    @After
    public void tearDownTest() {
        System.out.println("Closing the browser");
        base.chromeDriver.quit();
//        base.ieDriver.quit();
    }
}
