package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingActionsAndActionReasonsITC extends BaseTest{
	
	public static String SearchAction;
	public static String ActionCode;
	public static String ActionName;
	public static String ActionReasonCode;
	public static String ActionReason;
	public static String StartDate;
	
	
	private static void run() throws InterruptedException{
		
		
		//clickElement(By.id("pt1:_UISmmLink::icon"));
		//clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
	    
	    Thread.sleep(5000);
	    
	    setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"),SearchAction);
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:t2:0:ot23"));
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:AT1:_ATp:t1:1:cl4"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT1:_ATp:create::icon"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT1:_ATp:table1:1:it1::content"));
	    
	    Thread.sleep(2000);
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT1:_ATp:table1:1:it1::content"),ActionCode);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT1:_ATp:table1:1:it2::content"));
	    
	    Thread.sleep(2000);
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT1:_ATp:table1:1:it2::content"),ActionName);
	    
	    clickElement(By.cssSelector("option[title=\"Create Job Family\"]"));
	    
	    new Select(browser.findElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT1:_ATp:table1:1:soc1::content"))).selectByVisibleText("Add Assignment");
	    
	    clickElement(By.cssSelector("option[title=\"Add Assignment\"]"));
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:_ATp:create::icon"));
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:commandButton6"));
	    
	 
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:inputText2::content"),ActionReasonCode);
	    
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:inputText1::content"),ActionReason);
	    
	    
	    setElementText(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:inputDate2::content"),StartDate);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:AT2:commandButton3"));
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:commandButton12"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:commandButton10"));
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:d1::ok"));
	    
	    Thread.sleep(2000);
	    
	    clickElement(By.id("pt1:r1:0:rt:0:r2:0:dynamicRegion1:0:pt1:pt_r1:0:AP1:SPb']/a"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingActionsAndActionReasonsITC.class);
			run();
		}
	}

}
