package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Config.ReadConfig;

public class LoginPage extends TestBase {
	
	//WebDriver driver;
	ReadConfig robj=new ReadConfig();
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement Username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement SignButton;
	
	
	public LoginPage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver,this);
	}
	 public String url() {
		    return driver.getCurrentUrl();

		}
	 public void enterLogin()
	 {
		 Username.sendKeys(robj.getLocator("UserName"));
		 Password.sendKeys(robj.getLocator("Password"));
		 SignButton.click();
	 }

}
