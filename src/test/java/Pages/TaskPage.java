package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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
		 TitleBox.sendKeys("Example Testing");
		 TitleText.sendKeys("TO check each integration functionalities ofthe system");
		 TitleDate.sendKeys("12/02/2021");
		 Taskbutton.click();
		 
	 }
	 public void deleteTask() throws InterruptedException
	 {
		 //driver.findElement(By.xpath("(//div//child::div[@class='card w-100']//input[@type='file'])[1]")).click();
		// driver.findElement(By.xpath("(//div//child::div[@class='card w-100']//input[@type='file'])[1]")).sendKeys("D://input.txt");
		 //driver.findElement(By.xpath("(//button[contains(text(),'Upload')])[1]")).click();
		 List<WebElement> tasks=driver.findElements(By.xpath("//div//child::h5"));
		 try
		 {
		 for(WebElement e:tasks)
		 {
		 if(e.getText().equalsIgnoreCase("Selenium"))
		 {
			 Thread.sleep(4000);
			 e.findElement(By.xpath("//div//h5//preceding-sibling::button")).click();
		 }
		 }
		 }catch(StaleElementReferenceException s)
		 {
			 System.out.println(s);
		 }
		 
	 
	 }
		 public void checkDelete()
		 {
			 int count=0;
		 
			 List<WebElement> tasks=driver.findElements(By.xpath("//div//child::h5"));
			 for(WebElement x:tasks)
			 {
			 if(x.getText().equalsIgnoreCase("Selenium"))
			 {
				count++; 
			 }
			 }
			 if(count==0)
			 {
				 System.out.println("Item Deleted");
			 }
		 
	
		 }

}
