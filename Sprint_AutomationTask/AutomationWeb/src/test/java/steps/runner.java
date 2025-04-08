package steps;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/AutomationTask/Ecommerce.feature"},
        glue = {"steps"},tags = "@testcase3",
        plugin = {"pretty", "html:target/reports/report.html"}
)
public class runner extends AbstractTestNGCucumberTests {
}


 