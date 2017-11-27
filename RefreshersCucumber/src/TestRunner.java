import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

//run this java file with JUnit

@RunWith(Cucumber.class)
@Cucumber.Options(features="features", glue={"stepDefinition"})
public class TestRunner {

	
}
