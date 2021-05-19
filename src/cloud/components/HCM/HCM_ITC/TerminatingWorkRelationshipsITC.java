package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class TerminatingWorkRelationshipsITC extends BaseTest{

	public static String Search_Name;
	public static String Dates;


	

	private static void run() throws InterruptedException{
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
	    
	    clickElement(By.id("pt1:nv_itemNode_workforce_management_person_management"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), Search_Name);
	    
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2:0:gl1"));
	   
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:_FOTsdiHcmIntWaTasksId::icon"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:_FOTRaT:0:RAtl20"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:0:pt1:r1:0:pt1:SP1:edit::popEl"));

	    clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:0:pt1:r1:0:pt1:SP1:tBtn']/td[2]"));
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:r1:0:r1:0:pt1:ap1:Termi1:0:TerminationDate::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:r1:0:r1:0:pt1:ap1:Termi1:0:TerminationDate::content"), Dates);
	    	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:r1:0:r1:0:pt1:ap1:tt1:cb1"));
	
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:r1:0:r1:0:pt1:ap1:tt1:managerWithDirectsDialog::yes"));
	 
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:r1:0:r1:1:pt1:sp1:tt1:submit']/a/span/span"));
	  
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:r1:0:r1:1:pt1:sp1:tt1:okWarningDialog"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt3:1:r1:0:r1:1:pt1:sp1:tt1:okConfirmationDialog"));
	    
	    
	 



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(TerminatingWorkRelationshipsITC.class);
			run();
		}
	}

}




