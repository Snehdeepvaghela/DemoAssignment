package com.testdemo;
import org.testng.annotations.Test;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginTest {
	
	static WebDriver driver;
	
	
  @Test
  public void loginWebsite() {
	  
	  LoginPage login = new LoginPage();
	  login.assignLocators(driver);
	  login.loginWithValidCred(driver);
  }
  @SuppressWarnings("deprecation")
@BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "./chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Closing the browser session");
  	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
