package com.webelement.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
	   
		String url = "https://demo.guru99.com/test/facebook.html";
		driver.get(url);
		driver.manage().window().maximize();
		// # pour dire ID email 
		String css_selector = "input#email";
		WebElement champs_email = driver.findElement(By.cssSelector(css_selector));
		champs_email.sendKeys("LEILA");
		
		//cssattribut 
		String css_selector_psw= "input[name=pass]";
		WebElement champs_psw = driver.findElement(By.cssSelector(css_selector_psw));
		champs_psw.sendKeys("BenTargem");
		
		// .pour dire classe 
		String css_selector_button= "label.uiButtonConfirm";
		WebElement champs_button = driver.findElement(By.cssSelector(css_selector_button));
		champs_button.click();
		
		String a = driver.findElement(By.cssSelector("font[color='#0000FF']")).getCssValue("color");
		System.out.println(a);
		
		
		
		

	}

}
