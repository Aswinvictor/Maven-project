package com.testng;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(timeOut = 6000)//Should be higher than tread time. esle ThreadTimeoutException
	private void Login() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("First");
		
		Thread.sleep(2000);
		System.out.println("Second");
	}

}
