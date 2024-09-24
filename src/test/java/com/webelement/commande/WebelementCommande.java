package com.webelement.commande;


import javax.swing.tree.AbstractLayoutCache.NodeDimensions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebelementCommande {

	public static void main(String[] args) throws InterruptedException {

	    // Initialisation du WebDriver pour Chrome
	    WebDriver driver = new ChromeDriver();
	    
	    // URL de la page OrangeHRM à tester
	    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    
	    // Accéder à l'URL spécifiée
	    driver.get(url);
	    
	    // Maximiser la fenêtre du navigateur
	    driver.manage().window().maximize();
	    
	    // Obtenir le titre de la page actuelle
	    String title = driver.getTitle();
	    
	    // Obtenir l'URL actuelle
	    String currenturl = driver.getCurrentUrl();
	    
	    // Afficher le titre de la page et l'URL actuelle dans la console
	    System.out.println("Le titre de la page est: " + title + "  L'URL actuelle est: " + currenturl);
	    
	    // Pause de 3 secondes pour laisser le temps de charger la page (non recommandé dans la pratique)
	    Thread.sleep(3000);
	    
	    // Localisation du champ de saisie du nom d'utilisateur via son attribut 'name'
	    WebElement champName = driver.findElement(By.xpath("//input[@name='username']"));
	    
	    // Vérification si le champ est sélectionné (souvent utilisé pour les cases à cocher, ici non pertinent)
	    boolean statut = champName.isSelected();
	    
	    // Affichage du statut de sélection du champ dans la console
	    System.out.println("Le champ username est-il sélectionné: " + statut);
	    
	    // Saisie du texte "Leila" dans le champ de saisie du nom d'utilisateur
	    champName.sendKeys("Leila");
	    
	    // Effacement du contenu du champ de saisie
	    champName.clear();
	    
	    // Localisation d'un lien texte par son texte visible "OrangeHRM, Inc"
	    WebElement linktext = driver.findElement(By.linkText("OrangeHRM, Inc"));
	    
	    // Vérification si le lien est affiché sur la page
	    boolean statutLinktext1 = linktext.isDisplayed();
	    
	    // Vérification si le lien est activé (cliquable)
	    boolean statutLinktext2 = linktext.isEnabled();
	    
	    // Récupération du texte du lien
	    String textlink = linktext.getText();
	    
	    // Affichage du texte du lien et de ses statuts (affiché et activé) dans la console
	    System.out.println("Le texte du lien est: " + textlink + "\nAffiché ?  " + statutLinktext1 + "\nActif ? " + statutLinktext2);
	    
	    // Fermeture du navigateur (non inclus dans le script mais généralement recommandé)
	    // créer un webelement boutton 
	    WebElement boutton = driver.findElement(By.tagName("button"));
	    // enregistrer le tagname dans un variable et l'afficher 
	    String bouttonTagName = boutton.getTagName();
	    System.out.println(bouttonTagName);
	    // enregistrer Cssvalue dans un variable et l'afficher
	    String cssValue = boutton.getCssValue("font-size");
	    System.out.println(cssValue);
	    // enregistrer l'attibiut  dans un variable et l'afficher
	    String attributValue = boutton.getAttribute("type");
	    System.out.println(attributValue);
	    
	    // enregistrer les dimensions et l'afficher 
	    
	    Dimension dimenions = boutton.getSize();
	    System.out.println(dimenions.height +"\n"+ dimenions.width);
	    
	    Point point =boutton.getLocation();
	    System.out.println("X cordinate : " + point.x + "\n Y cordinate: " + point.y);
	    
	    boutton.submit();
	    // boutton.click();
	    
	    
	    
	    
	    //driver.quit(); // Décommenter pour fermer le navigateur à la fin du test
	}
}


