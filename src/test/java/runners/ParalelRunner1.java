package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports-p1.html",
                "json:target/json-reports/cucumberp1.json",
                "junit:target/xml-report/cucumberp1.xml"
        },
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags= "@p1",
        dryRun = false
)

public class ParalelRunner1 {
}
