package runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

	features = {"E:\\Automation testing\\Coverfox_Test\\src\\test\\resources\\featureFile\\CoverfoxHealthInsurance.feature"
         
	}			
	//"E:\\Automation testing\\Coverfox_1\\src\\test\\resources\\featureFile\\CoverfoxHealthInsurance.feature" }
	, glue = {"stepDefinitions", "hooks"},
	  plugin={"pretty","html:target/cucumber-reports/reports.html",
			 "json:target/cucumber-reports/cucumber.json"},
	  publish=true , dryRun = false
			 

)
   @Test
    public class HealthInsuranceRunner extends AbstractTestNGCucumberTests 
   {
	
	
	

    }
    