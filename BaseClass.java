package org.test;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
static WebDriver driver;

public static void launchBrowser()
{  
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium Test\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();


}

public static void loadUrl(String Url)

{
	
	driver.get(Url);
	driver.manage().window().maximize();

}
public static void getUrl()
{
String currentUrl = driver.getCurrentUrl();
System.out.println(currentUrl);

}
public static void sendKeys(WebElement e,String value)
{
	e.sendKeys(value);


}
public static void quit()
{
driver.quit();	
}
public static void close()
{
driver.close();
}

public static void getTitle()

{ 
	
String title = driver.getTitle();
System.out.println(title);
}

public static void getAttribute(WebElement e,String value)
{ 
	
String val = e.getAttribute(value);
System.out.println(val);

}
 
public static void moveToElement(WebElement e1)
{  
	
Actions a = new Actions(driver);
a.moveToElement(e1).perform();
}

public static void dragAndDrop(WebElement src,WebElement des)
{  
	
Actions a = new Actions(driver);
a.dragAndDrop(src,des).perform();
}
public static void contextClick(WebElement e2)
{  
	
Actions a = new Actions(driver);
a.contextClick(e2).perform();
}
public static void doubleClick(WebElement e3)
{  
	
Actions a = new Actions(driver);
a.doubleClick(e3).perform();
}

public static void keyUp(WebElement value,CharSequence k)
{  
	
Actions a = new Actions(driver);
a.keyUp(value,k).perform();
}


public static void keyDown(WebElement value,CharSequence k1)
{  
	
Actions a = new Actions(driver);
a.keyDown(value,k1).perform();
}
public static void insert(WebElement e5,String v)
{ 
e5.sendKeys(v);	
}
public static void getScreenshotAs () throws IOException
{
	
TakesScreenshot tk = (TakesScreenshot)driver;
File src=tk.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\Admin\\Desktop\\screenshot\\img.png");
FileUtils.copyFile(src,des);

}

public static void insertScript(String v,WebElement e5)

{ 
	JavascriptExecutor jk =(JavascriptExecutor)driver;
	
	jk.executeScript("arguments[0].setAtrribute('value',v)",e5);
	
	
}

public static void click(WebElement value)

{ 
	JavascriptExecutor jk =(JavascriptExecutor)driver;
	
	jk.executeScript("arguments[0].click()",value);
	
}



public static void returnValue(WebElement e6)

{ 
	JavascriptExecutor jk =(JavascriptExecutor)driver;
	
	jk.executeScript("return arguments[0].getAtrribute('value')",e6);
	
	
}

public static void simpleAlertAccept()

{
	
	Alert at = driver.switchTo().alert();
	
	at.accept();
}
public static void confirmAlertAccept()

{
	
	Alert at = driver.switchTo().alert();
	
at.accept();
}

public static void confirmAlertDismiss()

{
	
	Alert at = driver.switchTo().alert();
	

at.dismiss();
}

public static void promptAlertAccept()

{
	
	Alert at = driver.switchTo().alert();
	
at.sendKeys("yes");
at.accept();

}
public static void promptAlertDismiss()

{
	
	Alert at = driver.switchTo().alert();
	
at.sendKeys("NO");
at.dismiss();
}

public static void isMultiple(WebElement e)

{ 
Select	s = new Select(e);

boolean multiple = s.isMultiple();

System.out.println(multiple);

}

public static void getFirstSelectedOption(WebElement e)

{ 
	Select s = new Select(e);

WebElement firstSelectedOption = s.getFirstSelectedOption();

String text = firstSelectedOption.getText();

System.out.println(text);
}

public static void getAllSelectedOptions(WebElement e)

{ 
	Select s = new Select(e);

java.util.List <WebElement> selectedOptions = s.getAllSelectedOptions();
for(WebElement selected : selectedOptions)
{
	
	String text = selected.getText();
System.out.println(text);
}

}

public static void getOptions(WebElement e)

{ 
	Select s = new Select(e);

java.util.List <WebElement> getOptions = s.getOptions();
for(WebElement options : getOptions)
{
	
	String text = options.getText();
System.out.println(text);

}}
public static void deSelectAll(WebElement e)

{ 
	Select s = new Select(e);

s.deselectAll();
}

public static void selectByIndex(WebElement e,int index)

{ 
	Select s = new Select(e);
	
	s.selectByIndex(index);
}
public static void selectByValue(WebElement e,String value)

{ 
	Select s = new Select(e);
	
s.selectByValue(value);

}
public static void selectByVisibleText(WebElement e,String value)

{ 
	Select s = new Select(e);
	
s.selectByVisibleText(value);
}

public static void deselectByIndex(WebElement e,int index)

{ 
	Select s = new Select(e);
	
s.deselectByIndex(index);
}
public static void deselectByValue(WebElement e,String value)

{ 
	Select s = new Select(e);
	
s.deselectByValue(value);
}
public static void deselectByVisibleText(WebElement e,String value)

{ 
	Select s = new Select(e);
	
s.deselectByVisibleText(value);
}
public static void frameId(int index)
{
	
driver.switchTo().frame(index);

}
public static void frameElement(WebElement e)
{
	
driver.switchTo().frame(e);
}
public static void frameIndex(String value)
{
	
driver.switchTo().frame(value);
}

public static void parentFrame()
{
	
driver.switchTo().parentFrame();
}
public static void immediateFrame()
{
driver.switchTo().defaultContent();	
}
public static void parentWindow()

{
String parWind = driver.getWindowHandle();	

}
public static void childWindows()

{
Set<String> allWind = driver.getWindowHandles();
}
}