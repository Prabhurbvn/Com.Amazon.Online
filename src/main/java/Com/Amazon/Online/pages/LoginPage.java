package Com.Amazon.Online.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Amazon.Online.Base.Testbase;
import Com.Amazon.Online.Utils.Testutil;

public class LoginPage extends Testbase
{
    @FindBy(id="email")
    WebElement Emailaddress;
    
    @FindBy(name="pass")
    WebElement Password;
    
    @FindBy(xpath="html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")
    WebElement CreateNewAccount;
    
    @FindBy(name="firstname")
    WebElement Firstname;
    
    @FindBy(xpath="//input[@name='lastname']")
    WebElement Surname;
    
    @FindBy(xpath="//select[@name='birthday_day']")
    public WebElement Day_Drop;
    
    @FindBy(xpath="//select[@name='birthday_year']")
    public WebElement Month_Drop;
    
    @FindBy(xpath="//select[@id='year']")
    public WebElement Year_Drop;
    
    @FindBy(xpath="//label[text()='Female']")
    WebElement Femaleradio;
    
    public LoginPage()
    {
    	super();
    	PageFactory.initElements(driver,this);
    }
    
    public String VerifyTitle()
    {
    	String t= driver.getTitle();
    	return t;
    }
    
    public String VerifyUrl()
    {
    	String i= driver.getCurrentUrl();
    	return i;
    }
    
   
     public void VerifyCreateClick()
    {
    	CreateNewAccount.click();
    }
    
    public String VerifyCreateText()
    {
    	return CreateNewAccount.getText();
    }
    
    public void VerifyFirstname(String name)
    {
    	Firstname.sendKeys(name);
    }
    
    public void VerifySurname(String name)
    {
    	Surname.sendKeys(name);
    }
    
    public boolean VerifyRadiobutton()
    {
    	boolean d = Femaleradio.isDisplayed();
    	return d;
    }
    
    public void VerifyEmail(String username)
    {
    	Emailaddress.sendKeys(username);
    }
}
