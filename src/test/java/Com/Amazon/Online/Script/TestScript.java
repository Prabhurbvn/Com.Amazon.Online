package Com.Amazon.Online.Script;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Com.Amazon.Online.Base.Testbase;
import Com.Amazon.Online.Utils.Testutil;
import Com.Amazon.Online.pages.LoginPage;

public class TestScript extends Testbase
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
    	Assert.assertEquals(t, "Facebook � log in or sign up");
    }
    
    @Test
    public void ValidateUrl()
    {
    	String u= log.VerifyUrl();
    	Assert.assertEquals(u, "https://www.facebook.com/");
    }
    
    @Test
    public void ValidateClick()
    {
    	
    	log.VerifyCreateClick();
    }
    
    @Test
    public void Validategettext()
    {
    	String p= log.VerifyCreateText();
    	Assert.assertEquals(p, "Create New Account");
    }
    
    @Test
    public void ValidateFirstname()
    {
    	log.VerifyFirstname("Bharathi");
    }
    
    @Test
    public void ValidateSurname()
    {
    	log.VerifySurname("A");
    }
    
    @Test
    public void Daydropdown()
    {
    	Testutil.Date_Dropdown(log.Day_Drop,2);
    }
    
    @Test
    public void Monthdropdown()
    {
    	Testutil.Month_Dropdown(log.Month_Drop,"Jan");
    }
    
    @Test
    public void Yeardropdown()
    {
    	Testutil.Year_Dropdown(log.Year_Drop,"1994");
    }
    
    @Test
    public void ValidateFemaleRadio()
    {
    	boolean g = log.VerifyRadiobutton();
    	Assert.assertTrue(g);
    }
    
   
    
    @AfterTest
    public void Teardown()
    {
    	driver.close();
    }
}
