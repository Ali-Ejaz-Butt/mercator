package stepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CartPage;
import utils.ScenarioContext;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Then("I should see the selected highest price item in the cart")
    public void iShouldSeeTheSelectedHighestPriceItemInTheCart() {
        String expectedItemPrice = ScenarioContext.getInstance().getContext("itemPrice").toString().replace("$", "");
        String expectedItemName = (String) ScenarioContext.getInstance().getContext("itemName");

        Assert.assertEquals("Added Item name not matching.", expectedItemName, cartPage.getItemName());
        Assert.assertEquals("Added Item price not matching.", Double.valueOf(expectedItemPrice), Double.valueOf(cartPage.getItemPrice().replace("$", "")));
        Assert.assertEquals("There should only be 1 item present in a cart.", 1, cartPage.getNumberOfItems());
    }
}
