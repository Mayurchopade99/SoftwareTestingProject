package com.coverfox.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverfoxResultPage {

	// variables
	@FindBy(xpath = "//div[contains(text(),'Health Insurance Plans')]")
	private WebElement matchingResults;

	// constructor
	public CoverfoxResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// methods

	public String getMatchingResultNumber() {
		String result = matchingResults.getText();
		System.out.println("Fetching matching result");
		String[] temp = result.split(" ");
		String finalResult = temp[0];

		return finalResult;
	}

}
