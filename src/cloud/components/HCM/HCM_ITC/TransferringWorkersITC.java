package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class TransferringWorkersITC extends BaseTest{

	public static String PersonName;
	public static String LegalEmployer;
	public static String BusinessUnit;
	public static String JOB;
	public static String Grade;
	public static String SalayCategory;
	public static String AnnualSalary;
	
	private static void run() throws InterruptedException{

//		clickElement(By.id("pt1:_UISmmLink::icon"));
//
//		clickElement(By.id("pt1:nv_itemNode_workforce_management_person_management"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content"), PersonName);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:q1::search"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Perso1:0:SP3:table1:_ATp:table2:0:gl1"));

		clickElement(By.cssSelector("span.xpc"));

		clickElement(By.cssSelector("td.x1fk"));
		
		Thread.sleep(2000);

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionsName1::content"))).selectByVisibleText("Global Transfer");

		clickElement(By.cssSelector("option[title=\"Global Transfer\"]"));
		
		Thread.sleep(3000);

		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:actionReason::content"))).selectByVisibleText("Career Progression");

		clickElement(By.cssSelector("option[title=\"Career Progression\"]"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:legalEnt::content"), LegalEmployer);    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:cb10"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:0:AP1:ctb1"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:0:AP1:tt1:next']/a/span"));
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:0:AP1:NewPe1:0:pt_r1:0:df1_PersonDFFIteratorcandidate__FLEX_EMPTY::content"), "20454");

		clickElement(By.linkText("Next"));
		
		Thread.sleep(2000);
		
				
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:1:AP1:Perso1:0:Perso1:0:Maint1:0:i1:5:inputComboboxListOfValues28::content"), "76621");
		
		Thread.sleep(2000);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:1:AP1:Perso1:0:Perso1:0:Maint1:0:i1:0:inputText17::content"), "Test Address");
		
		
		
		clickElement(By.xpath("//div[contains(@id, 'tt1:next')]"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:AddWo1:0:AddWo1:0:businessUnitId::content"), BusinessUnit);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:AddWo1:0:JobDe1:0:jobId::content"), JOB);


		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:AddWo1:0:JobDe1:0:gradeId::content"), Grade);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:sdi2::disAcr"));


		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:AddWo2:0:JobDe1:0:selectOneChoice2::content"))).selectByVisibleText("Salaried");

		clickElement(By.cssSelector("option[title=\"Salaried\"]"));   

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:AddWo2:0:r7:0:idSalaryBasis::content"), SalayCategory);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:AddWo2:0:r7:0:idSalaryAmount::content"), AnnualSalary);		    


		new Select(browser.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:AddWo2:0:JobDe1:0:df2_BaseWorkerAsgDFFIterator__FLEX_Context__FLEX_EMPTY::content"))).selectByVisibleText("Practice_GDC");

		clickElement(By.cssSelector("option[title=\"Practice_GDC\"]"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:2:AP1:tt1:next']/a/span"));
		
		Thread.sleep(2000);

		clickElement(By.linkText("Next"));
		
		Thread.sleep(2000);
		
		clickElement(By.linkText("Next"));
		
		Thread.sleep(2000);
		
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:4:AP3:tt1:submit']/a/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:4:AP3:tt1:okWarningDialog"));
		
		Thread.sleep(2000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:MAt1:0:pt1:Manag1:1:pt1:r1:4:AP3:tt1:okConfirmationDialog"));

		Thread.sleep(2000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:0:_FOTsr2:0:cb1"));




	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(TransferringWorkersITC.class);
			run();
		}
	}

}
