package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class ManagingEmploymentInformationITC extends BaseTest{
	
	public static String PersonName;
	public static String Location;
	
	
	private static void run(){
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), PersonName);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));

		//		clickElement(By.cssSelector("td.p_AFFocused.xu5"));

		clickElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk,'0')]"));


		clickElement(By.linkText("Actions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dcm1"));

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:6:dccmi1']/td[2]"));

//		clickElement(By.linkText("Edit"));
	    clickElement(By.cssSelector("span.xpc"));

		clickElement(By.cssSelector("td.x1fk"));

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionsName1::content"))).selectByVisibleText("Location Change");

		clickElement(By.cssSelector("option[title=\"Location Change\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb10"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:r:JobDe1:0:locationId::content"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:r:JobDe1:0:locationId::content"), Location);

		clickElement(By.cssSelector("span.xpc"));
		    
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:submit']/a/span"));
		    
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:okWarningDialog"));		    
		  
        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:2:AP1:tt1:okConfirmationDialog"));
		    
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:_FOTsr2:0:cb1"));
        
//        clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb7"));
		
		
		
	}
	
	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(ManagingEmploymentInformationITC.class);
			run();
		}
	}

}
