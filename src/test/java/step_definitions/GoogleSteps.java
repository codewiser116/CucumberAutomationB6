package step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleSteps {

    WebDriver driver = Driver.getDriver();
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.get("https://www.google.com/");
    }

    @When("user enters {string} in the search box")
    public void user_enters_in_the_search_box(String product) {
        googleSearchPage.searchBox.sendKeys(product);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        googleSearchPage.searchButton.click();
    }

    @Then("verify results contain {string}")
    public void verify_results_contain(String product) {
        for (int i = 0; i < googleSearchPage.searchResults.size(); i++) {
            googleSearchPage.searchResults.get(i);
            if (!googleSearchPage.searchResults.get(i).getText().toLowerCase().contains(product)){
                System.out.println(googleSearchPage.searchResults.get(i).getText());
            }
        }

        if (product.equalsIgnoreCase("washington")){
            Assert.assertTrue(false);
        }
    }

}
