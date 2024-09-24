package com.navigateurs.capabilities.options;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserEdgesOptions {

	public static void main(String[] args) {
		 //Création d'une instance de ChromeOptions pour définir des
		// options spécifiques pour le navigateur Chrome
		
		EdgeOptions edgeOptions = new EdgeOptions();
		
		// navigation privé 
		
		edgeOptions.addArguments("--incognito");
		
		edgeOptions.addArguments("--window-size=1920,1080");
		edgeOptions.addArguments("--lang=eng");
		
		// le code il tourne sans voir l'execution 
		//edgeOptions.addArguments("--headless");
		
		//  eliminer les  extensions 
		edgeOptions.addArguments("--disable-extensions");
		
		// Configurer WebDriverManager pour gérer automatiquement le téléchargement et
		// la configuration du pilote Chrome
		
		WebDriver driver =new EdgeDriver(edgeOptions);
		// ouvrir un navigateur 
		driver.get("https://www.google.com/");
		
		//agrandir la fenetre 
		//driver.manage().window().maximize();

	}

}
