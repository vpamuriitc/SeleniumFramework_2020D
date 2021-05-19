package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class AddingAssignmentsITC extends BaseTest{

	public static String Employee_Name;
	public static String Business_Unit;
	public static String JOB_Title;
	public static String Salary_Basis;
	public static String Salary_Amount;

	private static void run() throws InterruptedException{


//		clickElement(By.id("pt1:_UISmmLink::icon"));

//		clickElement(By.id("pt1:nv_itemNode_workforce_management_person_management"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), Employee_Name);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));

		clickElement(By.xpath("//tr[contains(@class,'xe6') and contains(@_afrrk,'0')]"));

		Thread.sleep(1000);

		clickElement(By.linkText("Actions"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dcm1"));
		
		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:am1:dc_i1:3:dci1:6:dccmi1']/td[2]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:edit::popEl"));

		clickElement(By.xpath("//tr[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:updBtn']/td[2]"));	    

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionsName1::content"))).selectByVisibleText("Add Assignment");

		clickElement(By.cssSelector("option[title=\"Add Assignment\"]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb10"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:0:AP1:assig1:0:businessUnitId::content"), Business_Unit); 

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:0:AP1:jobDe11:0:jobId::content"), JOB_Title); 

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:0:AP1:tt1:next']/a/span"));   


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:1:AP2:r1:0:idSalaryBasis::content"), Salary_Basis); 
         
		Thread.sleep(1000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:1:AP2:r1:0:idSalaryAmount::content"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:1:AP2:r1:0:idSalaryAmount::content"), Salary_Amount);  

		Thread.sleep(1000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:1:AP2:tt1:next']/a/span/span")); 

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:2:AP1:tt1:next']/a/span/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:3:panel1a:tt1:submit']/a/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:3:panel1a:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt2:r1:3:panel1a:tt1:okConfirmationDialog"));  




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(AddingAssignmentsITC.class);
			run();
		}
	}

}
