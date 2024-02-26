package options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features  = {"src/test/resources/features/"},
        glue = {"stepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/report.html", "json:target/report.json", "junit:target/report.xml"}
)
public class RunCucumberTest {
}
