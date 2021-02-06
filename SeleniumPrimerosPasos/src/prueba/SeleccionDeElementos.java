package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleccionDeElementos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/maruca/gekodrivers/firefox/geckodriver");
		
//		creamos la instancia, le debemos pasar las caracteristicas que seteamos
		WebDriver driver = new FirefoxDriver();
		driver.get("https://github.com/"); //url que quiero que abra
	
//		nos quedamos con el texto contenido en el id pasado por parametro
		WebElement elem = driver.findElement(By.id("start-of-content"));
		System.out.println(elem.getText());
		
// 		seleccionamos por clase
		WebElement elem2 = driver.findElement(By.className("sr-only"));
		System.out.println(elem2.getText());
		
////		seleccionar por atributo, nombre y etiqueta
//		WebElement elem3 = driver.findElement(By.name("id"));
//		System.out.println(elem2.getText());
	
//		XPATH
		WebElement elem4 = driver.findElement(By.xpath("/html/body/div[4]/main/div/div[1]/div[1]/div[1]/div/div/div[1]/h1"));
		System.out.println("XPATH: "+elem4.getText());
	}

}
