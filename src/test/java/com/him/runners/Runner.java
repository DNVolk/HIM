package com.him.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions
        (
                plugin= {
                        "html:target/cucumber-report.html",
                        "rerun:target/rerun.txt", //in case of test fails (multithreading) false fail
                        "json:target/cucumber-report.json"
                },
                features ="src/test/resources/features",
                glue= "com/him/google",
                dryRun = true,
              tags = "@Apple"
        )
public class Runner extends AbstractTestNGCucumberTests {


}
