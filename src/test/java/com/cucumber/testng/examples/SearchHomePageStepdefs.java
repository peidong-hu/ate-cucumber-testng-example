package com.cucumber.testng.examples;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import org.bigtester.ate.model.cucumber.ActionNameValuePair;
/**
 * Created by amit.rawat on 21/12/15.
 */
public class SearchHomePageStepdefs extends BaseStepDefs{
	private List<Map<String,String>> jobTitleLocations;
   
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

    
    @Given("^homepage$")
    public void homepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	System.out.println("homepage test result: " + super.runCucumberStep("stepOpenHomePage", "applyQAJob", "easyApply"));
    }

    @Given("^the following search data$")
    public void the_following_search_data(List<Map<String,String>> arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();
    	jobTitleLocations = arg1;
    	
    	//System.out.println(arg1.toString());
    }

    @When("^type in JobSearchKeyWord and location \"([^\"]*)\"$")
    public void type_in_and(String location) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	ActionNameValuePair typeInLocationValuePair = new ActionNameValuePair("eaTypeWindsor", location);
    	//super.runCucumberStep("stepRepeatApplyOtherKeywordsJobs", "applyQAJob", "easyApply", this.jobTitleLocations, typeInLocationValuePair);
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
