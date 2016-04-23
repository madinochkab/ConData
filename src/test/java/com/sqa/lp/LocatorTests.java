package com.sqa.lp;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.*;
import org.testng.annotations.*;

import com.sqa.lp.util.helpers.*;

public class LocatorTests {

	WebDriver driver;

	@BeforeClass(enabled = true, groups = "firefox")
	public void setUpFirefox() throws InterruptedException {
		this.driver = new FirefoxDriver();
	}

	@Test(priority = 1)
	public void test1() {

		List<WebElement> links = Locator.getLinks(this.driver);
		int i = 1;
		for (WebElement link : links) {
			String text = link.getText();
			if (text.equals("")) {
				text = "Non-text element (" + i + ")";
				i++;
			}
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		// List<WebElement> tagNames = Locator.getByTagName(driver, "div");
	}

	@Test(priority = 0)
	public void test2() {

		System.out.println("Test for getByTagName");

		String pageTitle = "MSN.com - Hotmail, Outlook, Skype, Bing, Latest News, Photos & Videos";
		this.driver.get("http://msn.com");
		Assert.assertEquals(this.driver.getTitle(), pageTitle, "Page load does not seem successful");

	}

}
