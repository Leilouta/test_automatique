package com.navigateur.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OuvrirNaviguerFenetre {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// instancier le webdriver 
		WebDriver driver = new ChromeDriver();
		// ouvrir url google.com
		driver.get("http://www.google.com/");
		// agrandir la fenetre
		driver.manage().window().maximize(); 
		// ouvrir une nouvelle fenetre 
        driver.switchTo().newWindow(WindowType.TAB); 
        driver.navigate().to("https://fr.wikipedia.org/wiki/Wikip%C3%A9dia:Accueil_principal"); // ouvrir url wikipedia 
        String titre =driver.getTitle();
        System.out.println(titre);
        driver.quit();
        
	}

}
