package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.BasePage;

public class NewCarsPage extends BasePage {
	
	
	public NewCarsPage(WebDriver driver) {
		super(driver);
		
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "BMW")
	public WebElement bmw;
	
	

	public BMWCarsPage gotoBMW() {
		
		
		bmw.click();
		
				
		return new BMWCarsPage(driver);
		
	}
	
	@FindBy(linkText = "Toyota")
	public WebElement toyota;
	
	public ToyotaCarsPage gotoToyota() {
		
		toyota.click();
		
		return new ToyotaCarsPage(driver);
		
	}
	
	
	@FindBy(linkText = "Honda")
	public WebElement honda;
	public HondaCarsPage gotoHonda(ExtentTest t1) {
		String logText;
		try {
		
		honda.click();
		
		} catch(Throwable t) {
			
			logText = "Expected Honda but Honda Car not available";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			t1.fail(m);

			
		}
		return new HondaCarsPage(driver);
		
	}
	
	
	@FindBy(linkText = "Kia")
	public WebElement kia;
	public KiaCarsPage gotoKia() {
		
		
		kia.click();
		
		return new KiaCarsPage(driver);
	}

	
	@FindBy(linkText = "Tata")
	public WebElement tata;
	public TataCarsPage gotoTata() {
		
		
		tata.click();
		
		return new TataCarsPage(driver);
	}
	
	
}
