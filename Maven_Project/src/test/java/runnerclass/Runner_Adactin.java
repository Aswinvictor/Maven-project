package runnerclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.sdp.Adactin_Page_Object_Manager;

public class Runner_Adactin extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");
	public static Adactin_Page_Object_Manager pom = new Adactin_Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {
		implicitWait(10000, TimeUnit.MILLISECONDS);

		getUrl(readParticularData(
				"C:\\Users\\ADMIN\\Documents\\Project\\Class Notes_Manual Testing\\Test Case _ Adactin Site.xlsx", 0, 1,
				7));

		inputValueElement(pom.getInstanceLp().getUserName(), readParticularData(
				"C:\\Users\\ADMIN\\Documents\\Project\\Class Notes_Manual Testing\\Test Case _ Adactin Site.xlsx", 0, 3,
				7));
		inputValueElement(pom.getInstanceLp().getPassword(), readParticularData(
				"C:\\Users\\ADMIN\\Documents\\Project\\Class Notes_Manual Testing\\Test Case _ Adactin Site.xlsx", 0, 4,
				7));
		pom.getInstanceLp().getLogin().click();
//Search hotel page
		select(pom.getSh().getLocation(), "value", "New York");
		select(pom.getSh().getHotels(), "index", "1");
		select(pom.getSh().getRoomType(), "text", "Double");
		select(pom.getSh().getRoomNos(), "value", "1");
		inputValueElement(pom.getSh().getCheckIn(), "07/03/2022");
		inputValueElement(pom.getSh().getCheckOut(), "09/03/2022");
		select(pom.getSh().getAdults(), "value", "1");
		select(pom.getSh().getChildren(), "value", "0");
		pom.getSh().getSearch().click();
//select hotel page
		pom.getShp().getHotel().click();
		pom.getShp().getHotel_Confirmation().click();
//Book hotel page
		inputValueElement(pom.getBh().getFirstName(), "Aswin");
		inputValueElement(pom.getBh().getLastName(), "Victor");
		inputValueElement(pom.getBh().getAddress(), "Newyork");
		inputValueElement(pom.getBh().getCardNo(), "1234567890123456");
		select(pom.getBh().getCardType(), "value", "VISA");
		select(pom.getBh().getExpiryMonth(), "text", "March");
		select(pom.getBh().getExpiryYear(), "Value", "2014");
		inputValueElement(pom.getBh().getCardCvv(), "684");
		pom.getBh().getBookNow().click();
		

	}

}
