package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_Page {
	public static WebDriver driver;

	@FindBy(name = "first_name")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement lastName;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement cardNo;

	@FindBy(name = "cc_type")
	private WebElement cardType;

	@FindBy(name = "cc_exp_month")
	private WebElement expiryMonth;

	@FindBy(name = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(name = "cc_cvv")
	private WebElement cardCvv;

	@FindBy(name = "book_now")
	private WebElement bookNow;

	public BookHotel_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCardCvv() {
		return cardCvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

}
