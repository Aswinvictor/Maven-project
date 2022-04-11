package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel_Page {

	public static WebDriver driver;
	@FindBy(name = "location")
	private WebElement location;

	public Search_Hotel_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "hotels")
	private WebElement hotels;

	@FindBy(name = "room_type")
	private WebElement roomType;

	@FindBy(name = "room_nos")
	private WebElement roomNos;

	@FindBy(name = "datepick_in")
	private WebElement checkIn;

	@FindBy(name = "datepick_out")
	private WebElement checkOut;

	@FindBy(name = "adult_room")
	private WebElement adults;

	@FindBy(name = "child_room")
	private WebElement children;

	@FindBy(id = "Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}

}
