package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Groups {
	
	//Groups

	@Test(groups = "colour")
	private void red() {
		System.out.println("RED");
	}

	@Test(groups = "colour")
	private void green() {
		System.out.println("Green");
	}

	@Test
	private void phone() {
		System.out.println("Phone");
	}

	@Test(groups = "id")
	private void id1() {
		System.out.println("27254");
	}

	@Test(groups = "id")
	private void id2() {
		System.out.println("24567");
	}

//Parameter
	
	// Single set of data
	// in class---> @Optional(testNg test)
	// in xml----> Parameter
//in class --->@Optional
	@Test
	private void login(@Optional("Aswin") String name) {
		System.out.println("name:" + name);
	}

//in .xml -----> @Parameters	
	@Parameters({ "userName" })
	@Test
	private void userName(String Name) {
		System.out.println("userName:" + Name);
	}
}
