package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/CheckoutTest.feature",
        glue = {"steps"},
        plugin = {"pretty", "html:target/reports/CheckoutTest.html", "json:target/reports/CheckoutTest.json"},
        dryRun = false
)
public class CheckoutTest {
}
