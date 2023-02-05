package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports-p2.html",
                "json:target/json-reports/cucumberp2.json",
                "junit:target/xml-report/cucumberp2.xml"
        },
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags= "@smoke",
        dryRun = false
)





public class ParalelRunner2 {
}
