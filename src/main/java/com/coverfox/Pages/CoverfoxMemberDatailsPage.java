package com.coverfox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.coverfox.Utils.Utility;

public class CoverfoxMemberDatailsPage {

	
	//variables
	@FindBy(id = "Age-You")private WebElement ageDropDown;
	@FindBy(className = "next-btn")private WebElement nextButton;
	 
	//constructor
	public CoverfoxMemberDatailsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public void handledAgeDropDown(String age)
	{
		Utility.handledAgeDropDownUsingVisibleText(ageDropDown, " "+ age +" years ");
		//System.out.println( "handled dropdown.. "+age+" years ");
	}
	public void clickOnNextButtonDetailPage()
	{
		nextButton.click();
		System.out.println("clicking on Next button  ");
	}
	
	
	
} 



