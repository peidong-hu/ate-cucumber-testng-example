package com.cucumber.testng.examples;

import cucumber.api.Format;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Date;

import static org.testng.Assert.assertEquals;
/**
 * Created by amit.rawat on 21/12/15.
 */
public class DateStepdefs extends BaseStepDefs{
    private String result;
    private DateCalculator calculator;
   
    //@Before
    public void beforescenario(Scenario scenario){
        this.scenario = scenario;
        System.out.println("This is before Scenario: " + scenario.getId().toString());
    }


    //@After
    public void after(Scenario scenario) {
    	super.cleanUp();
        System.out.println("This is after Scenario: " + scenario.getName().toString());
    }

    
    //@Given("^today is (.+)$")
    public void today_is(@Format("yyyy-MM-dd") Date date) {
        calculator = new DateCalculator(date);
        scenario.write("<b>This is test message</b>");
        //super.runCucumberStep(new AteProjectFilter("easyApply", "applyQAJob", "stepOpenHomePage" ));
    }

    //@When("^I ask if (.+) is in the past$")
    public void I_ask_if_date_is_in_the_past(Date date) {
        result = calculator.isDateInThePast(date);
    }

    //@Then("^the result should be (.+)$")
    public void the_result_should_be(String expectedResult) {
        assertEquals(expectedResult, result);
    }

	
}
