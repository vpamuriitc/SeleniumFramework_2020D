package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingCalendarEventsITC extends BaseTest{
	
	public static String Responsibility;
	public static String Event_Name;
	public static String ShortCode;
	public static String StartDate;
	public static String EndDate;
	
	
	private static void run() throws InterruptedException{
		
		
//		    clickElement(By.id("pt1:_UISmmLink::icon"));
//		    
//		    clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
		    
		    setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s1:it1::content"), Responsibility);
		   
		    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s1:ctb1::icon")); 
		    
		    clickElement(By.id("pt1:r1:0:r0:1:AP1:t1:0:cl2"));
		    
		    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:appspanel1:AT1:_ATp:commandToolbarButton11::icon"));
		    
		    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText1::content"), Event_Name);
		    
		    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputText2::content"), ShortCode);
		   		    
		    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:selectOneChoice1::content"))).selectByVisibleText("Public holiday");
		    
		    clickElement(By.cssSelector("option[title=\"Public holiday\"]"));
		    
		    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate1::content"), StartDate);
		    
		    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:inputDate2::content"), EndDate);
		    
		    Thread.sleep(1000);
		    		    
		    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice1::content"))).selectByVisibleText("Organization");
		    
		    clickElement(By.cssSelector("option[title=\"Organization\"]"));
		    
		    Thread.sleep(2000);
		    
		    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:choice2::content"))).selectByVisibleText("KBT");
		    
		    clickElement(By.cssSelector("option[title=\"KBT\"]"));
		    
		    Thread.sleep(1000);
		    
		    clickElement(By.cssSelector("td.xu5"));
		    
		    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:pc1:Tbut4']/a/span"));
		    
		    Thread.sleep(2000);
		    
		    clickElement(By.linkText("Submit"));
		    
		    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:1:appspanel2:confirmD::ok"));
		    
		    
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingCalendarEventsITC.class);
			run();
		}
	}

}
