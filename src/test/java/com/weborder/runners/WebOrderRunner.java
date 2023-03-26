package com.weborder.runners;
/*
THESE ARE INTERVIEW QUESTIONS:

  - Runner Class is a way to run all your feature file here. Regression, smoke, ..,, etc
  - @RunWith --> Annotation comes from Junit, and it executes the feature file steps
  - @CucumberOptions --> It is a special annotation that have some keywords inside
       * features --> this is the location of feature files (this one should be 'CONTENT ROOT')
       * glue --> this is the location of Step Definition file (this one should be 'SOURCE ROOT')
       * dryRun --> this is a way to get all snips without executing the whole steps from beginning
       * tags --> it is a way to specialize your scenario for the specific tag (regression, smoke),
                  kind of filtration
       * pluIng --> it is a way to integrate specific condition for the keyword. It is mostly used
                    for report card.
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/weborder", //features
        glue = "com/weborder/stepdefinitions", //step definitions
        dryRun = false, //getting snips without executing
        tags = "@scenarioOutline1",
        plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}
        //and refers to one scenario
        //or refers to multiple scenarios
)


public class WebOrderRunner {



}
