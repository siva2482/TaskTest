package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.TaskPage;

public class TaskTest extends TestBase {
TaskPage tobj=null;
	
	@BeforeTest
	public void init()
	{
		tobj=new TaskPage(driver);
		
	}
	
	@Test
	public void run()
	{
	
	//Assert.assertEquals(tobj.url(),"https://am.dbw0bjyvnpgi3.amplifyapp.com");
	System.out.println("Task page reached");
	String s=driver.findElement(By.xpath("(//nav//child::a)[1]")).getText();
	Assert.assertEquals(s,"Task List");
	System.out.println("Task list entered");
	tobj.enterTask();
	}

}
