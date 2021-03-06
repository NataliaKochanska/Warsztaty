package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    private static WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="email")
    WebElement loginInput;

    @FindBy(name="password")
    WebElement passwordInput;

    @FindBy(id="submit-login")
    WebElement signInButton;

    public void loginAs(String email, String password) {
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);

        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        signInButton.click();
    }

}
