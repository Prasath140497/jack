package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\HariSelenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.quit();
	}

}
