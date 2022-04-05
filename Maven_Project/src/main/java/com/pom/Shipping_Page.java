package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	public static WebDriver driver;

	@FindBy(id = "cgv")
	private WebElement terms;

	public Shipping_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getShippingTc() {
		return terms;

	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit2;

	public WebElement getSubmit2() {
		return submit2;
	}

}
