package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.sun.xml.fastinfoset.sax.Properties;

public class commonFunctions {
	public static WebDriver driver;
	public static java.util.Properties prop;
	
	
	//opening Browser
	@BeforeSuite
	//loading properties file
	public void loadingPropertiesFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\anuva\\openHrmManagement\\config.properties");
		 prop=new java.util.Properties();
		 prop.load(fis);	
	
	}
	public  WebDriver launchingBrowser() throws IOException
	{
		loadingPropertiesFile();
		String browser_name=prop.getProperty("browser_Name");
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("opening chrome browser ");
		}
		else if(browser_name.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\anuva\\Downloads\\Brower exe\\IEDriverServer_Win32_3.150.1\\IEDriverServer");
			driver = new InternetExplorerDriver();
    	}
		else if(browser_name.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\anuva\\Downloads\\Brower exe\\geckodriver-v0.24.0-win64\\geckodriver");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
		
		
	}
	
	//@AfterSuite
	//closing browser
	
	/*public void tearDown()
	{
		driver.close();
	}*/

}
