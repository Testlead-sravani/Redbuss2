package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.booking;

public class stepdef {
	WebDriver driver;
	booking b;
	@Before
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver1.exe");
		Reporter.log("chrome is launched");
		driver=new ChromeDriver();
		driver.get("https://www.redbus.com/");
		Reporter.log("redbus application is launched");
		driver.manage().window().maximize();
		Reporter.log("window is maximized");
	}
	@Given("Enter source and destination cities")
	public void enter_source_and_destination_cities() throws InterruptedException {
		b=new booking(driver);
		b.sourceanddestination();
		Reporter.log("entered source and destination cities");
	   
	}

	@Given("Enter date")
	public void enter_date() {
		b.date();
		b.returndate();
		Reporter.log("entered date and return date");
	  
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
		b.searchbtn();
		Reporter.log("clicked on search");
	   
	}

	@Then("Book tickets")
	public void book_tickets() throws InterruptedException {
		b.arrivaltime();
		Reporter.log("selected arrival time");
		b.depttime();
		Reporter.log("selected departure time");
		b.bustypes();
		Reporter.log("selected the type of bus as sleeper");
		b.seats();
		Reporter.log("selected avaible seat");
		b.passengerdetails();
		Reporter.log("entered details");
		Reporter.log("Successfully made payment");
	    
	}

}
