package stepDefs;

import config.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utils.Driver;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("I navigate to Saucedemo login page")
    public void iNavigateToSaucedemoLoginPage() {
        Driver.getDriver().get(ConfigReader.get("baseUrl"));
        Assert.assertTrue("Fail to navigate to Sauce Demo login page.", loginPage.isAt());
    }

    @When("I log in with valid credentials")
    public void iLogInWithValidCredentials() {
        String userName = ConfigReader.get("username");
        String password = ConfigReader.get("password");
        loginPage.enterUserName(userName);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
}
