package Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import TestData.LoginData;
import Utilities.Utilitiy;
import junit.framework.Assert;

public class LoginPage {
	
	static String Usernamebox;
	static String Passwordbox;
	static String LoginButton;
	static String SubmiButton;
	static LoginData Data = new LoginData();
	WebDriver driver ;
	Utilitiy Util = new Utilitiy(); 
	

	public LoginPage() {
		// TODO Auto-generated constructor stub
			
	}
	
	public void assignLocators(WebDriver driver) {
		
		try {
			 Usernamebox = "email";
			 Passwordbox ="password";
			 LoginButton = "//*[@id='button-backtologin' and @class = 'e-btn e-tertiary login-button width-login-btn']";
			 SubmiButton = "next";
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		 	
		
	}
	
	@SuppressWarnings("deprecation")
	public void loginWithValidCred(WebDriver driver) {
		try {
			
			driver.get(Data.getLoginURL());
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Util.findElimentByXpath(driver, LoginButton).click();
			Util.findElimentById(driver, Usernamebox).sendKeys(Data.getUserName());
			Util.findElimentById(driver, Passwordbox).sendKeys(Data.getPassword());
			Util.findElimentById(driver, SubmiButton).click();
			String expectedTitle = "";
			String actualTitle = driver.getTitle();
		  	Assert.assertEquals(actualTitle, expectedTitle);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}	
	
	
}
