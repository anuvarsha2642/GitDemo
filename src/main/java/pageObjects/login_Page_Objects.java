package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.commonFunctions;

public class login_Page_Objects extends commonFunctions {

	By username=By.xpath("//*[@id=\"txtUsername\"]");
	By password=By.xpath("//*[@id=\"txtPassword\"]");
	
	
	public WebElement userLogin()
	{
		
		return(driver.findElement(username));
	}
	
	public WebElement userPassword()
	{
		
		return(driver.findElement(password));
	}
	
	
}
