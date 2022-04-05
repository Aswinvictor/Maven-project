package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {

	@Test(dataProvider = "CLIENT")
	private void login(String name, String pass) {
		System.out.println("User name:" + name);
		System.out.println("Password:" + pass);
	}

	@DataProvider(name = "QA")
	private Object[][] analystData() {
		return new Object[][] { { "aaa", "123" }, { "bbb", "234" }, { "ccc", "345" }

		};
	}

	@DataProvider(name = "CLIENT")
	private Object[][] clientData() {
		return new Object[][] { { "kkk", "788" }, { "uuu", "245" } };
	}

}
