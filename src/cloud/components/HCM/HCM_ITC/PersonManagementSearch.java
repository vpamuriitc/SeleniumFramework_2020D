package cloud.components.HCM_Old;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import itc.framework.BaseTest;

public class PersonManagementSearch extends BaseTest{

	public static String Name;
	public static String PersonNumber;
	public static String NationalID;
	public static String Keywords;
	public static String EffectiveAsofDate;
	public static String TerminatedworkChk;

	private static void run() throws InterruptedException{


		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value00::content']"),Name);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value10::content']"),PersonNumber);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value20::content']"),NationalID);
		Thread.sleep(1000);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value30::content']"),Keywords);
		setElementText(By.xpath("//label[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value40::Label0']"),TerminatedworkChk);
		setElementText(By.xpath("//input[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1:value50::content']']"),EffectiveAsofDate);
		clickElement(By.id("//button[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_person_management:1:MAt1:0:pt1:Perso1:0:SP3:q1::search']"));
		
	//table row select
		
	clickElement(By.id("//td[@class='p_AFFocused x12z']"));
	
	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(PersonManagementSearch.class);
			run();
		}
	}

}
