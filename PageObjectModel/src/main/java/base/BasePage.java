package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import extentlistener.ExtentManager;

public class BasePage {
	
	
	public WebDriver driver;
	public static CarBase carBase;
	public static TopNavigation topNav;
		
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		carBase = new CarBase(driver);
		topNav = new TopNavigation(driver);
		PageFactory.initElements(driver, this);
		ExtentManager.driver = driver;
				
	}

}
