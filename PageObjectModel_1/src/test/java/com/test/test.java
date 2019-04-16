package com.test;

import com.page.GoogleSearchPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.PageFactory;

public class test {

    @Test
    public void startsWebDriver() {
        System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");

        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);

        page.searchFor("Selenium");
        driver.navigate().to("https://www.seleniumhq.org");
        Assert.assertTrue("title should start with Selenium - Web Browser Automation",
                driver.getTitle().startsWith("Selenium - Web Browser Automation"));

        driver.close();
        driver.quit();
    }
}
