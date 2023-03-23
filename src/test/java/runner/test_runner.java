package runner;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			plugin = {"pretty", "html:target/ds_algo.html"},
			//reporting purpose
			monochrome=false,  //console output color
			tags = "", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= "StepDefinition") //location of step definition files


	public class test_runner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }


}
