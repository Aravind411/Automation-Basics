package com.selenium.Handling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement siginButton=driver.findElement(By.className("signinbtn"));
		File fromsiginButton=siginButton.getScreenshotAs(OutputType.FILE);
		File tosiginButton=new File("C:\\Users\\Aravind M\\Pictures\\Selenium Screenshots\\"+System.currentTimeMillis()+".png");
		
		FileHandler.copy(fromsiginButton, tosiginButton);
				
	}

}
