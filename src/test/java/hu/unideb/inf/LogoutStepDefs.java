package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogoutStepDefs extends AbstractStepDefs {

    @Given("I am on the inventory page")
    public void iAmOnTheInventoryPage() {
        String currentUrl = homePage.driver.getCurrentUrl();
        assertEquals("https://www.saucedemo.com/inventory.html", currentUrl, "Not on the inventory page");
    }

    @Then("I should be redirected to the login page")
    public void iShouldBeRedirectedToTheLoginPage() {
        String currentUrl = homePage.driver.getCurrentUrl();
        Assertions.assertEquals("https://www.saucedemo.com/", currentUrl, "Not redirected to the login page");
    }

}
