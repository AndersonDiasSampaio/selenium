package framework.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestComandBrowser {

	static WebDriver driver;

	public static void main(String[] args) {
		classNamelocators();
	}

	public static void comandbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pt.stackoverflow.com/"); // site não pode estar logado se não o naveagdor entende como
														// pishin
		driver.navigate().to("https://www.facebook.com/");
		boolean teste;
		
		teste = driver.findElement(By.id("email")).isDisplayed();
		System.out.println(teste);
		String texto;
		texto=driver.findElement(By.linkText("Esqueceu a senha?")).getText();
		System.out.println(texto);
		driver.findElement(By.name("email")).sendKeys("anderson.dias.sampaio@hotmail.com");
		//driver.findElement(By.id("email")).sendKeys("anderson.dias.sampaio@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("tomanocU13");
		driver.findElement(By.linkText("Esqueceu a senha?")).getText();
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		// driver.findElement(By.linkText("Imagens")).click();
		driver.navigate().back();
		driver.navigate().forward();
		String titulo = driver.getTitle();
		System.out.println(titulo);
		titulo = driver.getCurrentUrl();
		System.out.println(titulo);
		try {
			//tempo sem fazer nada 
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(titulo);

		driver.quit();
		// System.out.println(titulo);

	}
	public static void advancedlocators() {
		System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pt.stackoverflow.com/"); // site não pode estar logado se não o naveagdor entende como
														// pishin
		driver.navigate().to("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement webElement : links) {
		System.out.println(webElement.getText());}
		
		
	}
	public static void classNamelocators() {
		System.setProperty("webdriver.chrome.driver", "C:/autodrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pt.stackoverflow.com/"); // site não pode estar logado se não o naveagdor entende como
														// pishin
		driver.findElement(By.className("s-btn__primary")).click(); // identificar qual é o identificador da classe no botão e não qual é algum estilo colocado neste
		

		
	}
	
}
