package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class itemPurchaseStepDefs extends AbstractStepDefs {

    // Add the item to the cart
    @Given("the {string} is added to the cart")
    public void theItemIsAddedToTheCart(String itemName) {
        homePage.addItemToCart(itemName);
    }

    // Check that the price matches the expected total
    @Then("the price should read {string}")
    public void thePriceShouldRead(String expectedTotal) {
        String actualTotal = homePage.getTotalPrice();
        Assertions.assertEquals(expectedTotal, actualTotal, "Total price does not match.");
    }

}
