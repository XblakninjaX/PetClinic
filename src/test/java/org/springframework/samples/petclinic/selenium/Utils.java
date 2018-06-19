package org.springframework.samples.petclinic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Utils {
/*
	public static WebDriver getDriver() {
		//String browserType = System.getProperty("browserType", "unknown").toLowerCase();
		String browserType = System.getProperty("browserType", "firefox").toLowerCase();
		if ("firefox".equals(browserType))
			return  new FirefoxDriver();
		if ("htmlunit".equals(browserType))
			return new HtmlUnitDriver();
		
		throw new IllegalStateException("browserType property must be set to ether firefox or htmlunit!");
	}
	*/

	public static String getBaseUrl() {
		//return System.getProperty("base.url", "http://localhost:8080/petclinic");
		return System.getProperty("base.url", "http://openshift-jee-sample-project123.7e14.starter-us-west-2.openshiftapps.com/AirforceClub/");		
		
	}
}
