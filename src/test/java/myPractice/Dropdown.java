package myPractice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.webkitURL;

@Test
public class Dropdown {
	
public void test()
{
WebDriver driver;
//driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver", "C:/Users/ashutoshdixit/workspace/planit/chromedriver.exe");
driver=new ChromeDriver();
//driver.get("https://cengage.pvcloud.com/planview/Login/body.asp?manual=Y&r=1");
driver.get("https://www.facebook.com");

WebElement date_dd=driver.findElement(By.cssSelector("#day"));
WebElement month_dd=driver.findElement(By.cssSelector("#month"));
WebElement year_dd=driver.findElement(By.cssSelector("#year"));


Select date_sel=new Select(date_dd);

date_sel.selectByIndex(1);


driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

Select mon_sel=new Select(month_dd);

mon_sel.selectByVisibleText("Apr");

WebElement selectedMonth= mon_sel.getFirstSelectedOption(); // Get the selected drop down item

String mon= selectedMonth.getText();

Assert.assertEquals(mon, "Apr");

driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

List <WebElement> ll=mon_sel.getOptions(); // Get all the options in the month drop down

System.out.println("Total Months" +ll.size());

String months[]={"Month","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
int i=0;
for(WebElement el:ll) //Advance for loop to retrieve elements from list.
{
	String mont=el.getText();
	System.out.println(mont);
	Assert.assertEquals(mont, months[i]); // Verifying the actual vs expected months
	i++;
}

//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
Wait wait= new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);


Select year_sel=new Select(year_dd);

year_sel.selectByValue("2003");
}

}
