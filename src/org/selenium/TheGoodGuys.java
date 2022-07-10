package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TheGoodGuys {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\HariSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.thegoodguys.com.au/");
		
		WebElement search = driver.findElement(By.id("SimpleSearchForm_SearchTermB2C"));
		
	search.sendKeys("televisions");
	 WebElement btnClick = driver.findElement(By.id("desktop-searchsubmit"));
	 btnClick.click();
	 
	 WebElement btnclick1 = driver.findElement(By.id("searchBoxText"));
	 btnclick1.click();
	 
	 
	}

}
