package com.epam.test;

import com.epam.test.test.page.LoginPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class TestValidSignIn {
    @Test
    public void verifyValidLogin() {
        System.setProperty("webdriver.chrome.driver", new File("drivers/chromedriver.exe").getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

        LoginPage login = new LoginPage(driver);
        login.clickOnButtonSignIn();
        login.typeEmailAdress("Natalie_light@ukr.net");
        login.typePassword("30032019");
        login.clickOnLoginButton();
        login.clickOnWomenCategory();

        driver.quit();
    }

}
