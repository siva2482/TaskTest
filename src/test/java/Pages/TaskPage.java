package Pages;

import java.util.List;

import org.openqa.selenium.By;
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
		 TitleBox.sendKeys("UnitTesting");
		 TitleText.sendKeys("TO check each functionalities ofthe system");
		 TitleDate.sendKeys("12/02/2021");
		 Taskbutton.click();
		 
	 }
	 public void deleteTask()
	 {
		 //driver.findElement(By.xpath("(//div//child::div[@class='card w-100']//input[@type='file'])[1]")).click();
		// driver.findElement(By.xpath("(//div//child::div[@class='card w-100']//input[@type='file'])[1]")).sendKeys("D://input.txt");
		 //driver.findElement(By.xpath("(//button[contains(text(),'Upload')])[1]")).click();
		 List<WebElement> tasks=driver.findElements(By.xpath("//div//child::h5"));
		 for(int i=0;i<tasks.size();i++)
		 {
		 if(tasks.get(i).getText().equalsIgnoreCase("Sanity testing"))
		 {
			 driver.findElement(By.xpath("//div//button[contains(text(),'Delete')]")).click();
		 }
		 
	 }
	

}
}
