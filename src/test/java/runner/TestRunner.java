package runner;

        import io.cucumber.testng.AbstractTestNGCucumberTests;
        import io.cucumber.testng.CucumberOptions;

@CucumberOptions (publish = true, features = {"src/test/java/Features"}, glue = "stepdefinitions",
        plugin = {"json:target/sprint.json","pretty","html:target/sprint.json","pretty"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
