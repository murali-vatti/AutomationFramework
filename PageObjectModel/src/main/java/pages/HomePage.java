package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	
		// TODO Auto-generated constructor stub
	}



	public void searchCar() {
		
		
	}
	
	
	@FindBy(xpath = "//div[normalize-space()='NEW CARS']")
	public WebElement menu;
	
	@FindBy(xpath = "//div[contains(text(),'Find New Cars')]")
	public WebElement findNewCars;
	
	
	public NewCarsPage goToFindNewCars() {
		
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		findNewCars.click();
		
		return new NewCarsPage(driver);
	}
	
	
	public void goToBuyUsedCars() {
		
		
		
	}

}
