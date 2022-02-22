package com.him.google.stepDefinitions;

import com.him.google.pages.ApplePage;
import com.him.utilities.BrowserUtils;
import com.him.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;

public class Apple extends BrowserUtils {

    ApplePage appg = new ApplePage();
    private String title;

    @Given("user is on a {string} page")
    public void user_is_on_a_page(String targetPage) {
        driver.get(ConfigurationReader.getProperty(targetPage));

    }

    @Then("user should be on {string} page")
    public void user_should_be_on_page(String expectedTitle) {
        waitForTitleToEqual(expectedTitle); //not will be in the report
        Assert.assertEquals(getTitle(), expectedTitle, "Actual URL is not " + expectedTitle);
        this.title=expectedTitle;
    }

    @Then("user should be able to see following list included in the menu items")
    public void user_should_be_able_to_see_following_list_included_in_the_menu_items(List<String> expectedItems) {
        Assert.assertTrue("Actual menu items do not include expected items", getElementsTexts(appg.menuItems).containsAll(expectedItems));
    }

    @When("user clicks menu item {string}")
    public void user_clicks_menu_item(String menuItem) {
        clickButton(appg.getMenuItem(menuItem));
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String buyIphone13ProBtn) {
    clickButton(appg.buyIphone13ProBtn);
    }

    @Then("user should be able to see following available options")
    public void user_should_be_able_to_see_following_available_options() {
        System.out.println("Available options are :iPhone 13 Pro , iPhone 13 Pro Max ");
    }

    @When("user selects {string} product")
    public void user_selects_product(String string) {
        System.out.println("user selected Iphone13Pro");
    }

    @Then("user should see following available colors")
    public void user_should_see_following_available_colors(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("User sees: Sierra Blue |\n" +
                "      | Silver      |\n" +
                "      | Gold        |\n" +
                "      | Graphite   ");
    }

    @When("user selects {string} color")
    public void user_selects_color(String string) {
        System.out.println("User selects: Silver");
    }

    @Then("user should see following available capacities")
    public void user_should_see_following_available_capacities(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("following capacities:");
    }

    @When("user selects capacity of {string}")
    public void user_selects_capacity_of(String string) {

    }

    @Then("user should see following available carrier options")
    public void user_should_see_following_available_carrier_options(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("user selects {string} carrier option")
    public void user_selects_carrier_option(String string) {

    }

    @Then("user should see following available trade in options")
    public void user_should_see_following_available_trade_in_options(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("user selects {string} trade in option")
    public void user_selects_trade_in_option(String string) {

    }

    @Then("user should see following available payment options")
    public void user_should_see_following_available_payment_options(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("user selects {string} payment option")
    public void user_selects_payment_option(String string) {

    }

    @Then("user should see following available coverage options")
    public void user_should_see_following_available_coverage_options(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("user selects {string} coverage option")
    public void user_selects_coverage_option(String string) {

    }

    @Then("user should see charge amount as {string}")
    public void user_should_see_charge_amount_as(String string) {

    }

    @Then("user should be able to see {string} button")
    public void user_should_be_able_to_see_button(String string) {

    }


}
