package be.odisee.team5.fsfopdracht2;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber"}, features = "src/test/resources/be.odisee.team5.fsfopdracht2")
public class RunTests {
}
