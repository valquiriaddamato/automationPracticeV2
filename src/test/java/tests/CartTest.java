package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CartTest.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/reports/CartTest.html", "json:target/reports/CartTest.json"},
        dryRun = false
)
public class CartTest {

}