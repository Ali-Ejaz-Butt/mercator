package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@data-test='title']")
    private WebElement cartPageTitle;

    @FindBy(xpath = "//*[@data-test='inventory-item']")
    private List<WebElement> items;

    @FindBy(xpath = "//*[@data-test='inventory-item-name']")
    private WebElement itemName;

    @FindBy(xpath = "//*[@data-test='inventory-item-price']")
    private WebElement itemPrice;

    public CartPage() {
        super();
    }

    public boolean isAt() {
        try {
            String actual = waitForElementToBeVisible(cartPageTitle).getText().toLowerCase();
            return actual.equalsIgnoreCase("your cart");
        } catch (Exception e) {
            return false;
        }
    }

    public String getItemName() {
        return waitForElementToBeVisible(itemName).getText();
    }

    public int getNumberOfItems() {
        return items.size();
    }

    public String getItemPrice() {
        return waitForElementToBeVisible(itemPrice).getText();
    }
}
