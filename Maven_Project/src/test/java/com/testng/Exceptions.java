package com.testng;

import org.testng.annotations.Test;

public class Exceptions {

	@Test(expectedExceptions = ArithmeticException.class)
	private void demo() {
		System.out.println(10 / 0);
	}

}
