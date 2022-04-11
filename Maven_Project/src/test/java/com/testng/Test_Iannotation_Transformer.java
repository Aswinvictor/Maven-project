package com.testng;

import org.testng.annotations.Test;

public class Test_Iannotation_Transformer {
	
	@Test
	private void Login() {
		
		System.out.println("First");
		
		System.out.println("Second");
	}
	@Test
	private void logout() {
		System.out.println("Third");
	}

}
