package Test;
import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;


public class LoginTest extends TestBase {
	
	LoginPage lobj=null;
	
	@BeforeTest
	public void init()
	{
		lobj=new LoginPage(driver);
		
	}
	
	@Test
	public void run()
	{
		lobj.enterLogin();
		Assert.assertEquals(lobj.url(),"https://am.dbw0bjyvnpgi3.amplifyapp.com/login?redirect=%2F");
	}
	

}
