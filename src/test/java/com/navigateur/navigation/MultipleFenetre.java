package com.navigateur.navigation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleFenetre {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.wikipedia.org/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.stackoverflow.com/");

		// stocke les identifiants de toutes les fenêtres ouvertes par le navigateur.

		Set<String> allWindows = driver.getWindowHandles();

		// Boucle à travers chaque identifiant de fenetre
		
		for (String windowHandle : allWindows) { 
			// swicher d'une fenetre à une autre
			driver.switchTo().window(windowHandle);
			System.out.println("le titre de l'onglet" + driver.getTitle());

		}
		driver.quit();// fermer tous les fenetre ouvert
	}
}
