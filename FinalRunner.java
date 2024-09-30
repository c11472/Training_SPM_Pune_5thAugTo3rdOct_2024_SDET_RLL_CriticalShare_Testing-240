package packagerunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/FeatureFiles", 
glue = "StepsDefinitions")
public class FinalRunner extends AbstractTestNGCucumberTests {
}


