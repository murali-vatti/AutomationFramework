package com.brainzhive.testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.brainzhive.base.BaseTest;
import com.brainzhive.utilities.DataUtil;

public class AddCustomerTest extends BaseTest{

	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "data")
	public void addCustomer(String firstName, String lastName, String postCode) {
		
		click("addCustBtn_CSS");
		type("firstName_CSS",firstName);
		type("lastName_CSS",lastName);
		type("postCode_CSS",postCode);
		click("addCustomer_CSS");
		
		Alert alert = driver.switchTo().alert();
		
		Assert.assertTrue(alert.getText().contains("Customer added successfully"),"Customer not added successfully");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		alert.accept();
		
		
		
	}
}
