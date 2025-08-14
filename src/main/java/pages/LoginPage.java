package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@class='login_logo']")
    private WebElement loginLogo;

    public LoginPage() {
        super();
    }

    public boolean isAt() {
        try {
            String actual = waitForElementToBeVisible(loginLogo).getText().toLowerCase();
            return actual.equalsIgnoreCase("swag labs");
        } catch (Exception e) {
            return false;
        }
    }

    public void enterUserName(String username) {
        waitForElementToBeVisible(userName).sendKeys(username);
    }

    public void enterPassword(String pwd) {
        waitForElementToBeVisible(password).sendKeys(pwd);
    }

    public void clickLoginButton() {
        waitForElementToBeClickable(loginButton).click();
    }
}
