package runner;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = { "src/test/resources/features" },
        glue = { "stepDef", "hooks" },
        tags = "not @Skip_Scenario",
        plugin = {"pretty",
                "html:testReports/CucumberReports/Cucumber.html"
        }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests{

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }
}
