package hu.unideb.inf;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class LoginStepDefs extends AbstractStepDefs {

    @Then("I should be redirected to the inventory page")
    public void openInventoryPage() {
        homePage.openInventoryPage();
    }

    @Then("an {string} should be displayed")
    public void an_error_message_should_be_displayed_saying(String expectedMessage) {
        String actualMessage = homePage.getErrorMessage();
        expectedMessage = "Epic sadface: Username and password do not match any user in this service";
        Assertions.assertEquals(expectedMessage, actualMessage);
    }


}
