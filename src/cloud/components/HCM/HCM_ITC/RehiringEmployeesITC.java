package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class RehiringEmployeesITC extends BaseTest{

	public static String LegalEmployer;
	public static String LastName;
	public static String FirstName;
	public static String SSNumber;
	public static String CandidateID;
	public static String BussinessUnit;
		

	private static void run() throws InterruptedException{

//		clickElement(By.id("pt1:_UISmmLink::icon"));
//
//		clickElement(By.id("pt1:nv_itemNode_workforce_management_new_person"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:_FOTsdiAddCwkDefaultRegional::icon"));		    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:_FOTRaT:0:RAtl1")); 

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:selectOneChoice3::content"), LegalEmployer); 
		
		Thread.sleep(3000);
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:selectOneChoice2::content"));
		

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r1:0:r1:0:i1:4:it20::content"), LastName);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r1:0:r1:0:i1:5:it60::content"), FirstName);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorcandidate__FLEX_EMPTY::content"), CandidateID);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r2:0:AT2:_ATp:create::icon"));		    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r2:0:AT2:_ATp:table2:0:it1::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:NewPe1:0:pt_r2:0:AT2:_ATp:table2:0:it1::content"), SSNumber);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:tt1:next']/a/span"));		    

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:r1:0:AT1:_ATp:DupTab1::db']/table/tbody/tr/td[2]/div/table/tbody/tr/td[3]"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:r1:0:AT1:_ATp:DupTab1:0:DupCIL2::icon"));    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:1:pt1:pt_r1:0:AP1:r1:0:cb4"));


		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:2:pt1:r1:0:AP1:tt1:next']/a/span")); 

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:2:pt1:r1:1:AP1:tt1:next']/a/span/span"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:2:pt1:r1:2:AP1:AddWo2:0:AddWo1:0:businessUnitId::content"), BussinessUnit);


		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:2:pt1:r1:2:AP1:AddWo2:0:JobDe1:0:df2_BaseWorkerAsgDFFIterator__FLEX_Context__FLEX_EMPTY::content"))).selectByVisibleText("Practice_GDC");

//		clickElement(By.cssSelector("option[title=\"Practice_GDC\"]"));
		
		Thread.sleep(5000);

		clickElement(By.xpath("//div[contains(@id, 'tt1:next')]"));
		
		Thread.sleep(2000);
		
		
		clickElement(By.xpath("//div[contains(@id, 'tt1:next')]"));
		
		Thread.sleep(2000);
	
		
//		clickElement(By.xpath("//div[contains(@id, 'tt1:submit')]"));
		
		clickElement(By.linkText("Submit"));
		
		Thread.sleep(2000);
		
//		clickElement(By.linkText("Yes"));
		
//		clickElement(By.xpath("//div[contains(@id, 'okWarningDialog')]"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:2:pt1:r1:4:AP3:tt1:okWarningDialog"));
		
		Thread.sleep(2000);
		
//		clickElement(By.xpath("//div[contains(@id, 'okConfirmationDialog')]"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_new_person:0:MAnt2:2:pt1:r1:4:AP3:tt1:okConfirmationDialog"));
		
		

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(RehiringEmployeesITC.class);
			run();
		}
	}

}
