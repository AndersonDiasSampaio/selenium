package framework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
		   driver.navigate().to("https://www.facebook.com/");
		   driver.findElement(By.id("email")).sendKeys("anderson.dias.sampaio@hotmail.com");
		   driver.findElement(By.id("pass")).sendKeys("tomanocU13");
		   Actions act = new Actions(driver);
		   act.sendKeys(Keys.ENTER).build().perform();
		  // driver.findElement(By.linkText("Imagens")).click();
		   driver.navigate().back();
		   driver.navigate().forward();
		   String titulo = driver.getTitle();
		   System.out.println(titulo);
		   titulo= driver.getCurrentUrl();
		   System.out.println(titulo);
		  // System.out.println(titulo);
		   
		 
		  

	   }
}
