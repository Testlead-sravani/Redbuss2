package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class booking {
	WebDriver driver;
	public booking(WebDriver driver)
	{
		this.driver=driver;
	}
	public void sourceanddestination() throws InterruptedException
	{
		driver.findElement(By.cssSelector("button[class='sc-jTzLTM bfMZDh']")).click();
		WebElement ele=driver.findElement(By.cssSelector("div[class='source input-box ']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele);
		WebElement e=driver.findElement(By.cssSelector("input[placeholder='Ex: Paris']"));
		e.sendKeys("Tirupati");
		Thread.sleep(2000);
		e.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("div[class='destination input-box']")).click();
		WebElement ele1=driver.findElement(By.cssSelector("input[placeholder='Ex: London Airport']"));
		ele1.sendKeys("Chennai");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.ENTER);
	}
	public void date()
	{
		driver.findElement(By.cssSelector("div[class='date input-box ']")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/main/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/span/span[4]/div[7]/span")).click();
	}
	public void returndate()
	{
		driver.findElement(By.cssSelector("div[class='returndate input-box ']")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/main/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]/span/span[5]/div[3]/span")).click();
	}
	public void searchbtn() throws InterruptedException
	{
		driver.findElement(By.cssSelector("button[class='fl button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='sc-bRBYWo sc-fMiknA krcKAl']")).click();
	}
	public void arrivaltime() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div/div/div[2]/ul[4]/li[2]")).click();
	}
	public void bustypes()
	{
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div/div/div[2]/ul[3]/li[2]")).click();
	}
	public void depttime() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div/div/div[2]/ul[2]/li[1]")).click();
	}
	public void seats() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div/ul/div/li/div/div[2]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[class='button continue inactive text-trans-uc w-h-cont']")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[1]/ul/div[1]/li/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/ul/li[2]/div[3]/span")).click();
		driver.findElement(By.cssSelector("button[class='button continue inactive']")).click();
	}
	public void passengerdetails() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.cssSelector("input[id='seatno-04']"));
		ele.click();
		ele.sendKeys("Sravani");
		driver.findElement(By.cssSelector("div[class='gender_position_rel float_left']")).click();
		WebElement ele1=driver.findElement(By.cssSelector("input[placeholder='Age']"));
		ele1.click();
		ele1.sendKeys("23");
		driver.findElement(By.cssSelector("input[placeholder='Email ID']")).sendKeys("sravanisaladi172@gmail.com");
		driver.findElement(By.cssSelector("input[id='seatno-06']")).sendKeys("6302856636");
		driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div/div[4]/div[2]/div/div[6]/div/div/div[3]/div[1]/label[2]")).click();
		driver.findElement(By.cssSelector("input[value='Proceed to pay']")).click();
	}
	
}
