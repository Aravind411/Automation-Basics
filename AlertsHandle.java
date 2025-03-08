package com.selenium.alertHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/feed/history");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement signinButton=driver.findElement(By.className("style-scope ytd-app"));
		signinButton.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	}

}
