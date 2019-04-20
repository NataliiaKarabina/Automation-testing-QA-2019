package com.epam.test.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By signInButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By emailAdress = By.xpath("//*[@id=\"email\"]");
    By password = By.xpath("//*[@id=\"passwd\"]");
    By loginButton = By.name("SubmitLogin");
    By womenCategoryButton = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButtonSignIn() {
        driver.findElement(signInButton).click();
    }

    public void typeEmailAdress(String email) {
        driver.findElement(emailAdress).sendKeys(email);
    }

    public void typePassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickOnWomenCategory() {
        driver.findElement(womenCategoryButton).click();
    }

}
