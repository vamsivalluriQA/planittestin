package Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //plugin = {"pretty"},
        features = "src/test/resources/Featurefiles/featurefile1.feature",
       plugin={"pretty"})

public class Runner1 {}
