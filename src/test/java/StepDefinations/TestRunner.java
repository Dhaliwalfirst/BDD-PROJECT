package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prabh\\eclipse-workspace\\BDDFRAMEWORK1\\src\\test\\java\\feature\\Filtersort.feature",glue={"StepDefinations"},
monochrome=true,
//plugin = {"pretty","html:target/HtmlReports/"},
dryRun = true)
public class TestRunner {

}