package org.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void edgebrowser() {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();

	}
	public static WebDriver lanuchBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver();  
		}
		return driver;

	}
	public static void urlLanuch(String url) {
		driver.get(url);
		driver.manage().window().maximize();

	}
	public static void implicitlywait(int a) {
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);

	}
	public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);

	}
	public static void quit() {
		driver.quit(); 

	}
	public static void click(WebElement e) {
		e.click();

	}
	public static void javascript(String a,WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript(a, e);

	}

}
 