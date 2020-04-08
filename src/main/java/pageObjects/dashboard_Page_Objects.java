package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonFunctions.commonFunctions;

public class dashboard_Page_Objects extends commonFunctions{


	By leaveRequest=By.xpath("//*[@id=\"txtUsername\"]");
	public WebElement dashboard_Leave_Request()
	{
		
		return(driver.findElement(leaveRequest));
	}
	
}
