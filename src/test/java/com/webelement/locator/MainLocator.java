package com.webelement.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.AddHasLaunchApp;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainLocator {

	static WebDriver abdo;
	
	public static void main(String[] args) throws InterruptedException {
		//configuration de navigateur 
        WebDriverManager.chromedriver().setup();
        // instanciation de la variable abdo 
        abdo = new ChromeDriver();
        // Declare de type string nommé url
        String url ="https://www.google.com/";
        //appel à la variable dans la méthode get 
        abdo.get(url);
        abdo.manage().window().maximize();
        // déclarer une variable de type webelement 
        WebElement champsDeRechercheGoogle;
        // localise le web element par son ID 
        champsDeRechercheGoogle = abdo.findElement(By.id("APjFqb"));
        champsDeRechercheGoogle.sendKeys("Asma Sliti");
        champsDeRechercheGoogle.sendKeys(Keys.ENTER);
        abdo.navigate().back();
        String url_name = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        abdo.navigate().to(url_name);
        WebElement champsDeSaisieUserName;
        Thread.sleep(5000);
        //localiser un element par xpath 
        champsDeSaisieUserName = abdo.findElement(By.xpath("//input[@placeholder='Username']"));
        champsDeSaisieUserName.sendKeys("Admin");
        WebElement champsDeSaisieUserName1;
        
        //localiser un element par son classe name 
        champsDeSaisieUserName1 = abdo.findElement(By.className("oxd-input"));
        champsDeSaisieUserName1.sendKeys("Leila");
        WebElement champsDeSaisiePasseword;
        champsDeSaisiePasseword = abdo.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        champsDeSaisiePasseword.sendKeys("admin123");
        //WebElement button_login;
        // localiser un element par son classe_name
        //button_login = abdo.findElement(By.className("oxd-button"));
         // button_login.click();
        Thread.sleep(3000);
        //WebElement button_login;
        //localiser un element par son tagname
        //button_login = abdo.findElement(By.tagName("button"));
        //button_login.click();
        
        WebElement link_hrm;
        //localiser un element par son nom
        link_hrm = abdo.findElement(By.linkText("OrangeHRM, Inc"));
        link_hrm.click();
        Thread.sleep(5000);
        String mainWindow = abdo.getWindowHandle();// Enregistrer le handle (identifiant) de la fenêtre principale.
		abdo.switchTo().newWindow(WindowType.TAB);//  bascule vers une nouvelle fenêtre de type onglet
		// Ouvrir un nouvel onglet et naviguer vers Orange HRM 
        abdo.navigate().to(url_name);
        WebElement link_en;
        link_en = abdo.findElement(By.partialLinkText("INC"));
        link_en.click();
        
        
        
        
        
        
        
			
		
	}

}
