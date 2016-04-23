package com.sqa.lp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;
import org.testng.annotations.*;

public class BasicAutoTest {

	static WebDriver driver;

	@BeforeClass(enabled = true, groups = "chrome")
	public static void setUpChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		driver = new ChromeDriver();

		driver.get("http://gmail.com");
		Thread.sleep(1000);// not recommended, used only when we need the test
							// to wait for something (eg. a page that takes time
							// to load)
	}

	@BeforeClass(enabled = false, groups = "firefox")
	public static void setUpFirefox() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	@BeforeClass(enabled = false, groups = "safari")
	public static void setUpSafari() throws InterruptedException {
		driver = new SafariDriver();
		driver.get("http://gmail.com");
		Thread.sleep(1000);
	}

	@DataProvider(name = "UserAccountInfo")
	public Object[][] getData() {
		Object[][] data = { { "PratAutoTest1", "autotest1" }, { "PratAutoTest2", "autotest2" },
				{ "PratAutoTest3", "autotest3" } };
		return data;
	}

	@Test(dataProvider = "UserAccountInfo")
	public void test(String userName, String password) {
		System.out.println("Basic Test: U- " + userName + " P- " + password);

	}

}
