package com.him.google.stepDefinitions;

import com.him.google.pages.GooglePage;
import com.him.utilities.BrowserUtils;
import com.him.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPage extends BrowserUtils {
GooglePage googlePage= new GooglePage();
    @Given("User is on the main page")
    public void user_is_on_the_main_page() {
       driver.get(ConfigurationReader.getProperty("googleUrl"));
       waitForTitleToEqual("Google");
    }

    @When("User inputs {string} and presses Enter")
    public void userInputsAndPressesEnter(String searchItem) {
        fillInput(googlePage.searchBox, searchItem);
        clickEnterOnInput(googlePage.searchBox);

    }


    @Then("Search result contains {string}")
    public void search_result_contains(String expectedResult) {
        Assert.assertTrue(getElementsTexts(googlePage.searchResults).get(0).toLowerCase().contains(expectedResult));
    }



}
