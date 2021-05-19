package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingReportingEstablishmentsITC extends BaseTest{

	public static String Name;
	public static String Reporting_Name;
	public static String Manager;
	

	

	private static void run() throws InterruptedException{
		
	
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
	    clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl13"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP1:AT2:_ATp:commandToolbarButton12::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText1::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText1::content"), Name);

	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:tt1:next']/a/span/span"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"), Reporting_Name);

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content"), Manager);

	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:tt1:next']/a/span/span"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:submit']/a/span"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okWarningDialog"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okConfirmationDialog"));
	    
	    clickElement(By.cssSelector("span.xt4"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingReportingEstablishmentsITC.class);
			run();
		}
	}

}




