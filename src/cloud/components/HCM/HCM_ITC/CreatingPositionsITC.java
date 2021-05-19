package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingPositionsITC extends BaseTest{

	public static String Business_Unit;
	public static String Name;
	public static String Code;
	public static String Department;
	public static String Job;
	public static String Grade;


	private static void run(){

		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl1"));

		clickElement(By.cssSelector("span.xpc"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:1:AP4:BUNameId::content"), Business_Unit);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:1:AP4:inputText2::content"), Name);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:1:AP4:inputText4::content"), Code);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:1:AP4:tt1:next']/a/span"));
        
		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:2:AP5:DeptNameId::content"), Department);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:2:AP5:NameFromJobId::content"), Job);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:2:AP5:AT1:_ATp:VGAdd::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:2:AP5:AT1:_ATp:table1:3:nameId::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:2:AP5:AT1:_ATp:table1:3:nameId::content"), Grade);   

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:2:AP5:tt1:next']/a/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:3:AP6:tt1:next']/a/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:4:posProfPnl:tt1:next']/a/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:5:AP1:tt1:submit']/a/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:5:AP1:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt1:5:AP1:tt1:okConfirmationDialog"));



	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingPositionsITC.class);
			run();
		}
	}

}
