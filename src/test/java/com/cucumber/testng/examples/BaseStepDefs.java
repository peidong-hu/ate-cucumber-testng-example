package com.cucumber.testng.examples;

import org.bigtester.ate.AbstractCucumberTestStepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by amit.rawat on 21/12/15.
 */
public class BaseStepDefs{
	protected Scenario scenario = null;
	
	
	    /**
	 * {@inheritDoc}
	 */
	
	public Scenario getScenario() {
		
		return scenario;
	}
	/**
	 * {@inheritDoc}
	 */
	
	public String getAteGlueTestProjectXmlFilePath() {
		// TODO Auto-generated method stub
		return "indeedJobApplication/testproject.xml";
	}
	
	protected void cleanUp() {
		//closeAteExecutionContext();
	}
	
}
