package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faded_Page {
	public static WebDriver driver;
	@FindBy(className = "icon-plus")
	private WebElement iconPlus;

	public Faded_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getIconPlus() {
		return iconPlus;
	}

	@FindBy(name = "group_1")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}
	
	@FindBy(name = "Submit")
	private WebElement submit1;
	
	public WebElement getFadedSubmit() {
		return submit1;
	}
}
