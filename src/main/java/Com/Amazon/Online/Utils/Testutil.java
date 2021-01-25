package Com.Amazon.Online.Utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Amazon.Online.Base.Testbase;

public class Testutil extends Testbase
{
  public static void Maximize()
  {
	  driver.manage().window().maximize();
  }
  
  public static void Implicitlywait()
  {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  
  public static void TakesScreen()
  {
	  try
	  {
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(src, new File(".//src//main//java//Com//Amazon//Online//Screen//fb"+System.currentTimeMillis()+".jpg"));
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
  
  public static void Date_Dropdown(WebElement day, int d)
  {
	  Select sel = new Select(day);
	  sel.selectByIndex(d);
  }
  
  public static void Month_Dropdown(WebElement month,String m)
  {
	  Select se = new Select(month);
	  se.selectByVisibleText(m);
  }
  
  public static void Year_Dropdown(WebElement year,String y)
  {
	  Select s = new Select(year);
	  s.selectByValue(y);
  }
  
 
  
}
