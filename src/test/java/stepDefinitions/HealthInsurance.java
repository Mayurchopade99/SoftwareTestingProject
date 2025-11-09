package stepDefinitions;

import org.testng.Assert;
import org.testng.Reporter;

import com.coverfox.DriverConfig.DriverFactory;
import com.coverfox.Pages.CoverfoxAddressDetailsPage;
import com.coverfox.Pages.CoverfoxHealthPlanPage;
import com.coverfox.Pages.CoverfoxHomePage;
import com.coverfox.Pages.CoverfoxMemberDatailsPage;
import com.coverfox.Pages.CoverfoxResultPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HealthInsurance {

	CoverfoxHomePage coverfoxHomePage = new CoverfoxHomePage(DriverFactory.getDriver());

	CoverfoxHealthPlanPage coverfoxHealthPlanPage = new CoverfoxHealthPlanPage(DriverFactory.getDriver());
	CoverfoxMemberDatailsPage coverfoxMemberDatailsPage = new CoverfoxMemberDatailsPage(DriverFactory.getDriver());
	CoverfoxAddressDetailsPage coverfoxAddressDetailsPage = new CoverfoxAddressDetailsPage(DriverFactory.getDriver());
	CoverfoxResultPage coverResultPage = new CoverfoxResultPage(DriverFactory.getDriver());

	@Given("I am on  home page")
	public void i_am_on_home_page() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("I am on  home page");
	}

	@When("I  click on get started button")
	public void i_click_on_get_started_button() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I  click on get started button");
		coverfoxHomePage.clickOnGetStartedButton();
	}

	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I click on next button");
		coverfoxHealthPlanPage.clickOnNextButtonHealthPage();
	}

	@When("I provide age as {string} and click on next button")
	public void i_provide_age_as_and_click_on_next_button(String age) throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("I provide age as  " + age + "  and click on next button");
		coverfoxMemberDatailsPage.handledAgeDropDown(age);
		coverfoxMemberDatailsPage.clickOnNextButtonDetailPage();
	}

	@When("I provide pincode as {string}, mobNumber as {string} and click on continue button")
	public void i_provide_pincode_as_mob_number_as_and_click_on_continue_button(String pincode, String mobNumber)
			throws InterruptedException {
		Thread.sleep(3000);
		System.out.println(
		"I provide pincode as  " + pincode + "  mobNumber as  " + mobNumber + "  and click on continue button");
		coverfoxAddressDetailsPage.enterPincode(pincode);
		coverfoxAddressDetailsPage.enterMobileNumber(mobNumber);
		coverfoxAddressDetailsPage.clickOnContinueButton();
		//Assert.fail();
	}

	@Then("matching Health Insurance Plans should be displayed as {string}")
	public void matching_health_insurance_plans_should_be_displayed_as(String result) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("matching Health Insurance Plans should be displayed as " + result);

		String actualResults = coverResultPage.getMatchingResultNumber();
		Reporter.log("actual result is " + actualResults, true);
	}

	@When("I click on car insurance button")
	public void i_click_on_car_insurance_button() {

		System.out.println("I click on car insurance button");
	}

	@When("I provide valid RTO number and click view quotes button")
	public void i_provide_valid_rto_number_and_click_view_quotes_button() {
		System.out.println("I provide valid RTO number and click view quotes button");
	}

	@When("I provide valid details and click on view quotes button")
	public void i_provide_valid_details_and_click_on_view_quotes_button() {
		System.out.println("I provide valid details and click on view quotes button");
	}

	@Then("I should get the plan details")
	public void i_should_get_the_plan_details() {
		System.out.println("I should get the plan details");
	}

	@When("I click on bike insurance button")
	public void i_click_on_bike_insurance_plan() {
		System.out.println("I click on bike insurance plan");
	}

	@When("I click on continue button")
	public void i_click_on_continue_button() throws InterruptedException {
		Thread.sleep(3000);
		//System.out.println("I click on continue button");
	coverfoxAddressDetailsPage.clickOnContinueButton();
	
		
	}

	@Then("Validate error messages")
	public void validate_error_messages() throws InterruptedException {
		Thread.sleep(2000);
     String pinErrMsg = coverfoxAddressDetailsPage.getPincodeErrMsg();
	  String mobErrMsg= coverfoxAddressDetailsPage.getMobNumErrMsg();		
		Reporter.log("Pinocode error message is: "+pinErrMsg, true);
		Reporter.log("Mobile number error message is"+mobErrMsg, true);
		
	}

}
