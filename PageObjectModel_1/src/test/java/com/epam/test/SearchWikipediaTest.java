package com.epam.test;

import com.epam.test.test.page.GoogleSearchPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class SearchWikipediaTest {
    @Test
    public void startsWebDriver() {
        System.setProperty("webdriver.chrome.driver", new File("drivers/chromedriver.exe").getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");

        GoogleSearchPage page = PageFactory.initElements(driver, GoogleSearchPage.class);

        page.searchFor("Wikipedia");
        driver.navigate().to("https://www.wikipedia.org");
        Assert.assertTrue("title should start with Wikipedia",
                driver.getTitle().startsWith("Wikipedia"));

        driver.close();

    }

}
