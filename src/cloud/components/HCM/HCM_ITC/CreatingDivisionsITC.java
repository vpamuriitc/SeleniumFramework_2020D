package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingDivisionsITC extends BaseTest{

	public static String DivisionName;
	public static String Location;
	public static String Address;
	public static String ReportingManager;
	public static String ReportingName;

	private static void run() throws InterruptedException{

		//clickElement(By.id("pt1:_UISmmLink::icon"));

		//clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));
		
		Thread.sleep(5000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl11"));
		
		Thread.sleep(3000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:0:AP1:AT2:_ATp:commandToolbarButton12']/a/span"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText1::content"),DivisionName);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:locationCode1Id::content"),Location);
		
		Thread.sleep(3000);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:inputText2::content"),Address);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:1:AP1:tt1:next']/a/span"));
		
		Thread.sleep(2000);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_MANAGER_Display::content"),ReportingManager);
		
		Thread.sleep(3000);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:r1:0:r1:0:dynam1:0:CTXRN1:0:_REPORTING_NAME::content"),ReportingName);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:2:AP2:tt1:next']/a/span/span"));
		
		Thread.sleep(3000);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:submit']/a/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt6:3:ap1:tt1:okConfirmationDialog"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingDivisionsITC.class);
			run();
		}
	}

}
