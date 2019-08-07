package com.facebook.reachFacebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

@SuppressWarnings("unused")
public class facebookLoginPage {

	private WebDriver driver;

	@After
	public void tearDown() {
		driver.quit();
	}

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void OpenFB() {

		driver.get("https://www.facebook.com");
		System.out.println("FB Opened");
	}

	@Test
	public void OpenGmail() {
		driver.get("https://www.gmail.com");
		System.out.println("Gmail Opened");
	}

}
