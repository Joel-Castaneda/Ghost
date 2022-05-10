package Tests;

import Pages.HomePage;
import Pages.SignUpPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    protected SignUpPage signin;
    protected HomePage home;

    @Before
    public void beforeTest() {
        driver = new ChromeDriver();

        signin = new SignUpPage(driver);

        home = new HomePage(driver);
    }

    @After
    public void cleanTest() {
        driver.quit();
    }

}
