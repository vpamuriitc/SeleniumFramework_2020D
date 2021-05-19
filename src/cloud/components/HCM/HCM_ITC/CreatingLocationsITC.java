package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingLocationsITC extends BaseTest{
	
	public static String LocationName;
	public static String LocationCode;
	public static String Address1;
	public static String City;
	public static String ZIPCODE;
	
	
	private static void run(){
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl16"));
	    
//	    clickElement(By.cssSelector("span.xpc"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:0:locSearchPanel:resultsAppsTable:_ATp:ctb1::icon"));
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:0:locSearchPanel:resultsAppsTable:_ATp:ctb1']/table/tbody/tr/td[1]/a/span"));
	    
//	    clickElement(By.linkText("Create"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:inputText562::content"), LocationName);
	    
        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:it1::content"), LocationCode);
	    
	   setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:r3:0:i1:0:inputText17::content"), Address1);
	    
       setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:r3:0:i1:3:inputComboboxListOfValues27::content"), City);
       
       setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:r3:0:i1:4:inputComboboxListOfValues25::content"), "CA");
	    
       setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:r3:0:i1:7:inputComboboxListOfValues26::content"), "San Francisco");
       
       setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:r3:0:i1:5:inputComboboxListOfValues28::content"), ZIPCODE);
	    
       clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:tt1:submit']/a/span"));
	    
	   clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:tt1:okWarningDialog"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt5:1:AP1:tt1:okConfirmationDialog"));
	    
	  
	
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingLocationsITC.class);
			run();
		}
	}

}
