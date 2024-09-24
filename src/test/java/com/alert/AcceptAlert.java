package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptAlert {

	// declaration un variable webelement (driver) 
	
	static WebDriver driver; 
	
	public static void main(String[] args) throws InterruptedException {
		
		// Initialisation du WebDriver pour Chrome
	    driver = new ChromeDriver();
	    
	    // URL de la page OrangeHRM à tester
	    String url = "http://demo.guru99.com/test/delete_customer.php";
	    
	    // Accéder à l'URL spécifiée
	    driver.get(url);
	    
	    // Maximiser la fenêtre du navigateur
	    driver.manage().window().maximize();
	    
	   driver.findElement(By.name("cusid")).sendKeys("Leila");
	   Thread.sleep(3000);
	   driver.findElement(By.name("submit")).click();
	   
	   driver.switchTo().alert().accept();
	   driver.switchTo().alert().accept();

	}

}
