import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidSignIn {
    @Test
    public void verifyValidLogin() {
        System.setProperty("webdriver.chrome.driver", "F:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
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
