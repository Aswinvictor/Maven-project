package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConcepts {

	// soft Assert
	@Test
	private void demo() {
		SoftAssert sf = new SoftAssert();
		String a = "Aswin";
		String b = "Adams";
		sf.assertEquals(a, b);
		System.out.println("Soft Assert Completed");// will be printed even it fails
		sf.assertAll();
	}

	// hard Assert
	@Test
	private void userName() {
		String s = "Aswin";
		String w = "Adams";
		Assert.assertEquals(s, w);
		System.out.println("Hard Assert completed");// won't get printed if it fails
	}

}
