
		package com.webelement.locator;

		import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class XpathLocators {
			static WebDriver driver;

			public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				String url = "https://demo.guru99.com/test/selenium-xpath.html";
				driver.get(url);
				driver.manage().window().maximize();
				
				// Thread.sleep(3000);

				// Déclarer une variable XpathAbsolue
				String xpathAbsolue = "/html/body/div[4]/div[1]/div/h4[1]/b[1]";
				WebElement tableText1 = driver.findElement(By.xpath(xpathAbsolue));
				// Récupérer le text
				String text1 = tableText1.getText();
				// Afficher le texte dans la console
				System.out.println("Le text de tableText1 est " + text1);
				String xpathRelatif = "//div[@class='featured-box cloumnsize1']//h4[1]//b[1]";
				WebElement tabletext2 = driver.findElement(By.xpath(xpathRelatif));
				System.out.println(tabletext2.getText());
				
			}	
				
			}

		

	


