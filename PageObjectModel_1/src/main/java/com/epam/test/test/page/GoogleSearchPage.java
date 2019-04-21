package com.epam.test.test.page;

import org.openqa.selenium.WebElement;
//Create a class containing methods where the locator values
// are declared without any attribute names
public class GoogleSearchPage {
    private WebElement q;  //Here's the Element q is declared without stating
    // any locator type. However, it automatically identifies whether it is id or name.

    public void searchFor(String text) {
        q.sendKeys(text);
        q.submit();
    }
}
