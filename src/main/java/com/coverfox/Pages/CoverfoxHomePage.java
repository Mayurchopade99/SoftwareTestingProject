package com.coverfox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxHomePage {
	
	
	//variables--> webelement
	@FindBy(xpath = "//button[text()='Get Started']")private WebElement getStartedButton;
	
	//constructor
	public CoverfoxHomePage(WebDriver driver) 
	{ 
	     PageFactory.initElements(driver,this);
	   	 
	}
	
	//method
	public void clickOnGetStartedButton() 
	{
		getStartedButton.click();
		System.out.println("clicking on getStartedButton");
	}

}
