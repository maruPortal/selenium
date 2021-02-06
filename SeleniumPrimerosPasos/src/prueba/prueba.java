package prueba;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class prueba {

	public static void main(String[] args) {
		
/*
 * Se crea una instancia del navegador firefox y se setean parámetros
 * */
		System.setProperty("webdriver.gecko.driver", "/home/maruca/gekodrivers/firefox/geckodriver");
		
//	CONTROLES DEL NAVEGADOR
		FirefoxOptions firefoxOpt = new FirefoxOptions();
		
//	para modificar la posición del navegador
		firefoxOpt.addArguments("--window-position=150,750");
		
//	modificar el tamaño del navegador
		firefoxOpt.addArguments("--window-size=800,500");
		
//	creamos la instancia, le debemos pasar las caracteristicas que seteamos
		WebDriver driver = new FirefoxDriver(firefoxOpt);
		driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada"); //url que quiero que abra

//		luego de crearse la instancia, la minimiza:
		driver.manage().window().minimize();
		
//		le decimos las dimensiones a tomar:
		Dimension dimension = new Dimension(100, 100);
		driver.manage().window().setSize(dimension);
		
//		"headless" acceder a información a traves del navegador
		System.out.println("titulo de url accedida: "+ driver.getTitle());
		
		
//		le decimos al navegador que cierre-no indica que la prueba finaliza
		driver.close();

	}

}
