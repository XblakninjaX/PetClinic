/*package org.springframework.samples.petclinic.selenium;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Platform;

public class FindOwnersTest {

	private static WebDriver driver;*/

	/*@BeforeClass
	public static void startDriver() {
		driver = Utils.getDriver();
	}
	*/
	
	/*@Test
	public void find_owners_should_list_me() throws InterruptedException, MalformedURLException {
	    //Added following 4 lines - DW
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName("firefox");
        desiredCapabilities.setPlatform(Platform.WINDOWS);
		driver  = new RemoteWebDriver(new URL("http://ec2-52-61-46-179.us-gov-west-1.compute.amazonaws.com:4444/wd/hub"), desiredCapabilities);
		driver.get(Utils.getBaseUrl());*/
		//dont need this stuff till  next comment
/*		driver.findElement(By.partialLinkText("Find owners")).click();
		driver.findElement(By.linkText("Add Owner")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Rickard");
		driver.findElement(By.id("lastName")).sendKeys("von Essen");
		driver.findElement(By.id("address")).sendKeys("Industrigatan 9");
		driver.findElement(By.id("city")).sendKeys("Stockholm");
		driver.findElement(By.id("telephone")).sendKeys("070776655");
		driver.findElement(By.xpath("//button")).click();
		
		driver.findElement(By.partialLinkText("Find owners")).click();
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("von Essen");
		driver.findElement(By.xpath("//button")).click();*/
	
		//driver.findElement(By.xpath("//tbody")).findElement(By.linkText("Rickard von Essen"));
		//above to previous comment
		/*driver.findElement(By.linkText("FIND PILOTS")).click();

		driver.findElement(By.linkText("Add Pilot")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Priya");

		driver.findElement(By.id("lastName")).sendKeys("Ramesh");

		driver.findElement(By.id("address")).sendKeys("110 street");

		driver.findElement(By.id("city")).sendKeys("Chantilly");

		driver.findElement(By.id("telephone")).sendKeys("7032121234");

		driver.findElement(By.xpath(".//*[@id='add-owner-form']/div[2]/div/button")).click();

		driver.findElement(By.linkText("Edit Owner")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.id("lastName")).clear();

		driver.findElement(By.id("lastName")).sendKeys("Ram");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='add-owner-form']/div[2]/div/button")).click();
		driver.findElement(By.xpath("html/body/div[1]/div/a[2]")).click();

		driver.findElement(By.id("name")).sendKeys("Jack");

		driver.findElement(By.id("birthDate")).click();

		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for (WebElement ele : allDates) {

			String date = ele.getText();

			if (date.equalsIgnoreCase("28")) {
				ele.click();
				break;
			}

		}

		Select Type = new Select(driver.findElement(By.id("type")));

		Type.selectByVisibleText("Beechcraft");

		driver.findElement(By.xpath(".//*[@id='pet']/div[2]/div/button")).click();

		driver.findElement(By.linkText("FIND PILOTS")).click();

		driver.findElement(By.linkText("Add Pilot")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Dylan");

		driver.findElement(By.id("lastName")).sendKeys("Wintermute");

		driver.findElement(By.id("address")).sendKeys("130 street");

		driver.findElement(By.id("city")).sendKeys("Fairfax");

		driver.findElement(By.id("telephone")).sendKeys("7034567890");

		driver.findElement(By.xpath(".//*[@id='add-owner-form']/div[2]/div/button")).click();
		driver.findElement(By.linkText("ENGINEERS")).click();

		driver.findElement(By.linkText("FIND PILOTS")).click();

		driver.findElement(By.xpath(".//*[@id='lastName' and @name='lastName']")).click();

		driver.findElement(By.xpath(".//*[@id='lastName' and @name='lastName']")).sendKeys("Ram");

		driver.findElement(By.xpath(".//*[@id='search-owner-form']/div[2]/div/button")).click();
	}
	
	@AfterClass
	public static void stopDriver() {
		driver.quit();
	}
}*/
