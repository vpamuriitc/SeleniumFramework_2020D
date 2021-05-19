package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDisabilityOrganizationsITC extends BaseTest{

	public static String OrganisationName;
	public static String Reason;
	public static String Address;

	private static void run() throws InterruptedException{



		//clickElement(By.id("pt1:_UISmmLink::icon"));

		//clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));

		Thread.sleep(5000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));

		Thread.sleep(2000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl12"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP1:AT2:_ATp:commandToolbarButton12']/a/span"));

		Thread.sleep(2000);
		
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText1::content"),OrganisationName);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:actionReasonNameId::content"),Reason);
		
		Thread.sleep(2000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"),Address);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:tt1:next']/a/span"));
		
		Thread.sleep(10000);
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:ap1:r3:0:sdh1::_afrDscl"));

		Thread.sleep(2000);
		
//		clickElement(By.cssSelector("td > a.xt1 > span.xt4"));
//
//		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:ap1:tt1:okConfirmationDialog"));

				
		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:ap1:tt1:submit']/a"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:ap1:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:ap1:tt1:okConfirmationDialog"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDisabilityOrganizationsITC.class);
			run();
		}
	}

}
