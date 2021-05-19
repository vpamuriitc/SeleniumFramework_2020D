package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingJobFamiliesITC extends BaseTest{
	
	public static String JobFamiliyName;
	
	private static void run(){
		
		
		    clickElement(By.id("pt1:_UISmmLink::icon"));
		    
		    clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl4"));
		    
		    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:jfSearchPnl:jfSrchResApplTbl:_ATp:createBtn']/a/span"));

		    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP3:inputText1::content"), JobFamiliyName);
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP3:tt1:submit"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP3:tt1:okWarningDialog"));
		    
		    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP3:tt1:okConfirmationDialog"));

		    clickElement(By.cssSelector("span.xpc"));
		    
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingJobFamiliesITC.class);
			run();
		}
	}

}
