package com.brainzhive.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Rough {
	
	public void bankManagerLogin() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/angularjs-protractor/banking/#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[2]/button")).click();
	}
	
	

}
