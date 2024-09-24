package com.drap.and.drop;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	
	static WebDriver driver;
	
	
	
	public static void main(String[] args) {
		driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		String url = "http://demo.guru99.com/test/drag_drop.html";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.cssSelector("li[id=credit2])"));
		WebElement to = driver.findElement(By.xpath("//*[@id='bank']/li"));
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		driver.quit();
		

	}

}
