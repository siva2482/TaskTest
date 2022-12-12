package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class TaskPage extends TestBase{
	
	@FindBy(id="taskTitleInput")
	WebElement TitleBox;
	@FindBy(id="taskBodyInput")
	WebElement TitleText;
	@FindBy(id="datepickerduedate")
	WebElement TitleDate;
	@FindBy(xpath="//button[contains(text(),' Create task ')]")
	WebElement Taskbutton;
	
	
	public TaskPage(WebDriver driver)
	{
		this .driver=driver;
		PageFactory.initElements(driver,this);
	}
	 public String url() {
		    return driver.getCurrentUrl();

		}
	 public void enterTask()
	 {
		 TitleBox.sendKeys("SmokeTesting");
		 TitleText.sendKeys("TO check the critical functionalities ofthe system");
		 TitleDate.sendKeys("12/02/2021");
		 Taskbutton.click();
		 
	 }
	

}
