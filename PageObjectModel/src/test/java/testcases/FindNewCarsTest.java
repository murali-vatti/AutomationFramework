package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import base.BasePage;
import base.BaseTest;
import extentlisteners.ExtentListeners;
import pages.HomePage;
import pages.NewCarsPage;
import utilities.DataUtil;

public class FindNewCarsTest extends BaseTest {
	
	private ExtentTest test1;
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "data")
	public void findNewCarTest(String browser, String runMode, String carBrand, String carBrandTitle) throws InterruptedException {
		
		if(runMode.equals("N")) {
			
			throw new SkipException("Skipping the test as the run mode is No");
		}
		
		
		setUp(browser);
		
		SoftAssert softAssert = new SoftAssert();
		HomePage home = new HomePage(driver);
		NewCarsPage car = home.goToFindNewCars();
		
		
		if(carBrand.equals("bmw")) {
			
			car.gotoBMW();
			
		}else if(carBrand.equals("kia")) {
			
			car.gotoKia();
			
		}else if(carBrand.equals("honda")) {
			
			car.gotoHonda(ExtentListeners.test);
			
		}else if(carBrand.equals("toyota")) {
			
			car.gotoToyota();
			
		}else if (carBrand.equals("tata")) {
			car.gotoTata();
			
		}
		
		
		test1= ExtentListeners.test;
		String logText = "<b>" + "TEST CASE:- " + carBrand.toUpperCase() + "</b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
		
		test1.log(Status.INFO, m);
		
		
		String carTitle = BasePage.carBase.getCarTitle();
			
		softAssert.assertEquals(carTitle,carBrandTitle,"Title is not Matching");
		//Assert.assertEquals(carTitle, carBrandTitle);
		
		//System.out.println("Actual : " + carTitle + " ---- " + "Expected : " + carBrandTitle);
		
		
		softAssert.assertAll();
		 
		
		
	}

}
