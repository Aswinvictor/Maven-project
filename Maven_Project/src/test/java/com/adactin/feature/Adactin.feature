Feature: Hotel Booking In Adactin Application 
@Ad1
Scenario Outline: Login Page
	Given user Launch The Application 
	When user Enter The "<username>" In Username Field 
	And user Enter The "<password>" In Password Field 
	Then user Clock On Login Button And It Navigates To The Search Hotel Page 
	
Examples:
	|username|password|
	|check|checkpass|
	|Aswinvictor|Aswinadams103|
@Ad2	
Scenario: Search Hotel Page 
	When user Enter The Hotel "New York" 
	And user Select The Hotel 
	And user Select The Room Type 
	And user Select The Number Of Rooms 
	And user Enter The Check In Date 
	And user Enter The Check Out Date 
	And user Select The The Adults Per Room 
	And user Select The Children Per Room 
	Then user CLick On Search Button And It Navigates To The Select Hotel Page 
@Ad2	
Scenario: Select Hotel Page 
	When user Select The Hotel From List 
	Then user Click On The Continue Button And It Navigates To The Book A Hotel Page 
@Ad3	
Scenario: Book A Hotel Page 
	When user Enter The First Name 
	And user Enter The Last Name 
	And user Enter The Billing Address 
	And user Enter The Credit Card Number 
	And user Select The Credit Card Type 
	And user Select The Expiry Month 
	And user Select The Expiry Year 
	And user Enter The Cvv Number 
	Then user CLick On Book Now Button And It Navigates To The Booking Confirmation Page 
@Ad4	
Scenario: Booking Confirmation Page 
	Then user Click On The Logout Button And It Navigates To The Successfully Logged Out Page 
