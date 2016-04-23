package com.sqa.lp.gmail;

import static org.testng.Assert.*;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.*;

public class GmailTests {
	private boolean acceptNextAlert = true;
	private String baseUrl;
	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		this.driver = new FirefoxDriver();
		this.baseUrl = "https://accounts.google.com/";
		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		this.driver.quit();
		String verificationErrorString = this.verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@Test
	public void testGmailTests() throws Exception {
		this.driver.get(this.baseUrl
				+ "/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1");
		// this.driver.findElement(By.id("choose-account-0")).click();
		this.driver.findElement(By.id("Email")).clear();
		this.driver.findElement(By.id("Email")).sendKeys("PratAutoTest1");
		this.driver.findElement(By.id("next")).click();
		this.driver.findElement(By.id("Passwd")).clear();
		this.driver.findElement(By.id("Passwd")).sendKeys("autotest1");
		this.driver.findElement(By.id("signIn")).click();
		this.driver.findElement(By.id(":3k")).click();
		this.driver.findElement(By.cssSelector("span.gb_2a.gbii")).click();
		this.driver.findElement(By.id("gb_71")).click();
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = this.driver.switchTo().alert();
			String alertText = alert.getText();
			if (this.acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			this.acceptNextAlert = true;
		}
	}

	private boolean isAlertPresent() {
		try {
			this.driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private boolean isElementPresent(By by) {
		try {
			this.driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
