/*package org.springframework.samples.petclinic.web;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTests {

	static WebDriver driver;

	String Url = "http://ec2-52-222-114-175.us-gov-west-1.compute.amazonaws.com:9005/spring-petclinic-4.2.5-SNAPSHOT/ ";

	@BeforeClass

	public void SetUp() throws IOException

	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(Url);
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 30);
	}

	@Test(priority = 1)

	public void addOwner() throws IOException, InterruptedException {

		driver.findElement(By.linkText("FIND OWNERS")).click();

		driver.findElement(By.linkText("Add Owner")).click();
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

		Type.selectByVisibleText("cat");

		driver.findElement(By.xpath(".//*[@id='pet']/div[2]/div/button")).click();

		driver.findElement(By.linkText("FIND OWNERS")).click();

		driver.findElement(By.linkText("Add Owner")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Dylan");

		driver.findElement(By.id("lastName")).sendKeys("Wintermute");

		driver.findElement(By.id("address")).sendKeys("130 street");

		driver.findElement(By.id("city")).sendKeys("Fairfax");

		driver.findElement(By.id("telephone")).sendKeys("7034567890");

		driver.findElement(By.xpath(".//*[@id='add-owner-form']/div[2]/div/button")).click();
		driver.findElement(By.linkText("VETERINARIANS")).click();

		driver.findElement(By.linkText("FIND OWNERS")).click();

		driver.findElement(By.xpath(".//*[@id='lastName' and @name='lastName']")).click();

		driver.findElement(By.xpath(".//*[@id='lastName' and @name='lastName']")).sendKeys("Ram");

		driver.findElement(By.xpath(".//*[@id='search-owner-form']/div[2]/div/button")).click();

	}

	@AfterClass

	public void teardown() {

		driver.close();
	}

}
*/
