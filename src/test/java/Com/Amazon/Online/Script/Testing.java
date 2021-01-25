package Com.Amazon.Online.Script;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Amazon.Online.Base.Testbase;
import Com.Amazon.Online.pages.LoginPage;

public class Testing extends Testbase
{
    LoginPage log;
    
    @BeforeTest(alwaysRun=true)
    public void Setup()
    {
    	Open();
    	log = new LoginPage();
    }
    
    @Test
    public void ValidateTitle()
    {
    	String t= log.VerifyTitle();
    	Assert.assertEquals(t, "Facebook – log in or sign up");
    }
    
    @Test
    public void ValidateUrl()
    {
    	String u= log.VerifyUrl();
    	Assert.assertEquals(u, "https://www.facebook.com/");
    }
    
    @Test
    public void Validategettext()
    {
    	String p= log.VerifyCreateText();
    	Assert.assertEquals(p, "Create New Account");
    }
    
    
    @AfterTest
    public void Teardown()
    {
    	driver.close();
    }


}
