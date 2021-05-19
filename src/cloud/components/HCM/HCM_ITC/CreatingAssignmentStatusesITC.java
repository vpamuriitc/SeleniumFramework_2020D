package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingAssignmentStatusesITC extends BaseTest{
	
	public static String SearchTask;
	public static String UserStatus;
	public static String AssignmentStatusCode;
	
	
	private static void run() throws InterruptedException{
		
		//clickElement(By.id("pt1:_UISmmLink::icon"));
	   
		//clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
	    
		Thread.sleep(5000);
		
	    setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"),SearchTask);
	    
	    Thread.sleep(5000);
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:AT1:_ATp:t1:1:cl4"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:create::icon"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:it3::content"));
	    
	    //setElementText(By.xpath("//td[contains(@title, 'User Status')]"), UserStatus);
        setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:it3::content"),UserStatus);
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:it4::content"));
	    
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:it4::content"),AssignmentStatusCode);
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:soc9::content"));
	    
	    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:soc9::content"))).selectByVisibleText("Inactive");
	    
	    clickElement(By.cssSelector("option[title=\"Inactive\"]"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:soc10::content"));
	    
	    Thread.sleep(2000);
	    
	    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:soc10::content"))).selectByVisibleText("Do Not Process");
	    
	    clickElement(By.cssSelector("option[title=\"Do Not Process\"]"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT1:_ATp:ATt1:8:soc8::content"));
	    
	    clickElement(By.cssSelector("option[title=\"No\"]"));
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:cb1"));
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:cb3"));
	    
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:SPb']/a/span"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingAssignmentStatusesITC.class);
			run();
		}
	}

}
