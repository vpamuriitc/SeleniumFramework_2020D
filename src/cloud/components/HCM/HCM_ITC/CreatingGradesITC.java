package cloud.components.HCM_Old;

import org.openqa.selenium.By;

import itc.framework.BaseTest;

public class CreatingGradesITC extends BaseTest{

	public static String GradeName;
	public static String GradeCode;
	public static String STep1Txt;
	public static String STep2Txt;
	public static String STep3Txt;

	private static void run(){


		clickElement(By.id("pt1:_UISmmLink::icon"));

		clickElement(By.id("pt1:nv_itemNode_workforce_management_workforce_structures"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTsdiworkstructures::icon"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:_FOTRaT:0:RAtl8"));

//		clickElement(By.cssSelector("span.xpc"));
		
		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:0:AP1:pc1:_ATp:commandButton1::icon"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:1:AP1:inputText3::content"), GradeName);

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:1:AP1:inputText2::content"), GradeCode);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:1:AP1:tt1:next']/a/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:addButton']/a/span"));	    

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:table1:0:inputText2::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:table1:0:inputText2::content"), STep1Txt);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:addButton']/a/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:table1:1:inputText2::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:table1:1:inputText2::content"), STep2Txt);

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:addButton::icon"));


		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:table1:2:inputText2::content"));

		setElementText(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:pc1:_ATp:table1:2:inputText2::content"), STep3Txt);

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:2:AP2:tt1:next']/a/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:3:AP3:tt1:next']/a/span"));

		clickElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:4:AP1:tt1:submit']/a/span"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:4:AP1:tt1:okWarningDialog"));

		clickElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_workforce_management_workforce_structures:0:MAt3:4:AP1:tt1:okConfirmationDialog"));

	}

	public static void run(int iterations) throws Exception{
		initComponent();
		for(int i=0;i<iterations;i++)
		{
			iteration=i;
			popluateParams(CreatingGradesITC.class);
			run();
		}
	}

}
