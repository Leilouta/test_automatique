package com.bouttonradio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BouttonRadio {
static WebDriver driver; 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		String url= "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement bouttonRadioMozilla = driver.findElement(By.xpath("//input[@value='Mozilla']"));
		bouttonRadioMozilla.click();
		
		System.out.println( "le boutton radio Mozilla est : " + bouttonRadioMozilla.isSelected());
		
		driver.close();

	}

}
