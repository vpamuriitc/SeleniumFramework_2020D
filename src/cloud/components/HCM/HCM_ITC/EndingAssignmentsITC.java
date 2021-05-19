package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class EndingAssignmentsITC extends BaseTest{

	public static String PersonName;

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

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionsName1::content"))).selectByVisibleText("End Assignment");

		clickElement(By.cssSelector("option[title=\"End Assignment\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb10"));
		
		

//		if(browser.findElement(By.xpath("//button[contains(@id, 'cbCheckDirectReportOK1')]")).isDisplayed()){     
//			clickElement(By.xpath("//button[contains(@id, 'cbCheckDirectReportOK1')]"));   
//		} 
		
//		if(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cbCheckDirectReportOK1")).isDisplayed()){     
//			clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cbCheckDirectReportOK1"));   
//		} 
//		
//		if (browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:0:pt1:Manag1:0:AP1:d6::ok")).isDisplayed()){ 
//			browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt2:0:pt1:Manag1:0:AP1:d6::ok")).click();

          clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:d6::ok"));
		
					
			clickElement(By.id("pt1:USma:0:MAt1:0:r1:0:pt1:Termi1:0:ap1:tt1:cb1"));
			
//			if (browser.findElement(By.id("pt1:USma:0:MAt1:0:r1:0:pt1:Termi1:0:ap1:tt1:managerWithDirectsDialog::yes")).isDisplayed()){ 
//				browser.findElement(By.id("pt1:USma:0:MAt1:0:r1:0:pt1:Termi1:0:ap1:tt1:managerWithDirectsDialog::yes")).click();

			clickElement(By.xpath("//div[@id='pt1:USma:0:MAt1:0:r1:0:pt1:Termi1:1:AP1:tt1:submit']/a/span/span")); 

			clickElement(By.id("pt1:USma:0:MAt1:0:r1:0:pt1:Termi1:1:AP1:tt1:okWarningDialog"));

			clickElement(By.id("pt1:USma:0:MAt1:0:r1:0:pt1:Termi1:1:AP1:tt1:okConfirmationDialog"));

			clickElement(By.xpath("//div[@id='pt1:USma:0:MAt1:1:pt1:r1:0:AP1:actb1']/a/span")); 
			
			}
//		}
//	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(EndingAssignmentsITC.class);
			run();
		}
	}

}
