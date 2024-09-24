package com.navigateur.navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ManipulerNavigateur {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // configurer chrome
		WebDriver driver = new ChromeDriver(); // créer une instance de chromeDriver
		driver.manage().window().maximize(); // Maximiser le navigateur 
		driver.get("https://www.google.com"); // naviguer vers l'url 
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.navigate().to("https://med.tn"); // ouvrir l'URL 
		String URL1=driver.getCurrentUrl(); // obtenir URL actuel
		System.out.println(URL1);
		
		driver.manage().window().minimize();
		driver.navigate().back(); // Retourner à la page précédente 
		driver.navigate().refresh(); // refrechir le navigateur 
		String URL2= driver.getCurrentUrl();
		System.out.println(URL2);
		driver.navigate().forward();// page suivante 
		String URL3 = driver.getCurrentUrl(); 
		System.out.println(URL3);
		
		 // Obtenir le titre actuel de la page
		
        String actualTitle = driver.getTitle();

        // Titre attendu
        
        String expectedTitle = "Med.tn : Prenez rendez-vous en ligne avec un professionnel de santé - med.tn";

        // Comparer les titres
        
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Le titre de la page correspond au titre attendu.");
        } else {
            System.out.println("Le titre de la page ne correspond pas au titre attendu.");
            System.out.println("Titre actuel : " + actualTitle);
            System.out.println("Titre attendu : " + expectedTitle);
        }
        
        driver.close();

	}

}
