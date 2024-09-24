package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DismissAler {
     static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver(); 
		String url = "http://demo.guru99.com/test/delete_customer.php";
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.name("cusid")).sendKeys("Leila");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();

	}

}