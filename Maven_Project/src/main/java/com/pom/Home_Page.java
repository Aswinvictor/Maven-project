package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public static WebDriver driver; // null
	@FindBy(className = "login")
	private WebElement login;

	public Home_Page(WebDriver abcd) {
		this.driver = abcd; // Current class driver is initialized to the runner class driver, which is
							// extended from base class as chrome drive.
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogin() {
		return login;
	}

}
