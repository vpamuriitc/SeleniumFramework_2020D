package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingJobsITC extends BaseTest{
	
	public static String JobName;
	public static String JobCode;
	public static String JobFamilyName;
	public static String JobGrade;
	
	private static void run(){
		
		clickElement(By.id("pt1:_UISmmLink::icon"));
		
		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));
	    
	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl3"));

	    clickElement(By.cssSelector("span.xpc"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:1:basicDetailsPnl:name::content"), JobName);
	
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:1:basicDetailsPnl:jobCode::content"), JobCode);
	    

	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:1:basicDetailsPnl:tt1:next']/a/span/span"));
	    
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:2:jobDetailsPnl:fullPartTime::content"))).selectByVisibleText("Full time");
	    
	    clickElement(By.cssSelector("option[title=\"Full time\"]"));
	    
	    
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:2:jobDetailsPnl:regularTemporary::content"))).selectByVisibleText("Regular");
	    
	    clickElement(By.cssSelector("option[title=\"Regular\"]"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:2:jobDetailsPnl:jobFamilyName::content"), JobFamilyName);
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:2:jobDetailsPnl:vgApplTbl:_ATp:vgAdd']/a/span"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:2:jobDetailsPnl:vgApplTbl:_ATp:t1:0:nameFld::content"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:2:jobDetailsPnl:vgApplTbl:_ATp:t1:0:nameFld::content"), JobGrade);
	   
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:2:jobDetailsPnl:tt1:next']/a/span/span")); 
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:3:evalCriteriaPnl:tt1:next']/a/span/span"));
	    
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:4:jobProfPnl:r1:0:AT1:_ATp:a_btn']/a/span"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:4:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id::content"));

	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:4:jobProfPnl:r1:0:AT1:_ATp:table1:0:description1Id::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td"));

	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:4:jobProfPnl:tt1:next']/a/span/span"));

	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:5:jobReviewPnl:tt1:submit']/a/span"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:5:jobReviewPnl:tt1:okWarningDialog"));

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt2:5:jobReviewPnl:tt1:okConfirmationDialog"));
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingJobsITC.class);
			run();
		}
	}

}
