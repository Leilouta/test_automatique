package com.boutonradio;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioBoutton {
        static WebDriver driver; 
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		String url = "https://selenium08.blogspot.com/2019/08/radio-buttons.html";
		driver.manage().window().maximize();
		driver.navigate().to(url);
		// M1
		// WebElement radiobuttonR =
		// driver.findElement(By.xpath("//input[@name='red']"));
		// M2
		
		
		String xpathButtonRadioRed = "//input[@name='red']";
		WebElement radiobuttonR = driver.findElement(By.xpath(xpathButtonRadioRed));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", radiobuttonR);

		// M1
		// System.out.println("bouton Red: " + radiobuttonR.isSelected());
		// M2

		
		boolean redselected = radiobuttonR.isSelected();
		System.out.println("bouton Red: " + redselected);

		String xpathButtonRadioYellow = "//input[@name='yellow']";
		WebElement radiobuttonY = driver.findElement(By.xpath(xpathButtonRadioYellow));
		// radiobuttonY.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", radiobuttonY);
		System.out.println("bouton yellow: " + radiobuttonY.isSelected());
		WebElement radiobuttonB = driver.findElement(By.name("blue"));

		if (!radiobuttonB.isSelected()) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", radiobuttonB);

			System.out.println("le bouton est selectionné");
		} else {
			System.out.println("le bouton n'est pas selectionné");

		}

	


	}

}
