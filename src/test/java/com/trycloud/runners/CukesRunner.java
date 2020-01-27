package com.trycloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/Resources/features/",
        glue = "com/tryCloud/step_definitions/",
        dryRun = false

)
public class CukesRunner {

}
