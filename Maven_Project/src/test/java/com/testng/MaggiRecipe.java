package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class MaggiRecipe {

	@Test(priority = 1)
	private void heatWater() {
		System.out.println("Boil water for 3 mins");
	}

	@Test(dependsOnMethods = "heatWater", priority = 2)
	private void putMaggi() {
		System.out.println("Put maggi in to the boiled water");
	}

	@Test(priority = 3)
	private void addMasala() {
		System.out.println("Add masala with maggi and mix well");
	}

	@Test(priority = 4)
	private void cookMaggi() {
		System.out.println("Wait for 3 mins for the maggi to get cooked well");
	}

	@Test(invocationCount = 3, priority = 5)
	private void serveMaggie() {
		System.out.println("Serve maggi");
	}

	@Test(enabled = false)
	private void cleanBowl() {
		System.out.println("Clean the Bowl");
	}

	@Ignore
	@Test
	private void offStove() {
		System.out.println("Turn the stove off");
	}
}
