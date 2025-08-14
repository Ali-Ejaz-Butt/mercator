package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CartPage;
import pages.ProductsPage;

public class ProductsSteps {
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Then("I land on the Products page successfully")
    public void iLandOnTheProductsPageSuccessfully() {
        Assert.assertTrue("Fail to navigate to Products page.", productsPage.isAt());
    }

    @When("I find and add the highest price item to the cart")
    public void iFindAndAddTheHighestPriceItemToTheCart() {
        productsPage.findAndAddHighestPriceItemToTheCart();
    }

    @When("I go to the cart")
    public void iGoToTheCart() {
        productsPage.clickShoppingCartButton();
        Assert.assertTrue("Fail to navigate to Cart page.", cartPage.isAt());
    }
}
