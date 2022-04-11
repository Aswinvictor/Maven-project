package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.adactin.BookHotel_Page;
import com.pom.adactin.Login_Page;
import com.pom.adactin.Search_Hotel_Page;
import com.pom.adactin.SelectHotel_Page;

public class Adactin_Page_Object_Manager {

	public static WebDriver driver;

	private Login_Page lp;
	private SelectHotel_Page shp;
	private BookHotel_Page bh;
	
	public BookHotel_Page getBh() {
		bh = new BookHotel_Page(driver);
		return bh;
	}

	public SelectHotel_Page getShp() {
		shp = new SelectHotel_Page(driver);
		return shp;
	}

	private Search_Hotel_Page sh;

	public Search_Hotel_Page getSh() {
		sh = new Search_Hotel_Page(driver);
		return sh;
	}

	public Adactin_Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
	}

	public Login_Page getInstanceLp() {
		lp = new Login_Page(driver);
		return lp;
	}

}
