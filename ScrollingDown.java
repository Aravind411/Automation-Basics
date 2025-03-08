package com.selenium.MouseEvents;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();//named object
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor script=(JavascriptExecutor)driver;//step 1
		
		script.executeScript("window.scrollBy(0,1000)");
		
		script.executeScript("window.scrollBy(0,-1000)");
		
		script.executeScript("window.scrollBy(0,1000)");
		
				
		
	}

}
