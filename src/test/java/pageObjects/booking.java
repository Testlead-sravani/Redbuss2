package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class booking {
	WebDriver driver;
	public booking(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sourceanddestination(String source, String dest) throws InterruptedException
	{
		driver.findElement(By.cssSelector("button[class='sc-jTzLTM bfMZDh']")).click();
		WebElement ele=driver.findElement(By.cssSelector("div[class='source input-box ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		WebElement e=driver.findElement(By.cssSelector("input[placeholder='Ex: Paris']"));
		e.sendKeys(source);
		Thread.sleep(2000);
		e.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("div[class='destination input-box']")).click();
		WebElement ele1=driver.findElement(By.cssSelector("input[placeholder='Ex: London Airport']"));
		ele1.sendKeys(dest);
		Thread.sleep(2000);
		ele1.sendKeys(Keys.ENTER);
	}
	public void date()
	{
		driver.findElement(By.cssSelector("div[class='date input-box ']")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/main/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/span/span[5]/div[5]/span")).click();
	}
	public void returndate()
	{
		driver.findElement(By.cssSelector("div[class='returndate input-box ']")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/main/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/span/span[5]/div[7]/span")).click();
	}
	public void searchbtn() throws InterruptedException
	{
		driver.findElement(By.cssSelector("button[class='fl button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='sc-bRBYWo sc-fMiknA krcKAl']")).click();
	}
	public void booktickets() throws InterruptedException
	{
		Thread.sleep(5000);
		String s="Bangalore (Bengaluru) to Hyderabad Bus Tickets Booking, Save upto 25% - redBus";
		String s2="Hyderabad to Chennai Bus Tickets Booking | Upto Rs. 300 OFF";
		String ss="Tirupati to Chennai Bus Tickets Booking | Upto Rs. 300 OFF";
		if(driver.getTitle().equals(ss))
		{
			//bus types
			Thread.sleep(6000);
//			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[3]/div[2]/i")).click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div/div/div[2]/ul[3]/li[2]")).click();
			//seats
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[2]/ul/div[1]/li/div/div[2]/div[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("button[class='button continue inactive text-trans-uc w-h-cont']")).click();
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[2]/div[3]/span")).click();
			driver.findElement(By.cssSelector("button[class='button continue inactive']")).click();
			//passenger details
			Thread.sleep(15000);
			WebElement ele=driver.findElement(By.cssSelector("input[id='seatno-04']"));
			ele.click();
			ele.sendKeys("Sravani");
			driver.findElement(By.cssSelector("div[class='gender_position_rel float_left']")).click();
			WebElement ele1=driver.findElement(By.cssSelector("input[placeholder='Age']"));
			ele1.click();
			ele1.sendKeys("23");
			driver.findElement(By.cssSelector("input[placeholder='Email ID']")).sendKeys("sravanisaladi172@gmail.com");
			driver.findElement(By.cssSelector("input[id='seatno-06']")).sendKeys("6302856636");
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[5]/div[2]/div/div[6]/div/div/div[3]/div/label[2]")).click();
			driver.findElement(By.cssSelector("input[value='Proceed to pay']")).click();
			Thread.sleep(6000);
			
		}
		if(driver.getTitle().equals(s))
		{
			String s1="Bangalore (Bengaluru) to Hyderabad Bus";
			Assert.assertTrue(true, s1);
			Thread.sleep(6000);
//			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[3]/div[2]/i")).click();
			
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/ul[2]/li[1]/label[2]")).click();
			WebElement v=driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[2]/ul/div[2]/li/div/div[2]/div[1]"));
			v.click();
			//boarding point
			Thread.sleep(8000);
			WebElement n=driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[2]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul/li[1]"));
			JavascriptExecutor jss=(JavascriptExecutor)driver;
			jss.executeScript("arguments[0].click();", n);
			//dropping point
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[2]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[2]")).click();
			//for proceed to book
			driver.findElement(By.cssSelector("button[class='button continue inactive']")).click();
			Thread.sleep(15000);
			//passenger details
			WebElement ele=driver.findElement(By.cssSelector("input[id='seatno-04']"));
			ele.click();
			ele.sendKeys("Sravani");
			driver.findElement(By.cssSelector("div[class='gender_position_rel float_left']")).click();
			WebElement ele1=driver.findElement(By.cssSelector("input[placeholder='Age']"));
			ele1.click();
			ele1.sendKeys("23");
			driver.findElement(By.cssSelector("input[placeholder='Email ID']")).sendKeys("sravanisaladi172@gmail.com");
			driver.findElement(By.cssSelector("input[id='seatno-06']")).sendKeys("6302856636");
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[5]/div[2]/div/div[6]/div/div/div[3]/div/label[2]")).click();
			driver.findElement(By.cssSelector("input[value='Proceed to pay']")).click();
			Thread.sleep(3000);
		}
		if(driver.getTitle().equals(s2))
		{
			Thread.sleep(2000);
			//for selecting orange tours and travels
			driver.findElement(By.cssSelector("li[class='bannerTiles fl']")).click();
			//for selecting non-AC bus
			Thread.sleep(6000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,200)");
			driver.findElement(By.xpath("//*[@id=\"filter-block\"]/div/div[2]/ul[3]/li[3]")).click();
			driver.findElement(By.cssSelector("div[class='button view-seats fr']")).click();
			Thread.sleep(6000);
			//boarding point
			WebElement j=driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/ul/li[1]"));
			JavascriptExecutor Js=(JavascriptExecutor)driver;
			Js.executeScript("arguments[0].click();", j);
			//dropping point
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[3]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/ul/li[2]")).click();
			driver.findElement(By.cssSelector("button[class='button continue inactive']")).click();
			//passenger details
			Thread.sleep(15000);
			WebElement ele=driver.findElement(By.cssSelector("input[id='seatno-04']"));
			ele.click();
			ele.sendKeys("Sravani");
			driver.findElement(By.cssSelector("div[class='gender_position_rel float_left']")).click();
			WebElement ele1=driver.findElement(By.cssSelector("input[placeholder='Age']"));
			ele1.click();
			ele1.sendKeys("23");
			driver.findElement(By.cssSelector("input[placeholder='Email ID']")).sendKeys("sravanisaladi172@gmail.com");
			driver.findElement(By.cssSelector("input[id='seatno-06']")).sendKeys("6302856636");
			driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[5]/div[3]/div/div[6]/div/div/div[3]/div/label[2]")).click();
			driver.findElement(By.cssSelector("input[value='Proceed to pay']")).click();
			
		}
		
	}
//	public void arrivaltime() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div/div/div[2]/ul[4]/li[2]")).click();
//	}
//	public void bustypes()
//	{
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div/div/div[2]/ul[3]/li[2]")).click();
//	}
//	public void depttime() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div/div/div[2]/ul[2]/li[1]")).click();
//	}
//	public void seats() throws InterruptedException
//	{
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div/ul/div/li/div/div[2]/div")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("button[class='button continue inactive text-trans-uc w-h-cont']")).click();
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[2]/div[3]/span")).click();
//		driver.findElement(By.cssSelector("button[class='button continue inactive']")).click();
//	}
//	public void passengerdetails() throws InterruptedException
//	{
//		Thread.sleep(2000);
//		WebElement ele=driver.findElement(By.cssSelector("input[id='seatno-04']"));
//		ele.click();
//		ele.sendKeys("Sravani");
//		driver.findElement(By.cssSelector("div[class='gender_position_rel float_left']")).click();
//		WebElement ele1=driver.findElement(By.cssSelector("input[placeholder='Age']"));
//		ele1.click();
//		ele1.sendKeys("23");
//		driver.findElement(By.cssSelector("input[placeholder='Email ID']")).sendKeys("sravanisaladi172@gmail.com");
//		driver.findElement(By.cssSelector("input[id='seatno-06']")).sendKeys("6302856636");
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[4]/div[2]/div/div[6]/div/div/div[3]/div[1]/label[2]")).click();
//		driver.findElement(By.cssSelector("input[value='Proceed to pay']")).click();
//	}
//	public void cities() throws InterruptedException
//	{
//		WebElement ele=driver.findElement(By.xpath("/html/body/section/div[2]/section/div/ul/li[4]/h1"));
//		String s="Bangalore (Bengaluru) to Hyderabad Bus";
//		Assert.assertEquals(ele, s);
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/ul[3]/li[3]")).click();
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/ul[2]/li[1]/label[2]/text()[1]")).click();
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[1]/li/div/div[2]/div[1]")).click();
//		Thread.sleep(3000);
//		//boarding point
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/ul/li[1]")).click();
//		//dropping point
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[2]")).click();
//		//for proceed to book
//		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div[6]/button")).click();
//	}
	
	
}
