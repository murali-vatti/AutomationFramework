package com.brainzhive.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.brainzhive.base.BaseTest;

public class BankManagerLoginTest extends BaseTest {

	@Test
	public void loginAsBankManager() {

		click("bmlBtn_CSS");

		Assert.assertTrue(isElementPresent("addCustomer_XPATH"), "Bank manager login failed");

	}

}
