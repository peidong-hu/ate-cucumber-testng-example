package com.cucumber.testng.examples;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amit.rawat on 21/12/15.
 */
public class GenerateReport {
    public static void GenerateMasterthoughtReport(){
        try{
        	/*
            String RootDir = System.getProperty("user.dir");
            File reportOutputDirectory = new File("target/Masterthought");
            List<String> list = new ArrayList<String>();
            list.add("target/cucumber1.json");
            list.add("target/cucumber2.json");

            String pluginUrlPath = "";
            String buildNumber = "1";
            String buildProject = "cucumber-jvm";
            boolean skippedFails = true;
            boolean pendingFails = true;
            boolean undefinedFails = true;
            boolean missingFails = true;
            boolean flashCharts = true;
            boolean runWithJenkins = false;
            boolean highCharts = false;
            boolean parallelTesting = true;
            boolean artifactsEnabled = false;
            String artifactConfig = "";

            ReportBuilder reportBuilder = new ReportBuilder(list, reportOutputDirectory, pluginUrlPath, buildNumber,
                    buildProject, skippedFails, pendingFails, undefinedFails, missingFails, flashCharts, runWithJenkins,
                    highCharts, parallelTesting);

            reportBuilder.generateReports();
            */
        	
        	 File reportOutputDirectory = new File("target/Masterthought");
             List<String> jsonFiles = new ArrayList<String>();
             jsonFiles.add("target/cucumber1.json");
             jsonFiles.add("target/cucumber2.json");

             String buildNumber = "1";
             String projectName = "cucumber-jvm";
             boolean runWithJenkins = false;
             boolean parallelTesting = false;

             Configuration configuration = new Configuration(reportOutputDirectory, projectName);
             
             // optional configuration
             configuration.setParallelTesting(parallelTesting);
             configuration.setRunWithJenkins(runWithJenkins);
             configuration.setBuildNumber(buildNumber);
             
             // addidtional metadata presented on main page
             /*configuration.addClassifications("Platform", "Windows");
             configuration.addClassifications("Browser", "Firefox");
             configuration.addClassifications("Branch", "release/1.0");*/

             ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
             Reportable result = reportBuilder.generateReports();
 	        // and here validate 'result' to decide what to do
 	        // if report has failed features, undefined steps etc
             System.out.println("This is Reportable: " + result.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
