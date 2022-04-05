package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setProperty() {
		System.out.println("Property Setup");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("Launching the Browser");
	}

	@BeforeClass
	private void launchUrl() {
		System.out.println("Launching the URL");
	}

	@BeforeMethod
	private void signIn() {
		System.out.println("Sign in");
	}

	@Test
	private void dresses() {
		System.out.println("Dresses");
	}

	@Test
	private void tshirt() {
		System.out.println("T-shirt");
	}

	@Test
	private void women() {
		System.out.println("Women");
	}

	@AfterMethod
	private void signOut() {
		System.out.println("Sign out");
	}

	@AfterClass
	private void close() {
		System.out.println("Close");
	}

	@AfterTest
	private void verify() {
		System.out.println("Verify");
	}
	

	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete Cookies");
	}

}
