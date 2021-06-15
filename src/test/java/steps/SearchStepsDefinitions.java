package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.SearchPage;

public class SearchStepsDefinitions {

    private BaseStepsDefinitions context;
    private WebDriver browser;
    private SearchPage searchPage;

    public SearchStepsDefinitions(BaseStepsDefinitions context) {
        this.context = context;
        browser = this.context.browser;
        searchPage = new SearchPage(browser);
    }

    @When("^I search by item (.*)$")
    public void search(String item){
        searchPage.searchItem(item);
        searchPage.clickOnSearch();
    }

    @Then("^should I view the search page with searched (.*)$")
    public void returnSearch(String item){
        searchPage.returnItem(item);
    }

    @And("^I click Image View More to see the item information$")
    public void moreItemInformation(){
        searchPage.clickOnImageViewMore();
    }

    @Then("^should I view the item page with all the information by item (.*)$")
    public void returnMoreItemInformation(String name){
        searchPage.informationItem(name);
    }
}
