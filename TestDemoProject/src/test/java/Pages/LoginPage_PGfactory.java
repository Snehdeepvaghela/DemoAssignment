package Pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestData.LoginData;

public class LoginPage_PGfactory {

	@FindBy(id = "email")
	WebElement Usernamebox;
	@FindBy(id = "password")
	WebElement Passwordbox;
	@FindBy(xpath = "//*[@id='button-backtologin' and @class = 'e-btn e-tertiary login-button width-login-btn']")
	WebElement LoginButton;
	@FindBy(id = "next")
	WebElement SubmiButton;
	@FindBy(xpath = "//*[@aria-label=\"Electoral registration\" and @class=\"submenuFocus dropdown\"]")
	WebElement Elector;
	LoginData Data = new LoginData();
	////*[@aria-label="Electoral registration" and @class="submenuFocus dropdown"]
	
	public LoginPage_PGfactory(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void buttonclick(WebElement element, WebDriver driver) {
		element.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void enterValue(WebElement element, String Value) {
		element.sendKeys(Value);

	}
	
	/*
	 * WebDriverWait wait = new WebDriverWait(driver, 40);
	 * wait.until(ExpectedConditions.elementToBeClickable(By.id("urelementid")));
	 */

	
	public void loginWithValidCred(WebDriver driver) {
		driver.get(Data.getLoginURL());
		buttonclick(LoginButton , driver);
		enterValue(Usernamebox, Data.getUserName());
		enterValue(Passwordbox, Data.getPassword());
		buttonclick(SubmiButton, driver);
		
	}

}
