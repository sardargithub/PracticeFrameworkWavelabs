package resources;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass extends Exceloperation
{
public static WebDriver driver;
@BeforeTest
public void OpenBrowser() throws EncryptedDocumentException, IOException
{
	//String Browser=System.getProperty("browser")!=null? System.getProperty("browser"):Exceloperation.readdata("Sheet1", 1, 0);
	String Browser=Exceloperation.readdata("Sheet1", 1, 0);
	String Url=Exceloperation.readdata("Sheet1", 1, 1);
	if(Browser.equals("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
	}
	else if(Browser.equals("Firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new FirefoxDriver(options);
	}
	else
	{
		System.out.println("Invalid Broswer");
	}
	driver.get(Url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@BeforeClass
public void Login() throws EncryptedDocumentException, IOException
{
	String un=Exceloperation.readdata("Sheet1", 1, 2);
	String pwd=Exceloperation.readdata("Sheet1", 1, 3);
	driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys(un);
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//*[@id='login-button']")).click();
	System.out.println("Testing");
}
/*
 * @AfterClass public void logout() {
 * driver.findElement(By.xpath("//*[text()='Logout']")).click(); }
 * 
 * @AfterTest public void closebrowser() { driver.close(); }
 */
public String getScreenshot(String testCaseName) throws IOException {
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
	FileUtils.copyFile(source,file);
	return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";
}
}
