package com.brainzhive.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpeningBrowser {

	@Test
	public void openIRCTCTest() {
	// TODO Auto-generated method stub
		
		// Sample test added
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
			

	}

}
