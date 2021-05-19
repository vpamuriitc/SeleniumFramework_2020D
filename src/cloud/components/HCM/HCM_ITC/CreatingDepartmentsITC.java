package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDepartmentsITC extends BaseTest{
	
	public static String TeamName;
	public static String Location;
	public static String ReportingTeamName;
	public static String WorkStartTime;
	public static String WorkEndTime;
	public static String WorkingHours;
	public static String Frequency;
	
	
	private static void run(){
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
	    	    
//		clickElement(By.linkText("Manage Departments"));
		
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MainAreaTab4::disAcr"));
		
//		clickElement(By.xpath("//div[4]/div/a"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl9"));
		
							    
		clickElement(By.cssSelector("span.xpc"));
		
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:1:AP1:inputText1::content"), TeamName);	    

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:1:AP1:locationCode1Id::content"), Location);
	    
//        clickElement(By.cssSelector("li.p_AFSelected.AFAutoSuggestItem"));	
        
//        clickElement(By.xpath("//ul[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:1:AP1:locationCode1Id::_afrautosuggestpopup']/li"));
	    
        clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:1:AP1:tt1:next']/a/span"));
	    

        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"), ReportingTeamName);
        
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::lovIconId"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td"));
	    

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_WORK_START_TIME::content"), WorkStartTime);

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_WORK_END_TIME::content"), WorkEndTime);
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_STD_WORKING_HOURS::content"), WorkingHours);	    

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_STD_WORKING_HOURS_FREQUENCY_Display::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_STD_WORKING_HOURS_FREQUENCY_Display::content"), Frequency);
	    
//	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_STD_WORKING_HOURS_FREQUENCY_Display::lovIconId"));
//	    
//	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:2:AP2:r1:0:r1:0:dynam1:0:CTXRN3:0:_STD_WORKING_HOURS_FREQUENCY_Display::dropdownPopup::dropDownContent::db']/table/tbody/tr[3]/td"));

	  	        
	    clickElement(By.linkText("Next"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:3:ap1:tt1:submit']/a/span"));
	    

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:3:ap1:tt1:okWarningDialog"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt4:3:ap1:tt1:okConfirmationDialog"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MainAreaTab4::disAcr"));
	    
	    
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDepartmentsITC.class);
			run();
		}
	}

}
