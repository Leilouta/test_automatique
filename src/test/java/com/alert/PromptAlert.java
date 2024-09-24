package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		String url= "https://demoqa.com/alerts";
		driver.get(url);
		 driver.manage().window().maximize();
		 driver.get(url);
		 Thread.sleep(3000);
		  WebElement button =  driver.findElement(By.id("promtButton"));
		  
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click()" , button);
		 Alert promptAlert = driver.switchTo().alert();
		 promptAlert.sendKeys("je t'aime Leilouta"); 
		 promptAlert.accept();
		
		 }

		}
