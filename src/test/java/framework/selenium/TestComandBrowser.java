package framework.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestComandBrowser {
	
	 static WebDriver driver;
	   public static void main( String[] args )
	    {
		   comandbrowser();
	    }
	   public static void comandbrowser() {
		   System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://pt.stackoverflow.com/"); // site não pode estar logado se não o naveagdor entende como pishin
		   
		   String titulo = driver.getTitle();
		   System.out.println(titulo);
		   titulo= driver.getCurrentUrl();
		   System.out.println(titulo);
		  // System.out.println(titulo);
		   
		   driver.quit();
		  

	   }
}
