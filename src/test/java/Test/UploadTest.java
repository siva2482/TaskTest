package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.TaskPage;

public class UploadTest extends TestBase{
	
TaskPage tobj=null;
	
	@BeforeTest
	public void init()
	{
		tobj=new TaskPage(driver);
		
	}
	@Test
	public void run() throws InterruptedException
	{
		tobj.deleteTask();
	}

}
