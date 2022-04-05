package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Address_Page;
import com.pom.Faded_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Payment_Page;
import com.pom.Shipping_Page;
import com.pom.Summary_Page;
import com.pom.Women_Page;

public class Page_Object_Manager {

	public static WebDriver driver;
	private Home_Page hp;
	private Login_Page lp;
	private Women_Page wo;
	private Faded_Page fp;
	private Summary_Page sp;
	private Address_Page ap;
	private Shipping_Page tc;
	private Payment_Page pg;

	public Login_Page getInstanceLp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Page_Object_Manager(WebDriver driver) {
		this.driver = driver;
	}

	public Home_Page getInstanceHp() {
		hp = new Home_Page(driver);
		return hp;
	}

	public Women_Page getInstanceWo() {
		wo = new Women_Page(driver);
		return wo;

	}

	public Faded_Page getInstanceFp() {
		fp = new Faded_Page(driver);
		return fp;

	}

	public Summary_Page getInstanceSp() {
		sp = new Summary_Page(driver);
		return sp;
	}

	public Address_Page getAddressAp() {
		ap = new Address_Page(driver);
		return ap;
	}

	public Shipping_Page getShippingTc() {
		tc = new Shipping_Page(driver);
		return tc;
	}

	public Payment_Page getPayment_Page() {
		pg = new Payment_Page(driver);
		return pg;
	}
}
