package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/SearchTest.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/reports/SearchTest.html", "json:target/reports/SearchTest.json"},
        dryRun = false
)
public class SearchTest {

}