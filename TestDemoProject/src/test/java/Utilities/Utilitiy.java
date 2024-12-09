package Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilitiy {

	public Utilitiy() {
		// TODO Auto-generated constructor stub
	}
	public WebElement findElimentById(WebDriver driver,String locator) {
		
		WebElement element = driver.findElement(By.id(locator));
		return element;
	}
	
	public WebElement findElimentByXpath(WebDriver driver,String locator) {
		
		WebElement element = driver.findElement(By.xpath(locator));
		return element;
	}
	
	public void WaitForObjVisible(WebDriver driver , WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
		


}
