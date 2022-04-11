package com.sd;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Test_Runner;
import com.baseclass.Base_Class;
import com.sdp.Adactin_Page_Object_Manager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def extends Base_Class {

	public static WebDriver driver = Test_Runner.driver;

	public static Adactin_Page_Object_Manager poma = new Adactin_Page_Object_Manager(driver);

	@Before
	public void before_Hooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario name :" + name);
	}

	@After
	public void afetr_Hooks(Scenario s) throws IOException {
		if (s.isFailed()) {
			TakesScreenShot("C:\\Users\\ADMIN\\git\\Mavenprojectexample\\Maven_Project\\Screenshot\\cucumber_After");
		}
		Status status = s.getStatus();
		System.out.println("Scenario status :" + status);
	}

	@Given("user Launch The Application")
	public void user_launch_the_application() {
		getUrl("https://adactinhotelapp.com/");

	}

	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String username) {
		inputValueElement(poma.getInstanceLp().getUserName(), username);
	}

	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String password) {
		inputValueElement(poma.getInstanceLp().getPassword(), password);
	}

	@Then("user Clock On Login Button And It Navigates To The Search Hotel Page")
	public void user_clock_on_login_button_and_it_navigates_to_the_search_hotel_page() {
		poma.getInstanceLp().getLogin().click();
	}

	@When("user Enter The Hotel {string}")
	public void user_enter_the_hotel(String location) {
		select(poma.getSh().getLocation(), "value", location);

	}

	@When("user Enter The Hotel Location")
	public void user_enter_the_hotel_location() {
		select(poma.getSh().getLocation(), "value", "New York");
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {
		select(poma.getSh().getHotels(), "index", "1");

	}

	@When("user Select The Room Type")
	public void user_select_the_room_type() {
		select(poma.getSh().getRoomType(), "text", "Double");
	}

	@When("user Select The Number Of Rooms")
	public void user_select_the_number_of_rooms() {
		select(poma.getSh().getRoomNos(), "value", "1");
	}

	@When("user Enter The Check In Date")
	public void user_enter_the_check_in_date() {
		inputValueElement(poma.getSh().getCheckIn(), "07/03/2022");
	}

	@When("user Enter The Check Out Date")
	public void user_enter_the_check_out_date() {
		inputValueElement(poma.getSh().getCheckOut(), "09/03/2022");
	}

	@When("user Select The The Adults Per Room")
	public void user_select_the_the_adults_per_room() {
		select(poma.getSh().getAdults(), "value", "1");
	}

	@When("user Select The Children Per Room")
	public void user_select_the_children_per_room() {
		select(poma.getSh().getChildren(), "value", "0");
	}

	@Then("user CLick On Search Button And It Navigates To The Select Hotel Page")
	public void user_c_lick_on_search_button_and_it_navigates_to_the_select_hotel_page() {
		poma.getSh().getSearch().click();
	}

	@When("user Select The Hotel From List")
	public void user_select_the_hotel_from_list() {

		poma.getShp().getHotel().click();
	}

	@Then("user Click On The Continue Button And It Navigates To The Book A Hotel Page")
	public void user_click_on_the_continue_button_and_it_navigates_to_the_book_a_hotel_page() {
		poma.getShp().getHotel_Confirmation().click();
	}

	@When("user Enter The First Name")
	public void user_enter_the_first_name() {
		inputValueElement(poma.getBh().getFirstName(), "Aswin");
	}

	@When("user Enter The Last Name")
	public void user_enter_the_last_name() {
		inputValueElement(poma.getBh().getLastName(), "Victor");
	}

	@When("user Enter The Billing Address")
	public void user_enter_the_billing_address() {
		inputValueElement(poma.getBh().getAddress(), "Newyork");
	}

	@When("user Enter The Credit Card Number")
	public void user_enter_the_credit_card_number() {
		inputValueElement(poma.getBh().getCardNo(), "1234567890123456");
	}

	@When("user Select The Credit Card Type")
	public void user_select_the_credit_card_type() {
		select(poma.getBh().getCardType(), "value", "VISA");
	}

	@When("user Select The Expiry Month")
	public void user_select_the_expiry_month() {
		select(poma.getBh().getExpiryMonth(), "text", "March");
	}

	@When("user Select The Expiry Year")
	public void user_select_the_expiry_year() {
		select(poma.getBh().getExpiryYear(), "Value", "2014");
	}

	@When("user Enter The Cvv Number")
	public void user_enter_the_cvv_number() {
		inputValueElement(poma.getBh().getCardCvv(), "684");
	}

	@Then("user CLick On Book Now Button And It Navigates To The Booking Confirmation Page")
	public void user_c_lick_on_book_now_button_and_it_navigates_to_the_booking_confirmation_page() {
		poma.getBh().getBookNow().click();
	}

	/*
	 * @Then("user Click On The Logout Button And It Navigates To The Successfully Logged Out Page"
	 * ) public void
	 * user_click_on_the_logout_button_and_it_navigates_to_the_successfully_logged_out_page
	 * () {
	 * 
	 * }
	 */

}
