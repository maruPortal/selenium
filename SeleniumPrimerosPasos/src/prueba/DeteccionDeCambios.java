package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeteccionDeCambios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/maruca/gekodrivers/firefox/geckodriver");
		
//		creamos la instancia, le debemos pasar las caracteristicas que seteamos
		WebDriver driver = new FirefoxDriver();
		driver.get("https://github.com/"); //url que quiero que abra
		
//		deteccion de cambios en la url
		System.out.println("ruta: "+ driver.getCurrentUrl());
		
		WebElement enlace = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[1]"));
		enlace.click();
		
		System.out.println("ruta nueva: "+ driver.getCurrentUrl());
		
		
//		detectar cambios en el titulo
		System.out.println("titulo: "+ driver.getTitle());
		driver.get("https://www.google.com/webhp?client=firefox-b-d");
		System.out.println("titulo luego de cambiar url: "+ driver.getTitle());
		
//		abrir enlaces en tabs nuevos combinacion de teclas
//		String teclas = Keys.chord(Keys.CONTROL, Keys.RETURN);
//		selecciono elemento:
//		WebElement enlace2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[2]"));
//		enlace2.sendKeys(teclas);
//		driver.switchTo().window("");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('holis, soy un alert js');");
		
	}

//	https://www.guru99.com/accessing-forms-in-webdriver.html
}
