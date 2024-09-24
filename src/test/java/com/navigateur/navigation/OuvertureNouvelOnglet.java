package com.navigateur.navigation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OuvertureNouvelOnglet {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();// configurer le navigateur
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");// Ouvrir la page d'accueil de Google.
		driver.manage().window().maximize();// Maximiser la fenêtre du navigateur.
		String mainWindow = driver.getWindowHandle();// Enregistrer le handle (identifiant) de la fenêtre principale.
		driver.switchTo().newWindow(WindowType.TAB);//  bascule vers une nouvelle fenêtre de type onglet
		driver.navigate().to("https://www.bing.com/");// Ouvrir un nouvel onglet et naviguer vers Bing.
		driver.switchTo().newWindow(WindowType.TAB); //  bascule vers une nouvelle fenêtre de type onglet
		driver.navigate().to("https://www.facebook.com/");// Ouvrir un autre nouvel onglet et naviguer vers Yahoo.
		Set<String> allWindows = driver.getWindowHandles();//stocke les identifiants de toutes les fenêtres ouvertes par le navigateur.

		for (String windowHandle : allWindows) // Boucle à travers chaque identifiant de onglet
		{
			driver.switchTo().window(windowHandle);// Bascule vers la fenêtre/onglet correspondant à l'identifiant actuel
			System.out.println("le titre de l'onglet" + driver.getTitle());
		}

		
		
		for(String windowHandle : allWindows)// Boucle à travers chaque identifiant de onglet
		{
			if(! windowHandle.equals(mainWindow))// Vérifie si l'identifiant de l'onglet n'est pas celui de la fenêtre principale
			{
				driver.switchTo().window(windowHandle);// Bascule vers l'onglet correspondant à l'identifiant actuel
				driver.close();// Ferme l'onglet actuel
			}
		}
		
		driver.switchTo().window(mainWindow); 
        System.out.println("le dernier onglet ouvert est : " +driver.getCurrentUrl());
		
	}

}
