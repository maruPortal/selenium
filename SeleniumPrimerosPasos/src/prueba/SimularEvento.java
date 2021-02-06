package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SimularEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/maruca/gekodrivers/firefox/geckodriver");
		
//		creamos la instancia, le debemos pasar las caracteristicas que seteamos
		WebDriver driver = new FirefoxDriver();
		driver.get("https://github.com/"); //url que quiero que abra
	
//		en los proximos dos pasos simulamos el evento click
		WebElement boton = driver.findElement(By.id("id"));
		boton.click();
		
//		busca la imagen ocn X id
//		WebElement img = driver.findElement(By.id("idDeImg"));
		
		Actions accion = new Actions(driver);
//		accion.moveToElement(img).build();
	}

}
