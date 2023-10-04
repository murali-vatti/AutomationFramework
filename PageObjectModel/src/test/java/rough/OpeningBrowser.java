package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Added sample test
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		
		
		

	}

}
