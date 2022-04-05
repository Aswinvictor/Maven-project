package com.testng;

import org.testng.annotations.Test;

public class Test_IretryAnalyzer {

	@Test(retryAnalyzer = My_Retry.class)
	private void demo1() {
		System.out.println(10 / 0);
	}

	@Test(retryAnalyzer = My_Retry.class)
	private void demo2() {
		System.out.println(10 / 10);
	}

}
