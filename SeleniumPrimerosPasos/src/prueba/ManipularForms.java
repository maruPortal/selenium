package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ManipularForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/maruca/gekodrivers/firefox/geckodriver");
		
//		creamos la instancia, le debemos pasar las caracteristicas que seteamos
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guarani-informatica.unlp.edu.ar/acceso/login?ref=http://www.guarani-informatica.unlp.edu.ar/historia_academica"); //url que quiero que abra
		
//		IMPORTANTE: el código debe tener ID 
		
//		inyectar texto en input
		driver.findElement(By.name("usuario")).sendKeys("123456789");
		driver.findElement(By.name("password")).sendKeys("123456789");
		
//		para seleccionar opción en un Radio
//		driver.findElement(By.id("idDeRadio")).click();
		
//		para seleccionar en un select
//		Select topic = new Select(driver.findElement(By.id("idSelect")));
//		topic.selectByVisibleText("textoVisualizadoEnselect");
		
//		checkboxes: activar/desactivar:
//		lo podemos seleccionar con el id.
//		WebElement cond = driver.findElement(By.id("id"));
//		if (!cond.isSelected()) {
//				cond.sendKeys(Keys.SPACE);
//		}
		
//		enviar el formulario
//		driver.findElement(By.id("login")).click(); //no recomendado 
		driver.findElement(By.id("login")).submit(); 
		

	}

}
