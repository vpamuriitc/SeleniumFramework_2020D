package cloud.components.HCM_Old;

import java.awt.AWTException;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingPersonTypesITC extends BaseTest{

	public static String Search_Tasks_Name;
	public static String Assignment_Person_Type;
	

	

	private static void run() throws InterruptedException, AWTException{
		
//		clickElement(By.id("pt1:_UISmmLink::icon"));
//		
//	    clickElement(By.id("pt1:nv_itemNode_tools_setup_and_maintenance"));
	 
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"));
	    
	    setElementText(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content"), Search_Tasks_Name);
	    
	    clickElement(By.id("pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon"));
	    
	    Thread.sleep(5000);
	  
	    clickElement(By.linkText("Manage Person Types"));
	 
	    ///clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']/table/tbody/tr[11]/td[2]/div/table/tbody/tr/td"));
	
	    //clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:cb3"));
	    
	    //Thread.sleep(5000);
	    
	    //clickElement(By.linkText("Employee"));
	  
	    //clickElement(By.xpath("//tr[contains(text(),'Employee'"));
	    
	    
	    
	    Thread.sleep(10000);
	    
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']"));
	    
	    scrollByElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']//*[./text()='Contact']"));
	    
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']//*[./text()='Contact']"));
	    
	  //  clickElement(By.xpath("//td/span[./text()='Employee']"));
	    
	    Thread.sleep(20000);
	    
	    //clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:cb3"));
  
	    //clickElement(By.xpath("//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:table2::db']/table/tbody/tr[1]/td[1]"));
	    
	    //clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:table1::db']/table/tbody/tr[10]/td[2]/div/table/tbody/tr/td"));
	    
	    Thread.sleep(10000);
	    
	    clickElement(By.id("pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:AT2:_ATp:cb3"));
	    
	    Thread.sleep(15000);
	    
	    clickElement(By.cssSelector("td.p_AFFocused.xzn")); 
	    
	    setElementText(By.xpath("//td[@title= 'Assignment Person Type']//input[1]"), Assignment_Person_Type);
	  
	    clickElement(By.xpath("//div[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:AP1:APscl2']/a/span"));
	  
	    clickElement(By.id("d1::msgDlg::cancel"));


	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingPersonTypesITC.class);
			run();
		}
	}

}




