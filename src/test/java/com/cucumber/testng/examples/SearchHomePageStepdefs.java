package com.cucumber.testng.examples;

import cucumber.api.Format;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.bigtester.ate.GlobalUtils;

import static org.testng.Assert.assertEquals;
/**
 * Created by amit.rawat on 21/12/15.
 */
public class SearchHomePageStepdefs extends BaseStepDefs{

   
    @Before
    public void beforescenario(Scenario scenario){
        this.scenario = scenario;
        System.out.println("This is before Scenario: " + scenario.getId().toString());
    }


    @After
    public void after(Scenario scenario) {
    	super.cleanUp();
        System.out.println("This is after Scenario: " + scenario.getName().toString());
    }

    
    @Given("^\"([^\"]*)\" of \"([^\"]*)\"$")
    public void of(String jobTitle, String location) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	//super.runCucumberStep("stepOpenHomePage", "applyQAJob", "easyApply");
    }

    @Given("^the following search data$")
    public void the_following_search_data(List<Map<String,String>> arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    	System.out.println(arg1.toString());
    }

    @When("^type in \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_in_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^click \"([^\"]*)\" button$")
    public void click_button(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^there should be (\\d+) non-ads jobs listed$")
    public void there_should_be_non_ads_jobs_listed(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

	
}
