package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(css = "#ember28")
    WebElement pagesLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    boolean isDisplayed() {
        return false;
    }

    public boolean hasPagesLink(){
        return wait.until(ExpectedConditions.visibilityOf(pagesLink)).isDisplayed();
    }
}
