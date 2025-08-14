package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ScenarioContext;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//*[@data-test='title']")
    private WebElement productsPage;

    @FindBy(xpath = "//*[@data-test='inventory-item']")
    private List<WebElement> items;

    @FindBy(xpath = "//*[@data-test='inventory-item-price']")
    private List<WebElement> prices;

    @FindBy(xpath = "//*[@data-test='inventory-item-name']")
    private List<WebElement> names;

    @FindBy(xpath = "//*[@class='btn btn_primary btn_small btn_inventory ']")
    private List<WebElement> addToCartButtons;

    @FindBy(xpath = "//*[@data-test='shopping-cart-link']")
    private WebElement shoppingCartButton;

    private final ScenarioContext context = ScenarioContext.getInstance();

    public ProductsPage() {
        super();
    }

    public boolean isAt() {
        try {
            String actual = waitForElementToBeVisible(productsPage).getText().toLowerCase();
            return actual.equalsIgnoreCase("products");
        } catch (Exception e) {
            return false;
        }
    }

    public void findAndAddHighestPriceItemToTheCart() {
        double highestPrice = 0;
        int index = getIndexOfHighestPriceItem(highestPrice);

        context.setContext("itemName", names.get(index).getText());
        context.setContext("itemPrice", prices.get(index).getText());

        waitForElementToBeClickable(addToCartButtons.get(index)).click();
    }

    private int getIndexOfHighestPriceItem(double highestUnitPrice) {
        int index = 0;
        for (int i = 0; i < prices.size(); i++) {
            String unitPriceText = prices.get(i).getText().replace("$", "");
            double unitPrice = Double.parseDouble(unitPriceText);

            if (unitPrice > highestUnitPrice) {
                highestUnitPrice = unitPrice;
                index = i;
            }
        }
        return index;
    }

    public void clickShoppingCartButton() {
        waitForElementToBeClickable(shoppingCartButton).click();
    }
}
