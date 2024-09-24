package com.drap.and.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrageAndDropPixel {

	static ChromeDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		String url = "http://demo.guru99.com/test/drag_drop.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.cssSelector("li.block14 a.button button-orange"));
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.dragAndDropBy(from, 110, 40).perform();
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
