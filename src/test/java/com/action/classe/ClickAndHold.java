package com.action.classe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {

	static WebDriver driver; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver(); 
         String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
         driver.get(url);
         driver.manage().window().maximize();
         
         
	}

}
