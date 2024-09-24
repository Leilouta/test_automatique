package com.navigateurs.capabilities.options;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFirefoxOptions {

	public static void main(String[] args) {
		FirefoxOptions firefoxoptions = new FirefoxOptions();
		
		//firefoxoptions.addArguments("--incognito");
		
		firefoxoptions.addArguments("--window-size=1920,1080");
		firefoxoptions.addArguments("--lang=eng");
		
		// le code il tourne sans voir l'execution 
		//firefoxoptions.addArguments("--headless");
		
		//  eliminer les  extensions 
		firefoxoptions.addArguments("--disable-extensions");
		
		// Configurer WebDriverManager pour gérer automatiquement le téléchargement et
		// la configuration du pilote Chrome
		
		WebDriver driver =new FirefoxDriver(firefoxoptions);
		// ouvrir un navigateur 
		driver.get("https://www.google.com/");
		 
	}

}
