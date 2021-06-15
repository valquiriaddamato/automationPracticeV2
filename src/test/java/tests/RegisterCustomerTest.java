package tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/RegisterCustomerTest.feature",
        glue = {"steps", "generations"},
        plugin = {"pretty", "html:target/reports/RegisterCustomerTest.html", "json:target/reports/RegisterCustomerTest.json"},
        dryRun = false
)
public class RegisterCustomerTest {

}
