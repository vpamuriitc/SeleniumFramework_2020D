package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class CreatingWorkRelationshipsITC extends BaseTest{
	
	public static String Search;
	public static String Name;
	public static String Legal_Employer;
	public static String Candidate;
	public static String AddressLine1;
	public static String City;
	public static String Bussiness_Unit;
	
	
	private static void run(){
		
//		clickElement(By.id("pt1:_UISmmLink::icon"));
		
//		clickElement(By.id("pt1:nv_itemNode_workforce_management_person_management"));
		
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), Name);

	    clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));
	    
//        clickElement(By.cssSelector("td.p_AFFocused.xu5"));
        
        clickElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk,'0')]"));
         
        clickElement(By.linkText("Actions"));
        
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dcm1"));
        
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:1:dccmi1"));
	       
//        clickElement(By.xpath("//tr[contains='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:1:dccmi1']/td[2]"));
	    
//        clickElement(By.xpath("//tr[Contains(@id,'dci1:1:dccmi1')]"));
	  
        clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:1:dccmi1']/td[2]"));
        
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:AP1:action::content"))).selectByVisibleText("Add Employee Work Relationship");
	    
	    clickElement(By.cssSelector("option[title=\"Add Employee Work Relationship\"]"));
	    
        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:AP1:legaEm::content"), Legal_Employer);
	    
//        clickElement(By.cssSelector("li.p_AFSelected.AFAutoSuggestItem"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:0:AP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorcandidate__FLEX_EMPTY::content"), Candidate);
	    
        clickElement(By.linkText("Next"));
	    
	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:1:AP1:Perso1:0:Perso1:0:Maint1:0:i1:0:inputText17::content"), AddressLine1);

	    setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:1:AP1:Perso1:0:Perso1:0:Maint1:0:i1:3:inputText21::content"), City);
	    
        clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:1:AP1:tt1:next']/a/span/span"));	    

        setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:2:AP1:AddWo2:0:AddWo1:0:businessUnitId::content"), Bussiness_Unit);
	    
//        clickElement(By.cssSelector("li.p_AFSelected.AFAutoSuggestItem"));
	    
	     
	    new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:2:AP1:AddWo2:0:JobDe1:0:df2_BaseWorkerAsgDFFIterator__FLEX_Context__FLEX_EMPTY::content"))).selectByVisibleText("CANDIDATEID");
	    
	    clickElement(By.cssSelector("option[title=\"CANDIDATEID\"]"));
	   
	    clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:2:AP1:tt1:next']/a/span"));
	    
        clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:3:AP2:tt1:next']/a/span"));	    

        clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:4:AP3:tt1:submit']/a/span"));

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:4:AP3:tt1:okWarningDialog"));

        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:r1:4:AP3:tt1:okConfirmationDialog"));

        
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingWorkRelationshipsITC.class);
			run();
		}
	}

}
