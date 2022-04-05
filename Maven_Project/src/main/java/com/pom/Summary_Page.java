package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	public static WebDriver driver;
	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement summary;

	public Summary_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary() {
		return summary;
	}

}
