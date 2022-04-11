package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.sd",monochrome = true,dryRun = false,publish = true,tags = ("~@Ad4"),
plugin = {"html:Report/Cucumber_Reports",
		"json:Report/Jsonreport.json",
		"pretty"
		
}
)

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		
		driver = Base_Class.getBrowser("chrome");

	}

	@AfterClass
	public static void tear_Down() {

		driver.close();
	}

}
