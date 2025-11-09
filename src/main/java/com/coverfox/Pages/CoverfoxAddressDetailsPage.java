package com.coverfox.Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverfoxAddressDetailsPage {

	
	@FindBy(xpath = "//input[@placeholder='6 Digit Pincode']") private WebElement pincodeField;
	@FindBy(xpath = "//input[@placeholder='Your mobile number']") private WebElement mobileNumberField;
	@FindBy(xpath = "//div[text()='Continue']") private WebElement continueButton;
	@FindBy(xpath="//div[contains(text(),'pincode ')]") private WebElement pincodeErrormsg;
	@FindBy(xpath="//div[contains(text(),' Please enter a valid mobile no. ')]")private WebElement mobNumErrMsg;
	//constrcutor
	
	public CoverfoxAddressDetailsPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	
	}
	
	public void enterPincode(String pincode) {
		pincodeField.sendKeys(pincode);
		System.out.println("Entering Pincode ... value is "+ pincode );
		
	}
	public void enterMobileNumber(String moNumber ) 
	{
		
		mobileNumberField.sendKeys(moNumber);
		System.out.println("Entering mobile ..."+ moNumber);

	}
	public void clickOnContinueButton()
	{
		continueButton.click();
		System.out.println("clicking on Continue button");
	}
	
	public String getPincodeErrMsg()
	{
		Reporter.log("gettting pincode error msg , msg is "+pincodeErrormsg, true);
		return pincodeErrormsg.getText();
	}
	
	public  String getMobNumErrMsg() {
		
		Reporter.log("getting mobile number error msg , msg is "+ mobNumErrMsg.getText(),true);
		return mobNumErrMsg.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
