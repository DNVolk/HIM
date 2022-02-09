package com.him.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
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
              tags = "@Mytag"
        )
public class CukesRunner {
}
