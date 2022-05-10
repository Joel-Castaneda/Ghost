package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{

    @FindBy(css ="#ember7")
    WebElement user;

    @FindBy(css ="#ember9")
    WebElement passwrd;

    @FindBy(css ="#ember11")
    WebElement btnsignup;

    @FindBy(css = ".main-error")
    WebElement inexistantUs;

    @FindBy(className = "main-error")
            WebElement noPassword;


    WebDriverWait wait = new WebDriverWait(driver, 60);


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get("http://localhost:2368/ghost/");
    }

    public void correctLogin(String email, String password){
        wait.until(ExpectedConditions.visibilityOf(user));
        user.sendKeys(email);
        passwrd.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(btnsignup));
        btnsignup.click();
    }

    public void noUser(String email, String password){
        wait.until(ExpectedConditions.visibilityOf(user));
        user.sendKeys(email);
        passwrd.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(btnsignup));
        btnsignup.click();
        if(wait.until(ExpectedConditions.elementToBeClickable(inexistantUs)).isDisplayed()){
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }
    }

    public void setNoPassword(String email, String password){
        wait.until(ExpectedConditions.visibilityOf(user));
        user.sendKeys(email);
        passwrd.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(btnsignup));
        btnsignup.click();
        if(wait.until(ExpectedConditions.elementToBeClickable(noPassword)).isDisplayed()){
            System.out.println("Prueba exitosa");
        } else {
            System.out.println("Prueba fallida");
        }
    }
}
