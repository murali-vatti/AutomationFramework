package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.HomePage;
import pages.NewCarsPage;
import utilities.DataUtil;

public class CarNameAndPriceTest extends BaseTest {

	@Test(dataProviderClass = DataUtil.class, dataProvider = "data")
	public void carNameAndPrice(String browser, String runMode, String carBrand) {

		if (runMode.equals("N")) {

			throw new SkipException("Skipping the test as the run mode is No");
		}

		setUp(browser);

		HomePage home = new HomePage(driver);
		NewCarsPage car = home.goToFindNewCars();

		if (carBrand.equals("bmw")) {

			car.gotoBMW();

		} else if (carBrand.equals("kia")) {

			car.gotoKia();

		} else if (carBrand.equals("honda")) {

			car.gotoHonda();

		} else if (carBrand.equals("toyota")) {

			car.gotoToyota();

		}

		BasePage.carBase.getCarNameAndPrices();

	}

}
