package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.TaskPage;

public class deleteTest extends TestBase{
TaskPage tobj=null;
	
	@BeforeTest
	public void init()
	{
		tobj=new TaskPage(driver);
		
	}
	@Test
	public void run()
	{
		tobj.checkDelete();
	}

}
