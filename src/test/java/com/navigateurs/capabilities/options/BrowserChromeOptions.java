package com.navigateurs.capabilities.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BrowserChromeOptions {

	public static void main(String[] args) {
		 //Création d'une instance de ChromeOptions pour définir des
		// options spécifiques pour le navigateur Chrome
		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		// navigation privé 
		
		//chromeOptions.addArguments("--incognito");
		
		chromeOptions.addArguments("--window-size=1920,1080");
		chromeOptions.addArguments("--lang=eng");
		
		// le code il tourne sans voir l'execution 
		//chromeOptions.addArguments("--headless");
		
		//  eliminer les  extensions 
		chromeOptions.addArguments("--disable-extensions");
		
		// Configurer WebDriverManager pour gérer automatiquement le téléchargement et
		// la configuration du pilote Chrome
		
		WebDriver driver =new ChromeDriver(chromeOptions);
		// ouvrir un navigateur 
		driver.get("https://www.google.com/");
		//agrandir la fenetre 
		//driver.manage().window().maximize();
		
		
		
		

	}

}
