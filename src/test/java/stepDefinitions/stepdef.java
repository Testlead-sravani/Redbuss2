package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.After;
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
//	@Given("Enter source and destination cities")
//	public void enter_source_and_destination_cities() throws InterruptedException {
//		b=new booking(driver);
//		b.sourceanddestination();
//		Reporter.log("entered source and destination cities");
//	   
//	}
	@Given("Enter {string} and {string} cities")
	public void enter_and_cities(String string, String string2) throws InterruptedException {
		b=new booking(driver);
		b.sourceanddestination(string, string2);
	  
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
		b.booktickets();
		if(driver.getTitle().equals("Bangalore (Bengaluru) to Hyderabad Bus Tickets Booking, Save upto 25% - redBus"))
		{
			Reporter.log("Successfully booked ticket from bangalore to hyderabad");
		}
		if(driver.getTitle().equals("Hyderabad to Chennai Bus Tickets Booking | Upto Rs. 300 OFF"))
		{
			Reporter.log("Successfully booked ticket from hyderabad to chennai");
		}
		if(driver.getTitle().equals("Tirupati to Chennai Bus Tickets Booking | Upto Rs. 300 OFF"))
		{
			Reporter.log("Successfully booked ticket from tirupati to chennai");
		}
	    
	}
	@After
	public void closebrowser()
	{
		driver.close();
		Reporter.log("closed browser");
	}

}
