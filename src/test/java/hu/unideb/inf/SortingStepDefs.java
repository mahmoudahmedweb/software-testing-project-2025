package hu.unideb.inf;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class SortingStepDefs extends AbstractStepDefs {
    @When("I select {string} from the filter dropdown")
    public void i_select_from_the_filter_dropdown(String sortingOption) {
        homePage.selectFilterOption(sortingOption);
    }

    @Then("all items should appear sorted by price in ascending order")
    public void theItemsShouldBeSortedByPriceInAscendingOrder() {
        List<Double> prices = homePage.getItemPrices();
        List<Double> sortedPrices = new ArrayList<>(prices);
        sortedPrices.sort(Comparator.naturalOrder());
        Assertions.assertEquals(sortedPrices, prices, "Items are not sorted by price (low to high)");
    }

    @Then("the items should be sorted by price in descending order")
    public void theItemsShouldBeSortedByPriceInDescendingOrder() {
        List<Double> prices = homePage.getItemPrices();
        List<Double> sortedPrices = new ArrayList<>(prices);
        sortedPrices.sort(Comparator.reverseOrder());
        Assertions.assertEquals(sortedPrices, prices, "Items are not sorted by price (high to low)");
    }
}
