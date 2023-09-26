package com.brainzhive.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.brainzhive.base.BaseTest;

public class BankManagerLoginTest extends BaseTest {

	@Test
	public void loginAsBankManager() {

		click("bmlBtn_CSS");

		
		SoftAssert softAssert = new SoftAssert();
		
		//Assert.assertTrue(isElementPresent("addCustomer_XPATH"), "Bank manager login failed");
		
		
		softAssert.assertTrue(isElementPresent("addCustomer_XPATH"), "Bank manager login failed");
		
		softAssert.assertAll();

	}

}
