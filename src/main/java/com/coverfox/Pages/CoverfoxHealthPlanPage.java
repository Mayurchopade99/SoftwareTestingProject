package com.coverfox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CoverfoxHealthPlanPage {

	//variables --> webelements
	@FindBy(xpath = "//div[text()=' Next ']")private WebElement clickOnNextButton;
	
	
	//constructor
	public CoverfoxHealthPlanPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this );
	}
	
	//methods
    public void clickOnNextButtonHealthPage()
    {
    	clickOnNextButton.click();
    	System.out.println("clicking on Next button of Health page");
    }
	
}