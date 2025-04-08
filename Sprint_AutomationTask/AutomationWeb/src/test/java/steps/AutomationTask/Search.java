package steps.AutomationTask;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lc.com.pages.AutomationTask.HomePagewithSearchField;

public class Search {
    HomePagewithSearchField HomePageObj = new HomePagewithSearchField();
    @Given("User Search with a Valid Data")
    public void userSearchWithAValidData() {
        HomePageObj.SearchForProduct();
    }
    @When("Click on Search Result")
    public void clickOnSearchResult() {
        HomePageObj.ClickOnSuggestionData();
    }
    @Then("The Correct Data will Appear Successfully")
    public void theCorrectDataWillAppearSuccessfully() {
        HomePageObj.VerifyTheCorrectDataAppear();
    }


}
