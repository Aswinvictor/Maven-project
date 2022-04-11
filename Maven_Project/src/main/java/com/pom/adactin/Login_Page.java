package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public static WebDriver driver;

	@FindBy(name = "username")
	private WebElement username;

	public WebElement getUserName() {
		return username;

	}

	@FindBy(name = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(name = "login")
	private WebElement login;

}
