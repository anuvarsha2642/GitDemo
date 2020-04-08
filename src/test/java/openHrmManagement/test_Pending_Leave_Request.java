package openHrmManagement;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.commonFunctions;
import junit.framework.Assert;
import pageObjects.dashboard_Page_Objects;

public class test_Pending_Leave_Request extends commonFunctions {
	
	public void opening_Browser() throws IOException
	{
		System.out.println("inside test case"); 
		test_Pending_Leave_Request leavereq=new test_Pending_Leave_Request();
		driver=leavereq.launchingBrowser();
		driver.get(prop.getProperty("url"));
	}
	

	@Test
	public void verifyPendingLeaveRequest() throws IOException
	{
		opening_Browser();
		dashboard_Page_Objects dp=new dashboard_Page_Objects();
		WebElement element=dp.dashboard_Leave_Request();
		String actualtext=element.getText();
		Assert.assertEquals(actualtext,"");
		
		//Assert.assertEquals(actualtext,"No Records are Available");
		  */                                            
		
	}
}

