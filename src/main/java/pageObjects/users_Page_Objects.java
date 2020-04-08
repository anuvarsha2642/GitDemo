package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.commonFunctions;

public class users_Page_Objects extends commonFunctions{
	By admin=By.xpath("//b[contains(text(),'Admin')]");
	By userManagement=By.xpath("//a[@id='menu_admin_UserManagement']");
	By users=By.xpath(" //a[@id='menu_admin_viewSystemUsers']");
	By username=By.xpath("//input[@id='searchSystemUser_userName']");
	By userRole=By.xpath(" //select[@id='searchSystemUser_userType']");
	By employeeName=By.xpath("//input[@id='searchSystemUser_employeeName_empName']");
	By user_Status=By.xpath("//select[@name='searchSystemUser[status]']");
	
	
	
	public WebElement admin()
	{
		return (driver.findElement(admin));
		
	}
	
	
	public WebElement userManagement()
	{
		return (driver.findElement(userManagement));
		
	}
	
	public WebElement users()
	{
		return (driver.findElement(users));
		
	}
	
	public WebElement username()
	{
		return (driver.findElement(username));
		
	}
	
	
	public WebElement  userRole()
	{
		return (driver.findElement( userRole));
		
	}
	
	
	
	
	public WebElement  employeeName()
	{
		return (driver.findElement(admin));
		
	}
	
	
	public WebElement  user_Status()
	{
		return (driver.findElement(user_Status));
		
	}
	
	
	
}
