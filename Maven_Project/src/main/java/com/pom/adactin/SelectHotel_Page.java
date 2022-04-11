package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page {
	public static WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement hotel;
	@FindBy(name = "continue")
	private WebElement hotel_Confirmation;

	public SelectHotel_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getHotel_Confirmation() {
		return hotel_Confirmation;
	}

}
